package graphStrategy;

/**
 * Created by Razmik.Mkrtchyan on 3/25/2016.
 */
public interface Visitor<T> {
	void visit(Vertex<T> v);
}
