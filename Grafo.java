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
            }
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
        System.out.println("\nNumero de vertices: " + getNumVertices());
        System.out.println("Numero de arestas: " + getNumArestas() + "\n");

        System.out.println("Estrutura de dados: \n\nLista de Adjacencia");

        for (int x = 0; x < getNumVertices(); x++) {
            System.out.print(vertices.get(x).getRotulo() + " -> ");
            for (Vertice vertice : vertices.get(x).verticesVizinhos()) {
                System.out.print(vertice.getRotulo() + "  ");
            }

            System.out.println();
        }
        if (numArestas > 0) {
            System.out.println("\nLista de Distancias: ");
            for (Aresta aresta : arestas) {
                aresta.getAresta();
            }
        }
        System.out.println();
    }
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
    public void printadorCidade(int j) {
            System.out.printf("%s  %-24s",getVertice(1).getCidade(), getVertice(j + 1).getCidade());
    }
    public void printSolution(int dist[], int origem) {
        System.out.println(
                "Vertice  Distancia da Origem");
        int j = 0;
        for (int i = 0; i < getNumVertices(); i++) {

            printadorCidade(j);
            System.out.print("  " + dist[i]);
            System.out.println();
            if (i < getNumVertices() - 1) {
                j++;
            }
        }
    }

    // Função que implementa o algoritmo de caminho mais curto de Dijkstra para um grafo representado usando
// representação de matriz de adjacência
    public void dijkstra(int grafo[][], int origem)
    {
        int dist[] = new int[getNumVertices()]; // O array de saída.
        // dist[i] conterá
        // a distância mais curta de origem até i

        // sptSet[i] será verdadeiro se o vértice i estiver incluído em
        // na árvore de caminho mais curto ou a distância mais curta de origem
        // até i estiver finalizada
        Boolean sptSet[] = new Boolean[getNumVertices()];

        // Inicialize todas as distâncias como INFINITO e stpSet[]
        // como falso
        for (int i = 0; i < getNumVertices(); i++) {
            dist[i] = Integer.MAX_VALUE;
            sptSet[i] = false;
        }

        // A distância do vértice de origem para ele mesmo é sempre 0
        dist[origem] = 0;

        // Encontre o caminho mais curto para todos os vértices
        for (int count = 0; count < getNumVertices() - 1; count++) {
            // Escolha o vértice com a distância mínima do conjunto
            // de vértices ainda não processados.
            // u é sempre igual a origem na primeira iteração.
            int u = minDistance(dist, sptSet);

            // Marque o vértice escolhido como processado
            sptSet[u] = true;

            // Atualize o valor de dist dos vértices adjacentes ao
            // vértice escolhido.
            for (int v = 0; v < getNumVertices(); v++)

                // Atualize dist[v] apenas se ele não estiver em sptSet,
                // houver uma aresta de u para v, e o peso total
                // do caminho de origem para v passando por u for
                // menor que o valor atual de dist[v]
                if (!sptSet[v] && grafo[u][v] != 0
                        && dist[u] != Integer.MAX_VALUE
                        && dist[u] + grafo[u][v] < dist[v])
                    dist[v] = dist[u] + grafo[u][v];
        }

        // imprima o array de distância construído
        printSolution(dist, origem);
    }



}