import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {

        Grafo grafo1 = new Grafo(5, false);

        grafo1.adicionarVertice(1, "v1");
        grafo1.adicionarVertice(2, "v2");
        grafo1.adicionarVertice(3, "v3");
        grafo1.adicionarVertice(4, "v4");
        grafo1.adicionarVertice(5, "v5");

        grafo1.adicionarAresta(1,2,"a");
        grafo1.adicionarAresta(2,3,"b");
        grafo1.adicionarAresta(3,4,"c");
        grafo1.adicionarAresta(4,5,"d");

        System.out.println("Grafo 1:");
        grafo1.imprimirGrafo();

        List<Aresta> passeioAresta = new ArrayList<>();

        passeioAresta.add(new Aresta(grafo1.getVertice(1), grafo1.getVertice(2), "a"));
        passeioAresta.add(new Aresta(grafo1.getVertice(2), grafo1.getVertice(3), "b"));
        passeioAresta.add(new Aresta(grafo1.getVertice(3), grafo1.getVertice(4), "c"));
        passeioAresta.add(new Aresta(grafo1.getVertice(4), grafo1.getVertice(5), "d"));

        Passeio passeio1 = new Passeio(passeioAresta, 4);

        System.out.println("Exercicio 5.2 ");
        grafo1.criarPasseioAresta(passeioAresta).imprimirPasseio();

        System.out.println("\nExercicio 5.3 ");
        grafo1.criarPasseioAresta(passeioAresta).inverterPasseio();

        System.out.println("\nExercicio 5.4 ");
        System.out.println("\ni = 0\nj = 2");
        passeio1.obterSecaoPasseio(0, 2).imprimirPasseio();

        System.out.println("\ni = 1\nj = 2");
        passeio1.obterSecaoPasseio(1, 2).imprimirPasseio();

        System.out.println("\ni = 2\nj = 3");
        passeio1.obterSecaoPasseio(2, 3).imprimirPasseio();

        System.out.println("\nExercicio 5.5 e 5.6\nNossa funcao sempre gera um caminho e todo caminho e' um passeio ");

        Grafo grafo2 = new Grafo(5, false);

        grafo2.adicionarVertice(1, "v1");
        grafo2.adicionarVertice(2, "v2");
        grafo2.adicionarVertice(3, "v3");
        grafo2.adicionarVertice(4, "v4");
        grafo2.adicionarVertice(5, "v5");

        grafo2.adicionarAresta(1, 2, "a1");
        grafo2.adicionarAresta(2, 3, "a2");
        grafo2.adicionarAresta(3, 4, "a3");
        grafo2.adicionarAresta(4, 5, "a4");
        grafo2.adicionarAresta(5, 1, "a5");
        grafo2.adicionarAresta(5, 2, "a6");
        grafo2.adicionarAresta(4, 2, "a7");

        System.out.println("\nv = 1\nx = 4");
        grafo2.buscaEmProfundidade(1, 4).imprimirPasseio();

        System.out.println("\nv = 5\nx = 1");
        grafo2.buscaEmProfundidade(5, 1).imprimirPasseio();

        System.out.println("\nExercicio 5.7\nGrafo triangulo");

        Grafo grafo3 = new Grafo(3, false);
        grafo3.adicionarVertice(1,"v1");
        grafo3.adicionarVertice(2,"v2");
        grafo3.adicionarVertice(3,"v3");

        grafo3.adicionarAresta(1,2);
        grafo3.adicionarAresta(2,3);
        grafo3.adicionarAresta(3,1);

        grafo3.acharCiclo(1,2).imprimirPasseio();
        grafo3.acharCiclo(2,2).imprimirPasseio();
        grafo3.acharCiclo(3,3).imprimirPasseio();

        System.out.println("\nExercicio 5.8");
        System.out.println("\nGrafo 6 :");
        Grafo grafo6 = new Grafo(4, false);

        grafo6.adicionarVertice(1, "v1");
        grafo6.adicionarVertice(2, "v2");
        grafo6.adicionarVertice(3, "v3");
        grafo6.adicionarVertice(4, "v4");

        grafo6.adicionarAresta(1,2,"a");
        grafo6.adicionarAresta(1,3,"b");
        grafo6.adicionarAresta(1,4,"g");

        grafo6.adicionarAresta(2,3,"c");
        grafo6.adicionarAresta(2,4,"d");
        grafo6.adicionarAresta(3,4,"d");

        grafo6.imprimirGrafo();

        System.out.println("1 -> 4");
        grafo6.encontrarCiclo2(1,4).imprimirPasseio();
        System.out.println("1 -> 3");
        grafo6.encontrarCiclo2(1,3).imprimirPasseio();
        System.out.println("2 -> 4");
        grafo6.encontrarCiclo2(2,4).imprimirPasseio();
        System.out.println("3 -> 4");
        grafo6.encontrarCiclo2(3,4).imprimirPasseio();
        System.out.println("4 -> 2");
        grafo6.encontrarCiclo2(4,2).imprimirPasseio();
        System.out.println("4 -> 3");
        grafo6.encontrarCiclo2(4,3).imprimirPasseio();

        System.out.println("\nExercicio 5.9\nFeita!");

        System.out.println("\nExercicio 5.10");
        System.out.println("\nGrafo 4: ");

        Grafo grafo4 = new Grafo(6,false);
        grafo4.adicionarVertice(1,"v1");
        grafo4.adicionarVertice(2,"v2");
        grafo4.adicionarVertice(3,"v3");
        grafo4.adicionarVertice(4,"v4");
        grafo4.adicionarVertice(5,"v5");
        grafo4.adicionarVertice(6,"v6");

        grafo4.adicionarAresta(1,2,"a");
        grafo4.adicionarAresta(2,3,"b");
        grafo4.adicionarAresta(3,1,"c");

        grafo4.adicionarAresta(4,5,"d");
        grafo4.adicionarAresta(5,6,"e");
        grafo4.adicionarAresta(6,4,"f");

        grafo4.imprimirGrafo();
        System.out.println("Compnentes Grafo 4: ");
        grafo4.componentes();

        System.out.println("\n\nExercicio 5.11");

        Grafo grafo5 = new Grafo(4,false);
        grafo5.adicionarVertice(1,"v1");
        grafo5.adicionarVertice(2,"v2");
        grafo5.adicionarVertice(3,"v3");
        grafo5.adicionarVertice(4,"v4");

        grafo5.adicionarAresta(1,2,"a");
        grafo5.adicionarAresta(2,3,"b");
        grafo5.adicionarAresta(3,4,"c");

        if(grafo3.naoContemCircuitos())
        {
            System.out.println("O Grafo 3 nao contem circuitos");
        }
        if(!grafo3.naoContemCircuitos())
        {
            System.out.println("O Grafo 3 contem circuitos");
        }
        System.out.println("\nGrafo 5: ");
        grafo5.imprimirGrafo();
        if(grafo5.naoContemCircuitos())
        {
            System.out.println("O Grafo 5 nao contem circuitos");
        }
        if(!grafo5.naoContemCircuitos())
        {
            System.out.println("O Grafo 5 contem circuitos");
        }

        System.out.println("\nExercicio 5.12 ");
        System.out.println("Grafo 3: ");
        grafo3.imprimirGrafo();
        if (grafo3.isConexo()) {
            System.out.println("O grafo 3 e' conexo");
        }
        if (!grafo3.isConexo()) {
            System.out.println("O grafo 3 nao e' conexo");
        }
        System.out.println("\nGrafo 2: ");
        grafo2.imprimirGrafo();
        if (grafo2.isConexo()) {
            System.out.println("O Grafo 2 e' conexo");
        }
        if (!grafo2.isConexo()) {
            System.out.println("O Grafo 2 nao e' conexo");
        }
    }
}