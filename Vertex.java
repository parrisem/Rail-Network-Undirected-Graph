
/**
 * Write a description of class Vertex here.
 *
 * @author (Parris Edwards McNairn)
 * @version (a version number or a date)
 */
public class Vertex
{
    private String name;
    // might need to include an edge variable for the incident edge method. so that each vertex stores its edges??
    /**
     * Constructor for objects of class Vertex
     */
    public Vertex(String name)
    {
        this.name = name;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String toString()
    {
        return name;
    }
    
    
}
