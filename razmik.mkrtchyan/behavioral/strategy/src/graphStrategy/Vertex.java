package graphStrategy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Razmik.Mkrtchyan on 3/25/2016.
 */
public class Vertex<T> {
	private List<Edge<T>> incomingEdges;

	private List<Edge<T>> outgoingEdges;

	private T data;
	private boolean isMarked;

	public Vertex(T data) {
		incomingEdges = new ArrayList<>();
		outgoingEdges = new ArrayList<>();
		this.data = data;
	}

	public boolean isMarked() {
		return isMarked;
	}

	public void mark() {
		this.isMarked = true;
	}

	public T getData() {
		return this.data;
	}

	public boolean addEdge(Edge<T> e) {
		if (e.getFrom() == this) outgoingEdges.add(e);
		else if (e.getTo() == this) incomingEdges.add(e);
		else return false;
		return true;
	}

	public int getIncomingEdgeCount() {
		return incomingEdges.size();
	}

	public Edge<T> getIncomingEdge(int i) {
		return incomingEdges.get(i);
	}

	public List getIncomingEdges() {
		return this.incomingEdges;
	}

	public int getOutgoingEdgeCount() {
		return outgoingEdges.size();
	}

	public Edge<T> getOutgoingEdge(int i) {
		return outgoingEdges.get(i);
	}

	public List getOutgoingEdges() {
		return this.outgoingEdges;
	}

	public Edge<T> findEdge(Vertex<T> dest) {
		for (Edge<T> e : outgoingEdges) {
			if (e.getTo() == dest) return e;
		}
		return null;
	}

}
