import java.util.ArrayList;


public class HierarchicalListTester {
	public static void main(String[] args) {
		//[[1, 3], [[5,6], [4]], 2]
		
		//[1, 3]
		HierarchicalList node1 = new HierarchicalListNumberNode(1);
		HierarchicalList node2 = new HierarchicalListNumberNode(3);
		ArrayList<HierarchicalList> l1 = new ArrayList<>();
		l1.add(node1);
		l1.add(node2);
		HierarchicalList firstNode = new HierarchicalListArrayNode(l1);

		//[5,6]
		HierarchicalList node3 = new HierarchicalListNumberNode(5);
		HierarchicalList node4 = new HierarchicalListNumberNode(6);
		ArrayList<HierarchicalList> l2 = new ArrayList<>();
		l2.add(node3);
		l2.add(node4);
		HierarchicalList second1Node = new HierarchicalListArrayNode(l2);
		
		//[4]
		HierarchicalList node5 = new HierarchicalListNumberNode(4);
		ArrayList<HierarchicalList> l3 = new ArrayList<>();
		l3.add(node5);
		HierarchicalList second2Node = new HierarchicalListArrayNode(l3);
		
		ArrayList<HierarchicalList> l4 = new ArrayList<>();
		l4.add(second1Node);
		l4.add(second2Node);
		HierarchicalList secondNode = new HierarchicalListArrayNode(l4);
		
		//2
		HierarchicalList thirdNode = new HierarchicalListNumberNode(2);
		
		ArrayList<HierarchicalList> listMain = new ArrayList<>();
		listMain.add(firstNode);
		listMain.add(secondNode);
		listMain.add(thirdNode);
		
		HierarchicalListArrayNode hierarchicalListArrayNode = new HierarchicalListArrayNode(listMain);
		
		System.out.print(hierarchicalListArrayNode.max());
		

	}
}
