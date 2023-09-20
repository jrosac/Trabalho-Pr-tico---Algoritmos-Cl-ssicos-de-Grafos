import java.util.*;

public class Grafo {
    private int numVertices;
    private List<Vertice> vertices;
    private int numArestas;
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

    public void adicionarVertice(int indice, String rotulo, int distancia) {

        vertices.add(new Vertice(indice, rotulo, distancia));
    }


    public void removerVertice(String rotulo) {
        if (getNumVertices() > 1) {

            List<Aresta> arestasremovidas = new ArrayList<>();

            for (int i = 0; i < arestas.size(); i++) {

                if ((Objects.equals(arestas.get(i).getVertice1().getRotulo(), rotulo)) || (Objects.equals(arestas.get(i).getVertice2().getRotulo(), rotulo))) {
                    arestasremovidas.add(arestas.get(i));
                }
            }
            for (Aresta aresta : arestasremovidas) {
                arestas.remove(aresta);
                numArestas--;
            }

            for (int i = 0; i < vertices.size(); i++) {
                while (vertices.get(i).removeVerticeVizinho(getVertice(rotulo)));

            }
        }
        vertices.remove(getVertice(rotulo));
        numVertices--;
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

    public void adicionarAresta(int origem, int destino) {
        if (origem == destino) {
            getVertice(origem).addVerticeVizinho(getVertice(destino));
        } else {
            getVertice(origem).addVerticeVizinho(getVertice(destino));
            getVertice(destino).addVerticeVizinho(getVertice(origem));
        }
        arestas.add(new Aresta(getVertice(origem), getVertice(destino)));
        numArestas++;
    }

    public void adicionarAresta(int origem, int destino, String rotulo) {
        if (origem == destino) {
            getVertice(origem).addVerticeVizinho(getVertice(destino));
        } else {
            getVertice(origem).addVerticeVizinho(getVertice(destino));
            getVertice(destino).addVerticeVizinho(getVertice(origem));
        }
        arestas.add(new Aresta(getVertice(origem), getVertice(destino), rotulo));
        numArestas++;
    }

    public void removerAresta(int origem, int destino) {
        getVertice(origem).removeVerticeVizinho(getVertice(destino));
        getVertice(destino).removeVerticeVizinho(getVertice(origem));

        int marcador = -1;
        for (int i = 0; i < arestas.size(); i++) {
            if (arestas.get(i).getVertice1().getIndice() == origem && arestas.get(i).getVertice2().getIndice() == destino) {
                marcador = i;
                break;
            }
        }
        arestas.remove(marcador);
        numArestas--;
    }

    public void removerAresta(String rotulo) {
        int origem = -1;
        int destino = -1;
        for (Aresta aresta : arestas) {
            if (Objects.equals(aresta.getRotulo(), rotulo)) {
                origem = aresta.getVertice1().getIndice();
                destino = aresta.getVertice2().getIndice();
                arestas.remove(aresta);
                break;
            }
        }
        if (origem == -1 || destino == -1) {
            throw new IllegalArgumentException("Aresta nao existe.");
        } else {
            getVertice(origem).removeVerticeVizinho(getVertice(destino));
            getVertice(destino).removeVerticeVizinho(getVertice(origem));
        }

        numArestas--;
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

    public Passeio criarPasseioVertice(List<Vertice> verticesPasseio) {

        int saida = 0;
        for (Vertice verticePasseio : verticesPasseio) {
            if (Objects.equals(vertices.get(saida).getRotulo(), verticePasseio.getRotulo()) || vertices.get(saida).getRotulo().equals(verticePasseio.getRotulo())) {
                saida++;
            }
        }
        // teste para saber se os vertices passados estao contidos no grafo
        if (saida == verticesPasseio.size()) {
            List<Aresta> arestasPasseio = new ArrayList<>();

            for (Vertice vertice : verticesPasseio) {
                for (Aresta aresta : arestas) {
                    if ((Objects.equals(aresta.getVertice1().getRotulo(), vertice.getRotulo())) || (Objects.equals(aresta.getVertice2().getRotulo(), vertice.getRotulo()))) {
                        arestasPasseio.add(aresta);
                    }
                }
            }
            return new Passeio(arestasPasseio, arestasPasseio.size());
        } else {
            System.out.println("Passeio com Vertices Invalidos");
            return new Passeio();
        }
    }

    public Passeio criarPasseioAresta(List<Aresta> arestasPasseio) {

        int saida = 0;
        for (Aresta arestaPasseio : arestasPasseio) {
            if ((Objects.equals(arestas.get(saida).getVertice1().getRotulo(), arestaPasseio.getVertice1().getRotulo())) || (Objects.equals(arestas.get(saida).getVertice1().getRotulo(), arestaPasseio.getVertice2().getRotulo()))) {
                saida++;
            }
        }
        if (saida == arestasPasseio.size()) {
            return new Passeio(arestasPasseio, arestasPasseio.size());
        } else {
            System.out.println("Passeio com Vertices Invalidos");
            return new Passeio();
        }
    }

    static int[] dijkstra(int v,int s) {
        HashMap<Integer, Vertice> map = new HashMap<>();
        PriorityQueue<Vertice> q = new PriorityQueue<>();

        map.put(s,new Vertice(s,0));
        q.add(new Vertice(s,0));

        while (!q.isEmpty()) {
            
        }
    }

}