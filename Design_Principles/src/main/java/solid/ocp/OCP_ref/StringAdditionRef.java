package solid.ocp.OCP_ref;

public class StringAdditionRef implements IStringOperationRef {
	
	private String left;
	private String right; 
	private String result;
	
	public StringAdditionRef(String left, String right) {
		
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

	public String getResult() {
		return result;
	}

	private void setResult(String result) {
		this.result = result;
	}

	@Override
	public void perform() {
		setResult(this.left + this.right);
		
	}
	
	

}
