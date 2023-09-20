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
    public void adicionarVertice(int indice, String rotulo) {

        vertices.add(new Vertice(indice, rotulo));
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
    public void adicionarAresta(int origem, int destino, String rotulo, int peso) {
        if (origem == destino) {
            getVertice(origem).addVerticeVizinho(getVertice(destino));
        } else {
            getVertice(origem).addVerticeVizinho(getVertice(destino));
            getVertice(destino).addVerticeVizinho(getVertice(origem));
        }
        arestas.add(new Aresta(getVertice(origem), getVertice(destino), rotulo, peso));
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
/*
    public int[] dijkstra(int v, int s) {

        HashMap<Integer, Vertice> map = new HashMap<>();
        PriorityQueue<Vertice> q = new PriorityQueue<>(Comparator.comparingInt(o ->o.getIndice()));

        map.put(s, new Vertice(s,0));
        q.add(new Vertice(s,0));

        while (!q.isEmpty()) {
            Vertice vertice = q.poll();
            int i = vertice.getIndice();
            int distance = vertice.getDistancia();
            vertice.setFlag(true);

            List<Vertice> listaAdjunta = getVertice(v).verticesVizinhos();

            for (Vertice vertex : listaAdjunta) {
                if(!vertex.getFlag()) {
                    if(!map.containsKey(vertex.getIndice())) {
                        map.put(vertice.getIndice(), new Vertice(v,distance+vertex.getDistancia()));
                    }
                    else {
                        Vertice sn = map.get(vertex.getIndice());
                        if (distance + vertex.getDistancia() < sn.getDistancia()) {
                            sn.setIndice(v);
                            sn.setDistancia(distance+vertex.getDistancia());
                        }
                    }
                    q.add(new Vertice(vertex.getIndice(),distance+vertex.getDistancia()));
                }
            }
        }
        int[] result = new int[getNumVertices()];
        for (int i = 0; i < getNumVertices(); i++) {
            result[i] = map.get(i).getDistancia();
        }
        return result;
    }
    static class Pair implements Comparable <Pair> {
        Vertice vertice;
        int pesoAteAgora;
        Pair(Vertice vertice, int peso) {
            this.vertice = vertice;
            this.pesoAteAgora = peso;
        }
        public int compareTo(Pair o) {
            return this.pesoAteAgora - o.pesoAteAgora;
        }
    }
    public void dijkstra(int vertice) {

        PriorityQueue<Pair> prioquie = new PriorityQueue<>();
        prioquie.add(new Pair(getVertice(vertice),0));
        while (!prioquie.isEmpty()) {
            Pair topEle = prioquie.remove();
            if(topEle.vertice.getFlag()) {
                continue;
            }
            topEle.vertice.setFlag(true);
            System.out.println("Vertex :" + " " +topEle.vertice.getIndice() + " & " + "Weight so far :" + " " +topEle.pesoAteAgora);
            for (Aresta aresta : arestas) {
                if(!aresta.getVertice2().getFlag()) {
                    prioquie.add(new Pair(aresta.getVertice2(),topEle.pesoAteAgora+aresta.getPeso()));
                }
            }
        }

    }*/
    /*
    public void dijkstra(int origem) {
        int dist[];
        Set<Vertice> settled = new HashSet<>();
        PriorityQueue<Vertice> pq = new PriorityQueue<>();
        for (int i = 1; i <= getNumVertices(); i++) {

        }
    }*/


}