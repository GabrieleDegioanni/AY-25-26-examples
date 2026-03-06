package solid.ocp.OCP_ref;

public class StringInversionRef implements IStringOperationRef {

	private String toBeInverted;
	private String result;
	
	public StringInversionRef(String s) {
		this.toBeInverted = s;
		this.result = null;			
	}

	public String getToBeInverted() {
		return toBeInverted;
	}

	public void setToBeInverted(String toBeInverted) {
		this.toBeInverted = toBeInverted;
	}

	public String getResult() {
		return result;
	}

	private void setResult(String result) {
		this.result = result;
	}

	@Override
	public void perform() {
		StringBuilder sb = new StringBuilder(toBeInverted);
		setResult(sb.reverse().toString());
		
	}
	
	
	
}
