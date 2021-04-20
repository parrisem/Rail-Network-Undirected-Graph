import java.util.*;

/**
 * Write a description of class Edge here.
 *
 * @author (Parris Edwards McNairn)
 * @version (a version number or a date)
 */
public class Edge
{
    private String name;
    private Vertex v;
    private Vertex w;
    
    /**
     * Constructor for objects of class Edge
     */
    public Edge(Vertex v, Vertex w, String name)
    {
        this.name = name;
        this.v = v;
        this.w = w;
    }

    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public Vertex getV()
    {
        return v;
    }
    
    public Vertex getW()
    {
        return w;
    }

    @Override
    public String toString()
    {
        return name;
    }
}
