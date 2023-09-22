import java.util.*;

public class Grafo {
    private int numVertices;
    private int numArestas;
    private List<Vertice> vertices;
    private List<Aresta> arestas;

    public Grafo(int numVertices) {
        this.numArestas = 0;
        this.numVertices = numVertices;
        arestas = new ArrayList<>();
        vertices = new ArrayList<>();
    }

    public int getNumVertices() {
        return numVertices;
    }

    public int getNumArestas() {
        return numArestas;
    }

    public void adicionarVertice(int indice, String rotulo) {

        vertices.add(new Vertice(indice, rotulo));
        for (int i = 0; i < getNumVertices(); i++) {
            getVertice(indice).addDistancia(0);
        }

    }
    public List<Vertice> getVertices() {
        return vertices;
    }

    public Vertice getVertice(int i) {
        return vertices.get(i - 1);
    }

    public Vertice getVertice(String rotulo) {
        int marcador = -1;
        for (int i = 0; i < getNumVertices(); i++) {
            if (Objects.equals(vertices.get(i).getRotulo(), rotulo)) {
                marcador = i;
            }
        }
        return vertices.get(marcador);
    }
    public int[][] criarMatrizDePesos() {
        int matrixDePesos[][] = new int[getNumVertices()][getNumVertices()];
        for (int linhas = 0; linhas < getNumVertices(); linhas++) {
            for (int colunas = 0; colunas < getNumVertices(); colunas++) {
                matrixDePesos[linhas][colunas] = getVertice(linhas+1).getDistancias().get(colunas);
                System.out.print(matrixDePesos[linhas][colunas] +" ");
            }
            System.out.println();
        }
        return matrixDePesos;
    }
    public boolean saoVizinhos(int vertice1, int vertice2) {
        for (Vertice vertice : getVertice(vertice1).verticesVizinhos()) {
            if(vertice.getIndice() == vertice2) {
                return true;
            }
        }
        return false;
    }

    public void imprimirVertice(int i) {
        System.out.println(getVertices().get(i-1).getIndice());
        System.out.println(getVertices().get(i-1).getRotulo());
    }

    public void adicionarAresta(int origem, int destino, int peso) {
        if (origem == destino) {
            getVertice(origem).addVerticeVizinho(getVertice(destino));
        } else {
            getVertice(origem).addVerticeVizinho(getVertice(destino));
            getVertice(origem).setDistancia(destino, peso);
            getVertice(destino).addVerticeVizinho(getVertice(origem));
            getVertice(destino).setDistancia(origem, peso);
        }
        arestas.add(new Aresta(getVertice(origem), getVertice(destino), peso));
        numArestas++;
    }

    public void adicionarAresta(int origem, int destino, String rotulo, int peso) {
        if (origem == destino) {
            getVertice(origem).addVerticeVizinho(getVertice(destino));
        } else {
            getVertice(origem).addVerticeVizinho(getVertice(destino));
            getVertice(origem).setDistancia(destino,peso);
            getVertice(destino).addVerticeVizinho(getVertice(origem));
            getVertice(destino).setDistancia(origem, peso);
        }
        arestas.add(new Aresta(getVertice(origem), getVertice(destino), rotulo,peso));
        numArestas++;
    }
    
    public void imprimirGrafo() {
        System.out.println("Numero de vertices: " + getNumVertices());
        System.out.println("Numero de arestas: " + getNumArestas() + "\n");

        System.out.println("Estrutura de dados: \nLista de Adjacencia\n");

        for (int x = 0; x < getNumVertices(); x++) {
            System.out.print("Vertice "+ vertices.get(x).getRotulo() + ": ");
            for (Vertice vertice : vertices.get(x).verticesVizinhos()) {
                System.out.print(vertice.getRotulo() + " ");
            }

            System.out.println();
        }
        if (numArestas > 0) {
            System.out.println("\nArestas: ");
            for (Aresta aresta : arestas) {
                aresta.getAresta(aresta);
            }
        }
        System.out.println();
    }
    /*
    public int menorDistancia(int origem) {
        int menor = Integer.MAX_VALUE;
        int indice_ListaDeDistancias = -1;
        List<Integer> listaDeDistacias = getVertice(origem).getDistancias();
        for(int i = 0; i < listaDeDistacias.size(); i++) {
            if (!getVertice(i+1).getFlag() && (listaDeDistacias.get(i) != 0) && listaDeDistacias.get(i) < menor) {
                menor = listaDeDistacias.get(i);
                indice_ListaDeDistancias = i;
            }
        }
        return indice_ListaDeDistancias;
    }

    public void dijkstra(int origem) {
        int listaDeDistancias[] = new int[getNumVertices()+2];

        for (int i = 0; i < getNumVertices(); i++) {
            listaDeDistancias[i]=Integer.MAX_VALUE;
            getVertice(i+1).setFlag(false);
        }
        listaDeDistancias[origem] = 0;
        for (int count = 0; count < getNumVertices(); count++) {
            int u = menorDistancia();
        }

    }*/
    public int minDistance(int dist[], Boolean sptSet[])
    {
        // Initialize min value
        int min = Integer.MAX_VALUE, min_index = -1;

        for (int v = 0; v < getNumVertices(); v++)
            if (sptSet[v] == false && dist[v] <= min) {
                min = dist[v];
                min_index = v;
            }

        return min_index;
    }

    // A utility function to print the constructed distance
    // array
    public void printSolution(int dist[], int origem)
    {
        System.out.println(
                "Vertex \t\t Distance from Source");
        for (int i = 0; i < getNumVertices(); i++)
            System.out.println(origem+"->"+i + " \t\t " + dist[i]);
    }

    // Function that implements Dijkstra's single source
    // shortest path algorithm for a graph represented using
    // adjacency matrix representation
    public void dijkstra(int graph[][], int src)
    {
        int dist[] = new int[getNumVertices()]; // The output array.
        // dist[i] will hold
        // the shortest distance from src to i

        // sptSet[i] will true if vertex i is included in
        // shortest path tree or shortest distance from src
        // to i is finalized
        Boolean sptSet[] = new Boolean[getNumVertices()];

        // Initialize all distances as INFINITE and stpSet[]
        // as false
        for (int i = 0; i < getNumVertices(); i++) {
            dist[i] = Integer.MAX_VALUE;
            sptSet[i] = false;
        }

        // Distance of source vertex from itself is always 0
        dist[src] = 0;

        // Find shortest path for all vertices
        for (int count = 0; count < getNumVertices() - 1; count++) {
            // Pick the minimum distance vertex from the set
            // of vertices not yet processed. u is always
            // equal to src in first iteration.
            int u = minDistance(dist, sptSet);

            // Mark the picked vertex as processed
            sptSet[u] = true;

            // Update dist value of the adjacent vertices of
            // the picked vertex.
            for (int v = 0; v < getNumVertices(); v++)

                // Update dist[v] only if is not in sptSet,
                // there is an edge from u to v, and total
                // weight of path from src to v through u is
                // smaller than current value of dist[v]
                if (!sptSet[v] && graph[u][v] != 0
                        && dist[u] != Integer.MAX_VALUE
                        && dist[u] + graph[u][v] < dist[v])
                    dist[v] = dist[u] + graph[u][v];
        }

        // print the constructed distance array
        printSolution(dist,src);
    }




}