import java.util.*;

/**
 * Write a description of class Graph here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Graph implements GraphADT {
    private ArrayList<Vertex> vertex;
    private ArrayList<Edge> edge;
    private ArrayList<Edge> incidentEdges;
    private ArrayList<Vertex> allReachable;
    private ArrayList<Edge> mostDirectRoute;
    private ArrayList<Vertex> adjacencyList;

    /**
     * 
     */
    public Graph(ArrayList<Vertex> vertices, ArrayList<Edge> edges) {
        vertex = vertices;
        edge = edges;
    }

    /**
     * 
     */
    public Graph() {
        vertex = new ArrayList<Vertex>();
        edge = new ArrayList<Edge>();
    }

    /**
     * Inserts a new vertex into the graph with the given name. Returns the new
     * vertex object.
     *
     * @param n String, the name of the vertex object.
     * @return Vertex, the new vertex.
     */
    @Override
    public Vertex insertVertex(String n) {
        Vertex v = new Vertex(n);
        vertex.add(v);
        return v;
    }

    /**
     * Removes the chosen vertex from the graph. Returns the name of the removed
     * vertex or null if the vertex was not in the graph.
     *
     * @param v Vertex, the vertex object to be removed.
     * @return String, the name of the vertex or null
     */
    @Override
    public String removeVertex(Vertex v) {
        if (vertex.isEmpty()) {
            return null;
        } else {
            vertex.remove(v);
            return v.getName();
        }
    }

    /**
     * Inserts a new edge into the graph with two vertices and a given name.
     * Returns the new edge object.
     *
     * @param v Vertex, the first vertex of the edge.
     * @param w Vertex, the second vertex of the edge.
     * @param n String, the name of the edge object.
     * @return Edge, the new edge.
     */
    @Override
    public Edge insertEdge(Vertex v, Vertex w, String n) {
        Edge e = new Edge(v, w, n);
        this.edge.add(e);
        return e;
    }

    /**
     * Removes the chosen edge from the graph. Returns the name of the edge or
     * null if the edge is not in the graph.
     *
     * @param e Edge, the edge object to be removed.
     * @return String, the name of the edge or null.
     */
    @Override
    public String removeEdge(Edge e) {
        if (this.edge.isEmpty()) {
            return null;
        } else {
            edge.remove(e);
            return e.getName();
        }
    }

    /**
     * Returns the vertex of the chosen Edge e that is 'opposite' the chosen
     * Vertex v. Returns null if the Edge e doesn't exist or if it doesn't have
     * Vertex v.
     *
     * @param e Edge, the chosen edge object.
     * @param v Vertex, the chosen vertex object.
     * @return Vertex, the opposite vertex or null.
     */
    @Override
    public Vertex opposite(Edge e, Vertex v) {
        if (e.getV() == v) {
            return e.getW();
        } else if (e.getW() == v) {
            return e.getV();
        }
        return null;
    }

    /**
     * Returns a collection containing all of the vertices in the graph.
     *
     * @return ArrayList, a list of vertices.
     */
    @Override
    public ArrayList<Vertex> vertices() {
        return vertex;
    }

    /**
     * Returns a collection containing all of the edges in the graph.
     *
     * @return ArrayList, a list of edges.
     */
    @Override
    public ArrayList<Edge> edges() {
        return edge;
    }

    /**
     * Checks whether the two chosen vertices are adjacent (joined by the same
     * edge) or not.
     *
     * @param v Vertex, the first vertex.
     * @param w Vertex, the second vertex.
     * @return true if Vertex v and Vertex w are adjacent or false otherwise.
     */
    @Override
    public boolean areAdjacent(Vertex v, Vertex w) {

        for (Edge i : edge) {
            if (i.getV() == v && i.getW() == w) {
                return true;
            } else if (i.getV() == w && i.getW() == v) {
                return true;
            }
        }
        return false;
    }

    /**
     * Finds and returns the set of edges that are incident to the chosen
     * vertex.
     *
     * @param v Vertex, the chosen vertex object.
     * @return ArrayList, a list of edges.
     */
    @Override
    public ArrayList<Edge> incidentEdges(Vertex v) {
        incidentEdges = new ArrayList<Edge>();
        for(Edge i: edge) {
            if (i.getV() == v || i.getW() == v) {
                incidentEdges.add(i);
            }        
        }
        return incidentEdges;
    }

    /**
     * Renames the chosen vertex.
     *
     * @param v Vertex, the chosen vertex.
     * @param n String, the new name.
     * @return String, the old name of Vertex v.
     */
    @Override
    public String rename(Vertex v, String n) {
        String oldName = v.getName();
        v.setName(n);
        return oldName;
    }

    /**
     * Renames the chosen edge.
     *
     * @param e Edge, the chosen edge.
     * @param n String, the new name.
     * @return String, the old name of Edge e.
     */
    @Override
    public String rename(Edge e, String n) {
        String oldName = e.getName();
        e.setName(n);
        return oldName;
    }

    public void bfTraverse (Vertex v) {
        ArrayList<Vertex> checked = new ArrayList<>();
        ArrayList<Vertex> queue = new ArrayList<>();        
        ArrayList<Edge> queue1 = new ArrayList<>();
        ArrayList<Edge> incidentEdges = new ArrayList<>();
        queue.add(v);
        checked.add(v);        
        while (!queue.isEmpty()){            
            Vertex currentV = queue.remove(0);
            System.out.println(currentV);
            queue1 = incidentEdges(currentV);
            for(int i = 0; i < queue.size(); i++) {
                Edge currentE = queue1.remove(i);
                System.out.println(currentE);
                Vertex otherV = opposite(currentE, currentV);
                if(!checked.contains(otherV)) {
                    checked.add(otherV);
                    queue.add(otherV);
                }
            }            
        }
        System.out.println(queue);
        System.out.println(checked);
        System.out.println(queue1);
        System.out.println(incidentEdges);
    }

    public void bfTraverse () {

    }

    public ArrayList<Vertex> allReachable(Vertex v) {
        allReachable = new ArrayList<Vertex>();
        for (Vertex i: vertex) {
            //if (i.get)

        }
        return null;
    }

    public boolean allConnected() {
        return true;
    }

    public ArrayList<Edge> mostDirectRoute(Vertex v, Vertex w) {
        mostDirectRoute = new ArrayList<Edge>();
        return null;
    }
}
