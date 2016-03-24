package graphStrategy;

import java.util.LinkedList;

/**
 * Created by Razmik.Mkrtchyan on 3/25/2016.
 */
public class BFSIterativeTraverse<T> implements TraverseBehavior<T> {
    @Override
    public void traverse(Graph<T> graph, Visitor<T> visitor) {
        Vertex<T> v=graph.getRootVertex();
            LinkedList<Vertex<T>> q = new LinkedList<>();
            q.add(v);
            if (visitor != null) visitor.visit(v);
            v.mark();
            while (!q.isEmpty()) {
                v = q.removeFirst();
                for (int i = 0; i < v.getOutgoingEdgeCount(); i++) {
                    Edge<T> e = v.getOutgoingEdge(i);
                    Vertex<T> to = e.getTo();
                    if (!to.isMarked()) {
                        q.add(to);
                        if (visitor != null) visitor.visit(to);
                        to.mark();
                    }
                }
            }
        }
    }
