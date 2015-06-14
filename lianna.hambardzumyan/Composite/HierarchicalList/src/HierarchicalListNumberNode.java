
public class HierarchicalListNumberNode implements HierarchicalList {
	private Integer value;

	public HierarchicalListNumberNode(Integer v) {
		value = v;
	}

	@Override
	public Integer max() {
		return value;
	}
	
	

	
}
