public class Main
{
    public static void main(String[] args) {
        Grafo grafo1 = new Grafo(55);

        grafo1.adicionarVertice(1, "Aracaju,SE");                   // 1
        grafo1.adicionarVertice(2, "Caninde de Sao Francisco,SE");  // 1
        grafo1.adicionarVertice(3, "Salvador,BA");                  // 2
        grafo1.adicionarVertice(4, "Feira de Santana,BA");          // 2
        grafo1.adicionarVertice(5, "Maceio,AL");                    // 3
        grafo1.adicionarVertice(6, "Maragogi,AL");                  // 3
        grafo1.adicionarVertice(7, "Recife,PE");                    // 4
        grafo1.adicionarVertice(8, "Petrolina,PE");                 // 4
        grafo1.adicionarVertice(9, "Campina Grande,PB");            // 5
        grafo1.adicionarVertice(10, "Joao Pessoa,PB");              // 5
        grafo1.adicionarVertice(11, "Natal,RN");                    // 6
        grafo1.adicionarVertice(12, "Mossoro,RN");                  // 6
        grafo1.adicionarVertice(13, "Fortaleza,CE");                // 7
        grafo1.adicionarVertice(14, "Juazeiro do Norte,CE");        // 7
        grafo1.adicionarVertice(15, "Teresina,PI");                 // 8
        grafo1.adicionarVertice(16, "Parnaiba,PI");                 // 8
        grafo1.adicionarVertice(17, "Sao Luis,MA");                 // 9
        grafo1.adicionarVertice(18, "Balsas,MA");                   // 9
        grafo1.adicionarVertice(19, "Palmas,TO");                   // 10
        grafo1.adicionarVertice(20, "Araguaina,TO");                // 10
        grafo1.adicionarVertice(21, "Goiania,GO");                  // 11
        grafo1.adicionarVertice(22, "Rio Verde,GO");                // 11
        grafo1.adicionarVertice(23, "Belo Horizonte,MG");           // 12
        grafo1.adicionarVertice(24, "Pocos de caldas,MG");          // 12
        grafo1.adicionarVertice(25, "Vitoria,ES");                  // 13
        grafo1.adicionarVertice(26, "Linhares,ES");                 // 13
        grafo1.adicionarVertice(27, "Rio de Janeiro,RJ");           // 14
        grafo1.adicionarVertice(28, "Cabo Frio,RJ");                // 14
        grafo1.adicionarVertice(29, "Sao Paulo,SP");                // 15
        grafo1.adicionarVertice(30, "Sao Carlos,SP");               // 15
        grafo1.adicionarVertice(31, "Curitiba,PR");                 // 16
        grafo1.adicionarVertice(32, "Maringa,PR");                  // 16
        grafo1.adicionarVertice(33, "Chapeco,SC");                  // 17
        grafo1.adicionarVertice(34, "Florianopolis,SC");            // 17
        grafo1.adicionarVertice(35, "Porto Alegre,RS");             // 18
        grafo1.adicionarVertice(36, "Pelotas,RS");                  // 18
        grafo1.adicionarVertice(37, "Campo Grande,MS");             // 19
        grafo1.adicionarVertice(38, "Ponta Pora,MS");               // 19
        grafo1.adicionarVertice(39, "Cuiaba,MT");                   // 20
        grafo1.adicionarVertice(40, "Sinop,MT");                    // 20
        grafo1.adicionarVertice(41, "Porto Velho,RO");              // 21
        grafo1.adicionarVertice(42, "Cacoal,RO");                   // 21
        grafo1.adicionarVertice(43, "Rio Branco,AC");               // 22
        grafo1.adicionarVertice(44, "Cruzeiro do Sul,AC");          // 22
        grafo1.adicionarVertice(45, "Manaus,AM");                   // 23
        grafo1.adicionarVertice(46, "Itacoatiara,AM");              // 23
        grafo1.adicionarVertice(47, "Boa Vista,RR");                // 24
        grafo1.adicionarVertice(48, "Caracarai,RR");                // 24
        grafo1.adicionarVertice(49, "Macapa,AP");                   // 25
        grafo1.adicionarVertice(50, "Oiapoque,AP");                 // 25
        grafo1.adicionarVertice(51, "Belem,PA");                    // 26
        grafo1.adicionarVertice(52, "Santarem,PA");                 // 26
        grafo1.adicionarVertice(53, "Brasilia,DF");                 // 27
        grafo1.adicionarVertice(54, "Vitoria da Conquista,BA");     // 2
        grafo1.adicionarVertice(55, "Montes Claros,MG");            // 12


        grafo1.adicionarAresta(1, 2, 190);  // Aracaju 1 - Caninde de Sao Francisco 2
        grafo1.adicionarAresta(1, 3, 320); // Aracaju 1 - Salvador 3
        grafo1.adicionarAresta(1, 5, 270); // Aracaju 1 - Maceio 5
        grafo1.adicionarAresta(2, 4, 380); // Caninde de Sao Francisco 2 - Feira de Santana 4
        grafo1.adicionarAresta(2, 14, 440); // Caninde de Sao Francisco 2 - Juazeiro do Norte 14
        grafo1.adicionarAresta(3, 4, 116); // Salvador 3 - Feira de Santana 4
        grafo1.adicionarAresta(3, 54, 510); // Salvador 3 - Vitoria da Conquista 54
        grafo1.adicionarAresta(4, 54, 400); // Feira de Santana 4 - Vitoria da Conquista 54
        grafo1.adicionarAresta(54, 26, 710); // Vitoria da Conquista 54 - Linhares 26
        grafo1.adicionarAresta(54, 55, 460); // Vitoria da Conquista 54 - Montes Claros 55
        grafo1.adicionarAresta(5, 6, 120); // Maceio 5 - Maragogi 6
        grafo1.adicionarAresta(6, 7, 130); // Maragogi 6 - Recife 7
        grafo1.adicionarAresta(7, 9, 200); // Recife 7 - Campina Grande 9
        grafo1.adicionarAresta(2, 8, 380); // Caninde de Sao Francisco 2 - Petrolina 8
        grafo1.adicionarAresta(9, 10, 120); // Campina Grande 9 - Joao Pessoa 10
        grafo1.adicionarAresta(10, 11, 180); // Joao Pessoa 10 - Natal 11
        grafo1.adicionarAresta(11, 12, 280); // Natal 11 - Mossoro 12
        grafo1.adicionarAresta(12, 13, 230); // Mossoro 12 - Fortaleza 13
        grafo1.adicionarAresta(13, 14, 490); // Fortaleza 13 - Juazeiro do Norte 14
        grafo1.adicionarAresta(14, 15, 590); // Juazeiro do Norte 14 - Teresina 15
        grafo1.adicionarAresta(15, 16, 330); // Teresina 15 - Parnaiba 16
        grafo1.adicionarAresta(15, 18, 570); // Teresina 15 - Balsas 18
        grafo1.adicionarAresta(8, 18, 910); // Petrolina 8 - Balsas 18
        grafo1.adicionarAresta(16, 17, 440); // Parnaiba 16 - Sao Luis 17
        grafo1.adicionarAresta(17, 15, 430); // Sao Luis 17 - Teresina 15
        grafo1.adicionarAresta(18, 20, 280); // Balsas 18 - Araguaina 20
        grafo1.adicionarAresta(19, 20, 380); // Palmas 19 - Araguaina 20
        grafo1.adicionarAresta(19, 21, 820); // Palmas 19 - Goiania 21
        grafo1.adicionarAresta(21, 22, 230); // Goiania 21 - Rio Verde 22
        grafo1.adicionarAresta(23, 25, 510); // Belo Horizonte 23 - Vitoria 25
        grafo1.adicionarAresta(23, 55, 420); // Montes Claros 55 - Belo Horizonte 23
        grafo1.adicionarAresta(55, 30, 900); // Montes Claros 55 - Sao Carlos 30
        grafo1.adicionarAresta(32, 30, 500); // Sao Carlos 30 - Maringa 32
        grafo1.adicionarAresta(33, 30, 900); // Sao Carlos 30 - Chapeco 33
        grafo1.adicionarAresta(22, 37, 610); // Rio Verde 22 - Campo Grande 37
        grafo1.adicionarAresta(23, 24, 440); // Belo Horizonte 23 - Pocos de Caldas 24
        grafo1.adicionarAresta(24, 29, 250); // Sao Paulo 29 - Pocos de Caldas 24
        grafo1.adicionarAresta(25, 26, 130); // Vitoria 25 - Linhares 26
        grafo1.adicionarAresta(26, 27, 340); // Linhares 26 - Rio de Janeiro 27
        grafo1.adicionarAresta(27, 28, 150); // Rio de Janeiro 27 - Cabo Frio 28
        grafo1.adicionarAresta(28, 29, 570); // Cabo Frio 28 - Sao Paulo 29
        grafo1.adicionarAresta(29, 30, 230); // Sao Paulo 29 - Sao Carlos 30
        grafo1.adicionarAresta(29, 31, 400); // Sao Paulo 29 - Curitiba 31
        grafo1.adicionarAresta(30, 31, 540); // Sao Carlos 30 - Curitiba 31
        grafo1.adicionarAresta(31, 32, 420); // Curitiba 31 - Maringa 32
        grafo1.adicionarAresta(31, 34, 300); // Curitiba 31 - Florianopolis 34
        grafo1.adicionarAresta(32, 33, 610); // Maringa 32 - Chapeco 33
        grafo1.adicionarAresta(33, 34, 550); // Chapeco 33 - Florianopolis 34
        grafo1.adicionarAresta(34, 35, 460); // Florianopolis 34 - Porto Alegre 35
        grafo1.adicionarAresta(35, 36, 260); // Porto Alegre 35 - Pelotas 36
        grafo1.adicionarAresta(32, 37, 550); // Maringa 32 - Campo Grande 37
        grafo1.adicionarAresta(37, 38, 310); // Campo Grande 37 - Ponta Pora 38
        grafo1.adicionarAresta(37, 39, 700); // Campo Grande 37  - Cuiaba 39
        grafo1.adicionarAresta(39, 40, 480); // Cuiaba 39 - Sinop 40
        grafo1.adicionarAresta(40, 42, 930); // Sinop 40 - Cacoal 42
        grafo1.adicionarAresta(41, 42, 480); // Porto Velho 41 - Cacoal 42
        grafo1.adicionarAresta(41, 43, 510); // Cacoal 42 - Rio Branco 43
        grafo1.adicionarAresta(43, 44, 630); // Rio Branco 43 - Cruzeiro do Sul 44
        grafo1.adicionarAresta(41, 45, 880); // Porto Velho 41 - Manaus 45
        grafo1.adicionarAresta(45, 46, 270); // Manaus 45 - Itacoatiara 46
        grafo1.adicionarAresta(40, 52, 1290); // Sinop 40 - Santarem 52
        grafo1.adicionarAresta(45, 48, 640); // Manaus 45 - Caracarai 48
        grafo1.adicionarAresta(48, 47, 140); // Boa Vista 47 - Caracarai 48
        grafo1.adicionarAresta(51, 49, 520); // Belem 51 - Macapa 49
        grafo1.adicionarAresta(51, 17, 570); // Belem 51 - Sao Luis 17
        grafo1.adicionarAresta(49, 50, 570); // Macapa 49 - Oiapoque 50
        grafo1.adicionarAresta(20, 52, 1180); // Araguaina 20 - Santarem 52
        grafo1.adicionarAresta(21, 53,  200);  // Goiania 21 - Brasilia 53
        grafo1.adicionarAresta(22, 39,  700);  // Rio Verde 22 - Cuiaba 39
        grafo1.adicionarAresta(55, 53, 580); // Montes Claros 55 - Brasilia 53

        grafo1.dijkstra(grafo1.criarMatrizDePesos(), 0);
        grafo1.imprimirGrafo();


    }
}