import java.util.ArrayList;
import java.util.List;

public class Passeio
{
    private List<Vertice> verticesp;
    private List<Aresta> arestasp;
    private int tamanho;

    public Passeio()
    {
        this.verticesp = new ArrayList<>();
        this.arestasp = new ArrayList<>();
        this.tamanho = 0;
    }
    public Passeio(List<Aresta> edges, int tamanho)
    {
        this.tamanho = tamanho;
        this.verticesp = new ArrayList<>();
        this.arestasp = edges;
        for (int i = 0; i < edges.size(); i++)
        {
            if(!verticesp.contains(edges.get(i).getVertice1()));
            {
                verticesp.add(edges.get(i).getVertice1());
            }
            if(!verticesp.contains(edges.get(i).getVertice2()));
            {
                verticesp.add(edges.get(i).getVertice1());
            }
        }
    }
    public Passeio(int tamanho, List<Vertice> vertex)
    {
        this.tamanho = tamanho;
        this.verticesp = vertex;
        this.arestasp = new ArrayList<>();
    }
    public int getTamanho(){return tamanho;}
    public void addVerticePasseio(Vertice vertice)
    {
        verticesp.add(vertice);
        tamanho++;
    }
    public List<Vertice> getVerticesPasseio(){return verticesp;}
    public void addAllVerticesPasseio(List<Vertice> vertices)
    {
        verticesp.addAll(vertices);
        tamanho += vertices.size();
    }
    public void inverterPasseio()
    {
        if(arestasp.size() > 1) {

            for (int i = arestasp.size()-1; i > -1 ; i--)
            {
                System.out.print(arestasp.get(i).getVertice2().getRotulo());
                System.out.print(", ");
                System.out.print(arestasp.get(i).getRotulo());
                System.out.print(", ");

                if(i == 0)
                {
                    System.out.print(arestasp.get(i).getVertice1().getRotulo());
                }
            }
        }
        else {
            for (int i = verticesp.size()-1; i > -1; i--)
            {
                System.out.print(verticesp.get(i).getRotulo()+" ");
            }
        }
        System.out.println();
    }
    public Passeio obterSecaoPasseio( int i, int j) {
        if (i < 0 || j < 0 || i > j || j >= arestasp.size())
        {
            return null;
        }

        List<Aresta> subArestas = arestasp.subList(i, j + 1);
        int subNumeroDeArestas = j - i + 1;

        return new Passeio(subArestas, subNumeroDeArestas);
    }
    public void imprimirPasseio()
    {
        if(arestasp.size() > 1)
        {
            for (int i = 0; i < arestasp.size(); i++)
            {
                System.out.print(arestasp.get(i).getVertice1().getRotulo());
                System.out.print(", ");
                System.out.print(arestasp.get(i).getRotulo());
                if(i != arestasp.size()-1)
                {
                    System.out.print(", ");
                }
                if(i == arestasp.size()-1)
                {
                    System.out.print(", "+arestasp.get(i).getVertice2().getRotulo());
                }
            }
        }
        else
        {
            for (int i = 0; i < verticesp.size(); i++)
            {
                System.out.print(verticesp.get(i).getRotulo());

                if(i != verticesp.size()-1)
                {
                    System.out.print(", ");
                }
            }
        }
        System.out.println();
    }
}