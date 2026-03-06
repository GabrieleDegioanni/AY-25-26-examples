package solid.ocp.OCP_ref;

public class StringCalculatorRef {

	 public void calculate(IStringOperationRef operation) throws Exception {
	        if (operation == null) {
	            throw new Exception("Operation Null");
	        }

	        else operation.perform();
	    }
	 
}
