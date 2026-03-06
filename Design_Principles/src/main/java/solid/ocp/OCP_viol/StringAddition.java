package solid.ocp.OCP_viol;

public class StringAddition implements IStringOperation {
	
	private String left;
	private String right; 
	private String result;
	
	public StringAddition(String left, String right) {
		
		this.left = left;
		this.right = right;
		this.result = null;
	}

	//getters and setters
	public String getLeft() {
		return left;
	}

	public void setLeft(String left) {
		this.left = left;
	}

	public String getRight() {
		return right;
	}

	public void setRight(String right) {
		this.right = right;
	}

	@Override
	public String getResult() {
		return result;
	}

	protected void setResult(String res) {
		
		this.result = res;
	}

	
}
