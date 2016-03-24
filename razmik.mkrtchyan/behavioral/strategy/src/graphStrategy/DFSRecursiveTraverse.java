package graphStrategy;

import java.util.LinkedList;

/**
 * Created by Razmik.Mkrtchyan on 3/25/2016.
 */
public class DFSRecursiveTraverse<T>
		implements TraverseBehavior<T> {
	@Override
	public void traverse(Graph<T> graph, Visitor<T> visitor) {
		Vertex<T> v = graph.getRootVertex();
		depthFirstSearch(v, visitor);
	}

	public void depthFirstSearch(Vertex<T> v, Visitor<T> visitor) {
		if (visitor != null) visitor.visit(v);
		v.mark();
		for (int i = 0; i < v.getOutgoingEdgeCount(); i++) {
			Edge<T> e = v.getOutgoingEdge(i);
			if (!e.getTo().isMarked()) {
				depthFirstSearch(e.getTo(), visitor);
			}
		}
	}
}
