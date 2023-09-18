import java.util.List;
import java.util.ArrayList;

public class Vertice
{
    private String rotulo;
    private int indice;
    private int grau;
    private boolean flag;
    private List<Vertice> verticesVizinhos;
    private int profundidadeEntrada;
    private int profundidadeSaida;
    private int componente;


    public Vertice(int indice)
    {
        setIndice(indice);
        setRotulo("v"+String.valueOf(indice));
        setGrau(0);
        setFlag(false);
        this.verticesVizinhos = new ArrayList<>();
        setProfundidadeEntrada(1);
        setProfundidadeSaida(1);
        setComponente(-1);

    }
    public Vertice(int indice, String rotulo)
    {
        setIndice(indice);
        setRotulo(rotulo);
        setGrau(0);
        setFlag(false);
        this.verticesVizinhos = new ArrayList<>();
        setProfundidadeEntrada(1);
        setProfundidadeSaida(1);
        setComponente(-1);
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

    public int getGrau() {
        return grau;
    }

    public void setGrau(int grau) {
        this.grau = grau;
    }
    public void incrementarGrau() {
        this.grau++;
    }
    public void decrementarGrau() {
        this.grau--;
    }

    public boolean getFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
    public void setProfundidadeEntrada(int profundidadeEntrada) {
        this.profundidadeEntrada = profundidadeEntrada;
    }

    public void setProfundidadeSaida(int profundidadeSaida) {
        this.profundidadeSaida = profundidadeSaida;
    }
    public int getProfundidadeEntrada(){return profundidadeEntrada;}
    public int getProfundidadeSaida(){return profundidadeSaida;}

    public int getComponente() {
        return componente;
    }

    public void setComponente(int componente) {
        this.componente = componente;
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
    public Vertice getVerticeVizinho(String rotulo) {
        int marcador = -1;
        for (int i = 0; i < verticesVizinhos.size(); i++) {

            if(verticesVizinhos.get(i).getRotulo() == rotulo) {
                marcador = i;
            }
        }
        if (marcador == -1) {
            throw new IllegalArgumentException("Rotulo invalido");
        }
        return verticesVizinhos.get(marcador);
    }
}
