package graphStrategy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Razmik.Mkrtchyan on 3/25/2016.
 */
public class Graph<T> {

	private TraverseBehavior<T> traverseBehavior;
	private List<Vertex<T>> verticies;

	private List<Edge<T>> edges;

	private Vertex<T> rootVertex;

	public Graph() {
		verticies = new ArrayList<>();
		edges = new ArrayList<>();
	}

	public boolean addVertex(Vertex<T> v) {
		boolean added = false;
		if (!verticies.contains(v)) {
			added = verticies.add(v);
		}
		return added;
	}

	public Vertex<T> getRootVertex() {
		return rootVertex;
	}

	public void setRootVertex(Vertex<T> root) {
		this.rootVertex = root;
		if (!verticies.contains(root)) this.addVertex(root);
	}

	public boolean addEdge(Vertex<T> from, Vertex<T> to) {
		if (!verticies.contains(from)) throw new IllegalArgumentException("from is not in graph");
		if (!verticies.contains(to)) throw new IllegalArgumentException("to is not in graph");

		Edge<T> e = new Edge<T>(from, to);
		if (from.findEdge(to) != null) return false;
		else {
			from.addEdge(e);
			to.addEdge(e);
			edges.add(e);
			return true;
		}
	}

	public void traverse(Visitor<T> visitor) {
		traverseBehavior.traverse(this, visitor);
	}

	public void setTraverseBehavior(TraverseBehavior<T> traverseBehavior) {
		this.traverseBehavior = traverseBehavior;
	}



}
