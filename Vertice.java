import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class Vertice
{
    private String rotulo;
    private int indice;
    private boolean flag;
    private List<Vertice> verticesVizinhos;
    int distancia;


    public Vertice(int indice, int distancia)
    {
        setIndice(indice);
        setRotulo("v"+indice);
        setFlag(false);
        this.verticesVizinhos = new ArrayList<>();
        setDistancia(distancia);

    }
    public Vertice(int indice, String rotulo, int distancia)
    {
        setIndice(indice);
        setRotulo(rotulo);
        setFlag(false);
        this.verticesVizinhos = new ArrayList<>();
        setDistancia(distancia);
    }
    public List<Vertice> verticesVizinhos(){return verticesVizinhos;}
    public String getRotulo() {
        return rotulo;
    }
    public void setRotulo(String rotulo) {
        this.rotulo = rotulo;
    }
    public int getIndice() {
        return indice;
    }
    public void setIndice(int indice) {
        this.indice = indice;
    }
    public boolean getFlag() {
        return flag;
    }
    public void setFlag(boolean flag) {
        this.flag = flag;
    }
    public boolean addVerticeVizinho(Vertice vertice) {
        return verticesVizinhos.add(vertice);
    }
    public boolean removeVerticeVizinho(Vertice vertice)
    {
        return verticesVizinhos.remove(vertice);
    }
    public Vertice getVerticeVizinho(int i) {
        return verticesVizinhos.get(i);
    }

    public int getDistancia() {return distancia;}

    public void setDistancia(int distancia) {this.distancia = distancia;}

    public int compareTo(Vertice vertice) {
        if(getDistancia() <= vertice.getDistancia()) {
            return -1;
        }
        else {
            return 1;
        }
    }
    public Vertice getVerticeVizinho(String rotulo) {
        int marcador = -1;
        for (int i = 0; i < verticesVizinhos.size(); i++) {

            if(Objects.equals(verticesVizinhos.get(i).getRotulo(), rotulo)) {
                marcador = i;
            }
        }
        if (marcador == -1) {
            throw new IllegalArgumentException("Rotulo invalido");
        }
        return verticesVizinhos.get(marcador);
    }
}
