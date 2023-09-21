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
    public int menorDistancia(int listaDeDeistancias[]) {
        int min = Integer.MAX_VALUE;
        int min_index = -1;
        for (int i = 0; i < getNumVertices(); i++) {
            if(!getVertice(i+1).getFlag() && listaDeDeistancias[i] <= min) {
                min = listaDeDeistancias[i];
                min_index = i;
            }
        }
        return min_index;
    }
    public void printSolution(int dist[])
    {
        System.out.println(
                "Vertex  Distance from Source");
        for (int i = 0; i < getNumVertices(); i++)
            System.out.println(i + "  " + dist[i]);
    }
    public void dijkstra(int origem) {
        int listaDeDistancias[] = new int[getNumVertices()];

        for (int i = 0; i < getNumVertices(); i++) {
            listaDeDistancias[i] = Integer.MAX_VALUE;
            getVertice(i+1).setFlag(false);
        }
        listaDeDistancias[origem-1] = 0;
        for (int i = 0; i < getNumVertices()-1; i++) {

            int u = menorDistancia(listaDeDistancias);
            getVertice(u+1).setFlag(true);

            for (int v = 0; v < getNumVertices(); v++) {
                if (!getVertice(v+1).getFlag()
                    && getVertice(u+1).getDistancias().get(v) != 0
                    && listaDeDistancias[u] != Integer.MAX_VALUE
                    && listaDeDistancias[u] + getVertice(u+1).getDistancias().get(v) < listaDeDistancias[u]
                    ){
                    listaDeDistancias[v] = listaDeDistancias[u] + getVertice(u+1).getDistancias().get(v);
                }
            }
        }
        printSolution(listaDeDistancias);
    }



}