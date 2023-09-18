public class Aresta
{
    private Vertice vertice1;
    private Vertice vertice2;
    private String rotulo;

    public Aresta(Vertice vertice1, Vertice vertice2)
    {
        setVertice1(vertice1);
        setVertice2(vertice2);
    }
    public Aresta(Vertice vertice1, Vertice vertice2, String rotulo)
    {
        setVertice1(vertice1);
        setVertice2(vertice2);
        setRotulo(rotulo);
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

    public void getAresta(Aresta aresta)
    {
        if(rotulo == null) {
            System.out.println("("+aresta.getVertice1().getRotulo()+"-"+aresta.getVertice2().getRotulo()+")");
        }
        else{
            System.out.println(aresta.getRotulo()+" "+"("+aresta.getVertice1().getRotulo()+"-"+aresta.getVertice2().getRotulo()+")");
        }

    }

}
