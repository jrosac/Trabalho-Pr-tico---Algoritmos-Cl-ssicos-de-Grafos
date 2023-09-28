import java.security.interfaces.RSAKey;

public class Main
{
    public static void main(String[] args) {
        Grafo grafo1 = new Grafo(52);

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
        grafo1.adicionarVertice(31, "Curitiva,PR");                 // 16
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


        grafo1.adicionarAresta(1, 2, 196);  // Aju - Caninde de Sao Francisco
        grafo1.adicionarAresta(2, 3, 502); // Caninde de Sao Francisco - Salvador
        grafo1.adicionarAresta(3, 4, 116); // Salvador - Feira
        grafo1.adicionarAresta(4, 5, 565); // Feira de Santana - Maceio
        grafo1.adicionarAresta(5, 6, 129); // Maceio - Maragogi
        grafo1.adicionarAresta(6, 7, 135); // Maragogi - Recife
        grafo1.adicionarAresta(7, 8, 713); // Recife - Petrolina
        grafo1.adicionarAresta(8, 9, 664); // Petrolina - Campina Grande
        grafo1.adicionarAresta(9, 10, 127); // Campina Grande - Joao Pessoa
        grafo1.adicionarAresta(10, 11, 181); // Joao Pessoa - Natal
        grafo1.adicionarAresta(11, 12, 282); // Natal - Mossoro
        grafo1.adicionarAresta(12, 13, 238); // Mossoro - Fortaleza
        grafo1.adicionarAresta(13, 14, 493); // Fortaliza - Juazeiro do Norte
        grafo1.adicionarAresta(14, 15, 590); // Juazeiro do Norte - Teresina
        grafo1.adicionarAresta(15, 16, 338); // Teresina - Parnaiba

        grafo1.adicionarAresta(16, 17, 440); // Parnaiba - Sao Luis
        grafo1.adicionarAresta(17, 18, 800); // Sao Luis - Balsas
        grafo1.adicionarAresta(18, 19, 600); // Balsas - Palmas
        grafo1.adicionarAresta(19, 20, 380); // Palmas - Araguaina
        grafo1.adicionarAresta(20, 21, 1140); // Araguaina - Goiania
        grafo1.adicionarAresta(21, 22, 230); // Goiania - Rio Verde
        grafo1.adicionarAresta(22, 23, 870); // Rio Verde - Belo Horizonte
        grafo1.adicionarAresta(23, 24, 440); // Belo Horizonte - Pocos de Caldas
        grafo1.adicionarAresta(24, 25, 900); // Pocos de Caldas - Vitoria
        grafo1.adicionarAresta(25, 26, 130); // Vitoria - Linhares
        grafo1.adicionarAresta(26, 27, 340); // Linhares - Rio de Janeiro
        grafo1.adicionarAresta(27, 28, 150); // Rio de Janeiro - Cabo Frio
        grafo1.adicionarAresta(28, 29, 570); // Cabo Frio - Sao Paulo
        grafo1.adicionarAresta(29, 30, 230); // Sao Paulo - Sao Carlos
        grafo1.adicionarAresta(30, 31, 540); // Sao Carlos - Curitiba
        grafo1.adicionarAresta(31, 32, 420); // Curitiba - Maringa
        grafo1.adicionarAresta(32, 33, 610); // Maringa - Chapeco
        grafo1.adicionarAresta(33, 34, 550); // Chapeco - Florianopolis
        grafo1.adicionarAresta(34, 35, 460); // Florianopolis - Porto Alegre
        grafo1.adicionarAresta(35, 36, 260); // Porto Alegre - Pelotas
        grafo1.adicionarAresta(36, 37, 1500); // Pelotas - Campo Grande
        grafo1.adicionarAresta(37, 38, 310); // Campo Grande - Ponta Pora
        grafo1.adicionarAresta(38, 39, 1000); // Ponta Pora - Cuiaba
        grafo1.adicionarAresta(39, 40, 480); // Cuiaba - Sinop
        grafo1.adicionarAresta(40, 41, 1400); // Sinop - Porto Velho
        grafo1.adicionarAresta(41, 42, 480); // Porto Velho - Cacoal
        grafo1.adicionarAresta(42, 43, 980); // Cacoal - Rio Branco
        grafo1.adicionarAresta(43, 44, 630); // Rio Branco - Cruzeiro do Sul
        grafo1.adicionarAresta(44, 45, 2000); // Cruzeiro do Sul - Manaus
        grafo1.adicionarAresta(45, 46, 270); // Manaus - Itacoatiara
        grafo1.adicionarAresta(46, 47, 970); // Itacoatiara - Boa Vista
        grafo1.adicionarAresta(47, 48, 140); // Boa Vista - Caracarai
        grafo1.adicionarAresta(48, 49, 2410); // Caracarai - Macapa
        grafo1.adicionarAresta(49, 50, 580); // Macapa - Oiapoque
        grafo1.adicionarAresta(50, 51, 1100); // Oiapoque - Belem
        grafo1.adicionarAresta(51, 52, 1230); // Belem - Santarem
        grafo1.adicionarAresta(52, 1,  2730);  // Santarem - Aracaju


        grafo1.imprimirGrafo();


        grafo1.dijkstra(grafo1.criarMatrizDePesos(), 0);


    }
}