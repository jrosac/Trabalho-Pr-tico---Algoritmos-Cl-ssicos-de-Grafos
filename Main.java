import java.security.interfaces.RSAKey;

public class Main
{
    public static void main(String[] args) {
        Grafo grafo1 = new Grafo(50);

        grafo1.adicionarVertice(1, "Aracaju, SE");                  // 1
        grafo1.adicionarVertice(2, "Caninde de Sao Francisco, SE"); // 1
        grafo1.adicionarVertice(3, "Salvador, BA");                 // 2
        grafo1.adicionarVertice(4, "Feira de Santana, BA");         // 2
        grafo1.adicionarVertice(5, "Maceio, AL");                   // 3
        grafo1.adicionarVertice(6, "Maragogi, AL");                 // 3
        grafo1.adicionarVertice(7, "Recife, PE");                   // 4
        grafo1.adicionarVertice(8, "Petrolina, PE");                // 4
        grafo1.adicionarVertice(9, "Campina Grande, PB");           // 5
        grafo1.adicionarVertice(10,"Joao Pessoa, PB");              // 5
        grafo1.adicionarVertice(11,"Natal, RN");                    // 6
        grafo1.adicionarVertice(12,"Mossoro, RN");                  // 6
        grafo1.adicionarVertice(13,"Fortaleza, CE");                // 7
        grafo1.adicionarVertice(14,"Juazeiro do Norte, CE");        // 7
        grafo1.adicionarVertice(15,"Sao Luis, MA");                 // 8
        grafo1.adicionarVertice(16,"Balsas, MA");                   // 8
        grafo1.adicionarVertice(17,"Palmas, TO");                   // 9
        grafo1.adicionarVertice(18,"Araguaina, TO");                // 9
        grafo1.adicionarVertice(19,"Goiania, GO");                  // 10
        grafo1.adicionarVertice(20,"Rio Verde, GO");                // 10
        grafo1.adicionarVertice(21,"Sao Paulo, SP");                // 11
        grafo1.adicionarVertice(22,"Sao Carlos, SP");               // 11
        grafo1.adicionarVertice(23,"Rio de Janeiro, RJ");           // 12
        grafo1.adicionarVertice(24,"Cabo Frio, RJ");                // 12
        grafo1.adicionarVertice(25,"Vitoria, ES");                  // 13
        grafo1.adicionarVertice(26,"Linhares, ES");                 // 13
        grafo1.adicionarVertice(27,"Belo Horizonte, MG");           // 14
        grafo1.adicionarVertice(28,"Pocos de caldas, MG");          // 14
        grafo1.adicionarVertice(29,"Curitiva, PR");                 // 15
        grafo1.adicionarVertice(30,"Maringa, PR");                  // 15
        grafo1.adicionarVertice(31,"Chapeco, SC");                  // 16
        grafo1.adicionarVertice(32,"Florianopolis, SC");            // 16
        grafo1.adicionarVertice(33,"Porto Alegre, RS");             // 17
        grafo1.adicionarVertice(34,"Pelotas, RS");                  // 17
        grafo1.adicionarVertice(35,"Cuiaba, MT");                   // 18
        grafo1.adicionarVertice(36,"Sinop, MT");                    // 18
        grafo1.adicionarVertice(37,"Porto Velho, RO");              // 19
        grafo1.adicionarVertice(38,"Cacoal, RO");                   // 19
        grafo1.adicionarVertice(39,"Rio Branco, AC");               // 20
        grafo1.adicionarVertice(40,"Cruzeiro do Sul, AC");          // 20
        grafo1.adicionarVertice(41,"Manaus, AM");                   // 21
        grafo1.adicionarVertice(42,"Itacoatiara, AM");              // 21
        grafo1.adicionarVertice(43,"Boa Vista, RR");                // 22
        grafo1.adicionarVertice(44,"Caracarai, RR");                // 22
        grafo1.adicionarVertice(45,"Macapa, AP");                   // 23
        grafo1.adicionarVertice(46,"Oiapoque, AP");                 // 23
        grafo1.adicionarVertice(47,"Belem, PA");                    // 24
        grafo1.adicionarVertice(48,"Santarem, PA");                 // 24
        grafo1.adicionarVertice(49,"Teresina, PI");                 // 25
        grafo1.adicionarVertice(50,"Parnaiba, PI");                 // 25

        //
        grafo1.adicionarAresta(1 ,2 ,9);   // Aju - Caninde de Sao Francisco
        grafo1.adicionarAresta(2 ,3 ,519); // Caninde de Sao Francisco - Salvador
        grafo1.adicionarAresta(3 ,4 ,116); // Salvador - Feira
        grafo1.adicionarAresta(4 ,5 ,565); // Feira de Santana - Maceio
        grafo1.adicionarAresta(5 ,6 ,129); // Maceio - Maragogi
        grafo1.adicionarAresta(6 ,7 ,135); // Maragogi - Recife
        grafo1.adicionarAresta(7 ,8 ,713); // Recife - Petrolina
        grafo1.adicionarAresta(8 ,9 ,664); // Petrolina - Campina Grande
        grafo1.adicionarAresta(9 ,10,127); // Campina Grande - Joao Pessoa
        grafo1.adicionarAresta(10,11,181); // Joao Pessoa - Natal
        grafo1.adicionarAresta(11,12,287); // Natal - Mossoro
        grafo1.adicionarAresta(12,13,240); // Mossoro - Fortaleza
        grafo1.adicionarAresta(13,14,493); // Fortaliza - Juazeiro do Norte
        grafo1.adicionarAresta(14,15,591); // Juazeiro do Norte - Teresina
        grafo1.adicionarAresta(15,16,338); // Teresina - Parnaiba

        grafo1.imprimirGrafo();


        //grafo1.dijkstra(grafo1.criarMatrizDePesos(), 0);




        //grafo1.dijkstra(1);






    }
}