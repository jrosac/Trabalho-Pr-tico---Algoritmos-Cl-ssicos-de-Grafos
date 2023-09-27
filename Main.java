public class Main
{
    public static void main(String[] args) {
        Grafo grafo1 = new Grafo(9);

        grafo1.adicionarVertice(1,"Aracaju, SE");
        grafo1.adicionarVertice(2,"Barra dos Coqueiros, SE");
        grafo1.adicionarVertice(3,"Salvador, BA");
        grafo1.adicionarVertice(4,"3");
        grafo1.adicionarVertice(5,"4");
        grafo1.adicionarVertice(6,"5");
        grafo1.adicionarVertice(7,"6");
        grafo1.adicionarVertice(8,"7");
        grafo1.adicionarVertice(9,"8");

        grafo1.adicionarAresta(1,3,336); // aju - salvador
        grafo1.adicionarAresta(1,2,9); // aju - barra
        grafo1.adicionarAresta(3,4,7);
        grafo1.adicionarAresta(4,5,9);
        grafo1.adicionarAresta(5,6,10);
        grafo1.adicionarAresta(6,7,2);
        grafo1.adicionarAresta(6,3,4);
        grafo1.adicionarAresta(6,4,14);
        grafo1.adicionarAresta(7,8,1);
        grafo1.adicionarAresta(8,1,8);
        grafo1.adicionarAresta(8,2,11);
        grafo1.adicionarAresta(9,8,7);
        grafo1.adicionarAresta(9,7,6);
        grafo1.adicionarAresta(9,3,2);


        grafo1.dijkstra(grafo1.criarMatrizDePesos(), 0);




        //grafo1.dijkstra(1);






    }
}