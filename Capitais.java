public class Capitais
{
    public static void main(String[] args) {
        Grafo grafo1 = new Grafo(27);

        grafo1.adicionarVertice(1 , "Aracaju,SE");                 // 1
        grafo1.adicionarVertice(2 , "Salvador,BA");                // 2
        grafo1.adicionarVertice(3 , "Maceio,AL");                  // 3
        grafo1.adicionarVertice(4 , "Recife,PE");                  // 4
        grafo1.adicionarVertice(5 , "Joao Pessoa,PB");             // 5
        grafo1.adicionarVertice(6 , "Natal,RN");                   // 6
        grafo1.adicionarVertice(7 , "Fortaleza,CE");               // 7
        grafo1.adicionarVertice(8 , "Teresina,PI");                // 8
        grafo1.adicionarVertice(9 , "Sao Luis,MA");                // 9
        grafo1.adicionarVertice(10, "Palmas,TO");                  // 10
        grafo1.adicionarVertice(11, "Goiania,GO");                 // 11
        grafo1.adicionarVertice(12, "Belo Horizonte,MG");          // 12
        grafo1.adicionarVertice(13, "Vitoria,ES");                 // 13
        grafo1.adicionarVertice(14, "Rio de Janeiro,RJ");          // 14
        grafo1.adicionarVertice(15, "Sao Paulo,SP");               // 15
        grafo1.adicionarVertice(16, "Curitiba,PR");                // 16
        grafo1.adicionarVertice(17, "Florianopolis,SC");           // 17
        grafo1.adicionarVertice(18, "Porto Alegre,RS");            // 18
        grafo1.adicionarVertice(19, "Campo Grande,MS");            // 19
        grafo1.adicionarVertice(20, "Cuiaba,MT");                  // 20
        grafo1.adicionarVertice(21, "Porto Velho,RO");             // 21
        grafo1.adicionarVertice(22, "Rio Branco,AC");              // 22
        grafo1.adicionarVertice(23, "Manaus,AM");                  // 23
        grafo1.adicionarVertice(24, "Boa Vista,RR");               // 24
        grafo1.adicionarVertice(25, "Macapa,AP");                  // 25
        grafo1.adicionarVertice(26, "Belem,PA");                   // 26
        grafo1.adicionarVertice(27, "Brasilia,DF");                // 27

        grafo1.adicionarAresta(1 ,2 ,310);  //        Aracaju 1 - Salvador 2
        grafo1.adicionarAresta(1 ,3 ,270);  //        Aracaju 1 - Maceio   3
        grafo1.adicionarAresta(3 ,4 ,250);  //         Maceio 3 - Recife   4
        grafo1.adicionarAresta(4 ,5 ,110);  //         Recife 4 - Joao Pessoa 5
        grafo1.adicionarAresta(5 ,6 ,180);  //    Joao Pessoa 5 - Natal 6
        grafo1.adicionarAresta(6 ,7 ,500);  //          Natal 6 - Fortaleza 7
        grafo1.adicionarAresta(7 ,8 ,600);  //      Fortaleza 7 - Teresina 8
        grafo1.adicionarAresta(8 ,9 ,400);  //       Teresina 8 - Sao Luis 9
        grafo1.adicionarAresta(9 ,26,570);  //       Sao Luis 9 - Belem 26
        grafo1.adicionarAresta(25,26,500);  //        Macapa 25 - Belem 26
        grafo1.adicionarAresta(23,26,3000); //         Belem 26 - Manaus 23
        grafo1.adicionarAresta(26,10,1200); //         Belem 26 - Palmas 10
        grafo1.adicionarAresta(23,24,780);  //        Manaus 23 - Boa Vista 24
        grafo1.adicionarAresta(21,23,880);  //   Porto Velho 21 - Manaus 23
        grafo1.adicionarAresta(21,22,500);  //   Porto Velho 21 - Rio Branco 22
        grafo1.adicionarAresta(27,11,200);  //      Brasilia 27 - Goiania 11
        grafo1.adicionarAresta(27,10,820);  //      Brasilia 27 - Palmas  10
        grafo1.adicionarAresta(27,12,730);  //      Brasilia 27 - Belo Horizonte 12
        grafo1.adicionarAresta(20,11,890);  //        Cuiaba 20 - Goiania 11
        grafo1.adicionarAresta(20,19,700);  //        Cuiaba 20 - Campo Grande  19
        grafo1.adicionarAresta(20,21,1400); //        Cuiaba 20 - Porto Velho 21
        grafo1.adicionarAresta(16,19,970);  //      Curitiba 16 - Campo Grande  19
        grafo1.adicionarAresta(16,17,300);  //      Curitiba 16 - Florianopolis 17
        grafo1.adicionarAresta(18,17,460);  //  Porto Alegre 18 - Florianopolis 17
        grafo1.adicionarAresta(16,15,400);  //      Curitiba 16 - Sao Paulo 15
        grafo1.adicionarAresta(14,15,440);  //Rio de Janeiro 14 - Sao Paulo 15
        grafo1.adicionarAresta(14,12,440);  //Rio de Janeiro 14 - Belo Horizonte 12
        grafo1.adicionarAresta(13,12,510);  //       Vitoria 13 - Belo Horizonte 12
        grafo1.adicionarAresta(13,2 ,1100); //       Vitoria 13 - Salvador 2

        grafo1.dijkstra(grafo1.criarMatrizDePesos(), 26);
        grafo1.imprimirGrafo();


    }
}