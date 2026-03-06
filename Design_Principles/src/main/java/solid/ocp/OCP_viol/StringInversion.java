package solid.ocp.OCP_viol;

public class StringInversion implements IStringOperation {

	private String toBeInverted;
	private String result;
	
	public StringInversion(String s) {
		this.toBeInverted = s;
		this.result = null;			
	}

	public String getToBeInverted() {
		return toBeInverted;
	}

	public void setToBeInverted(String toBeInverted) {
		this.toBeInverted = toBeInverted;
	}

	@Override
	public String getResult() {
		return result;
	}

	protected void setResult(String result) {
		this.result = result;
	}
	
	
	
}
