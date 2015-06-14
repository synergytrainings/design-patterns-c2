import java.util.ArrayList;


public class HierarchicalListArrayNode implements HierarchicalList {
	private ArrayList<HierarchicalList> array;

	public  HierarchicalListArrayNode(ArrayList<HierarchicalList> a) {
		array = a;
	}

	@Override
	public Integer max() {
		Integer max = Integer.MIN_VALUE;
		for(int i = 0; i < array.size(); i++) {
			Integer maxInnerEl = array.get(i).max(); 
			if(maxInnerEl > max) {
				max = maxInnerEl;
			}
		}
		return max;
	}
}
