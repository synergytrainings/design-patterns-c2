package graphStrategy;

/**
 * Created by Razmik.Mkrtchyan on 3/25/2016.
 */
public class Edge<T> {
    private Vertex<T> from;

    private Vertex<T> to;

    public Edge(Vertex<T> from, Vertex<T> to) {
        this.from = from;
        this.to = to;
    }

    public Vertex<T> getTo() {
        return to;
    }

    public Vertex<T> getFrom() {
        return from;
    }

}
