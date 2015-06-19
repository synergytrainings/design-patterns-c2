import main.java.com.synisys.designPatternsTraining.prototype.api.Node;
import main.java.com.synisys.designPatternsTraining.prototype.impl.LeafNode;
import main.java.com.synisys.designPatternsTraining.prototype.impl.NodeItem;

/**
 * Created by Razmik on 6/4/2015.
 */
public class CompositeTester {
    public static void main(String[] args) throws CloneNotSupportedException {

        Node<String> root=new NodeItem<>("Users");
        Node<String> child1=new NodeItem<>("Pending users");
        Node<String> child2=new NodeItem<>("Blocked Users");
        Node<String> leaf=new LeafNode<>("New Pending users");
        Node<String> leaf1=new LeafNode<>("New Blocked users");
         root.add(child1);
        root.add(child2);
        child1.add(leaf);
        child2.add(leaf);
        root.printPreOrder();
        }
    }
