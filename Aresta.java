public class Aresta
{
    private Vertice vertice1;
    private Vertice vertice2;
    private String rotulo;
    private int peso;
    public Aresta(Vertice vertice1, Vertice vertice2)
    {
        setVertice1(vertice1);
        setVertice2(vertice2);
        setPeso(0);
    }
    public Aresta(Vertice vertice1, Vertice vertice2, String rotulo)
    {
        setVertice1(vertice1);
        setVertice2(vertice2);
        setRotulo(rotulo);
        setPeso(0);
    }
    public Aresta(Vertice vertice1, Vertice vertice2, int peso)
    {
        setVertice1(vertice1);
        setVertice2(vertice2);
        setPeso(peso);
    }
    public Aresta(Vertice vertice1, Vertice vertice2, String rotulo, int peso)
    {
        setVertice1(vertice1);
        setVertice2(vertice2);
        setRotulo(rotulo);
        setPeso(peso);
    }


    public Vertice getVertice1() {
        return vertice1;
    }
    public Vertice getVertice2() {
        return vertice2;
    }
    public String getRotulo() {return rotulo;}
    public void setVertice1(Vertice vertice1) {
        this.vertice1 = vertice1;
    }
    public void setVertice2(Vertice vertice2) {
        this.vertice2 = vertice2;
    }

    public void setRotulo(String rotulo) {this.rotulo = rotulo;}

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void getAresta()
    {
        if(rotulo == null) {
            System.out.println(getRotulo()+" "+"("+getVertice1().getRotulo()+" - "+getVertice2().getRotulo()+")"+" Dist: "+getPeso()+"km");
        }
        else{
            System.out.println(getRotulo()+" "+"("+getVertice1().getRotulo()+" - "+getVertice2().getRotulo()+")"+" Dist: "+getPeso()+"km");
        }

    }

}
