package graphStrategy;

import graphStrategy.BFSIterativeTraverse;
import graphStrategy.Graph;
import graphStrategy.Vertex;
import graphStrategy.Visitor;

public class MainTest {

    public static void main(String[] args) {
        Graph<String> stringGraph=new Graph<>();
        Vertex<String> stringVertex0=new Vertex<>("v0");
        Vertex<String> stringVertex1=new Vertex<>("v2");
        Vertex<String> stringVertex2=new Vertex<>("v3");
        stringGraph.addVertex(stringVertex0);
        stringGraph.addVertex(stringVertex1);
        stringGraph.addVertex(stringVertex2);
        stringGraph.addEdge(stringVertex0,stringVertex1);
        stringGraph.addEdge(stringVertex1,stringVertex2);
        stringGraph.addEdge(stringVertex2,stringVertex0);
        stringGraph.setRootVertex(stringVertex0);
        stringGraph.setTraverseBehavior(new BFSIterativeTraverse<>());
        stringGraph.traverse(v -> System.out.println(v.getData()));


    }
}
