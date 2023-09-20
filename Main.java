import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        Grafo grafo1 = new Grafo(8);

        grafo1.adicionarVertice(1,"v1");
        grafo1.adicionarVertice(2,"v2");
        grafo1.adicionarVertice(3,"v3");
        grafo1.adicionarVertice(4,"v4");
        grafo1.adicionarVertice(5,"v5");
        grafo1.adicionarVertice(6,"v6");
        grafo1.adicionarVertice(7,"v6");

        grafo1.adicionarAresta(1,2,"a",14);
        grafo1.adicionarAresta(1,4,"b",5);

        grafo1.adicionarAresta(2,5,"c",2);
        grafo1.adicionarAresta(2,3,"d",6);

        grafo1.adicionarAresta(3,6,"e",1);
        grafo1.adicionarAresta(3,7,"f",7);

        grafo1.adicionarAresta(4,5,"g",3);

        grafo1.adicionarAresta(6,7,"h",8);

        grafo1.dijkstra(7,1);


    }
}