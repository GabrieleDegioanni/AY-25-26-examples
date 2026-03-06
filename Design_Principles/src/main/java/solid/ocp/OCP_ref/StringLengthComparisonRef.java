package solid.ocp.OCP_ref;

public class StringLengthComparisonRef implements IStringOperationRef {

	private String left;
	private String right; 
	private int result;
	
	public StringLengthComparisonRef(String left, String right) {
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

	public int getResult() {
		return result;
	}

	private void setResult(int result) {
		this.result = result;
	}

	@Override
	public void perform() {
		
		setResult(this.left.length() - this.right.length());
		
	}
	
	
	
	
}
