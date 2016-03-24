package graphStrategy;

/**
 * Created by Razmik.Mkrtchyan on 3/25/2016.
 */
public interface TraverseBehavior<T> {
	void traverse(Graph<T> graph, Visitor<T> visitor);

}
