import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class Vertice
{
    private String rotulo;
    private int indice;
    private boolean flag;
    private List<Integer> distancias;
    private List<Vertice> verticesVizinhos;

    public Vertice(int indice)
    {
        setIndice(indice);
        setRotulo("v"+indice);
        setFlag(false);
        this.verticesVizinhos = new ArrayList<>();
        this.distancias = new ArrayList<>();

    }
    public Vertice(int indice, String rotulo)
    {
        setIndice(indice);
        setRotulo(rotulo);
        setFlag(false);
        this.verticesVizinhos = new ArrayList<>();
        this.distancias = new ArrayList<>();
    }
    public List<Vertice> verticesVizinhos(){return verticesVizinhos;}
    public String getRotulo() {
        return rotulo;
    }
    public String getCidade() {
        if (rotulo.contains(" ") && rotulo.length()>17) {
            return rotulo.split(" ")[0];
        }
        else {
            return rotulo.substring(0, rotulo.length()-3);
        }
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

    public boolean addDistancia(int distancia) {
        return distancias.add(distancia);
    }
    public boolean setDistancia(int posicao, int distancia) {
        if(posicao >= 1) {
            getDistancias().set(posicao-1, distancia);
            return true;
        }
        return false;
    }
    public List<Integer> getDistancias() {return distancias;}
    public void setDistancias(List<Integer> distancias) {this.distancias = distancias;}
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
