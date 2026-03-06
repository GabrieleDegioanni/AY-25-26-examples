package solid.ocp.OCP_viol;

public class StringLengthComparison implements IStringOperation {

	private String left;
	private String right; 
	private int result;
	
	public StringLengthComparison(String left, String right) {
		this.left = left;
		this.right = right;
		this.result = 0;
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
		return Integer.toString(result);
	}

	protected void setResult(int res) {
		
		this.result = res;
	}
	
	
}
