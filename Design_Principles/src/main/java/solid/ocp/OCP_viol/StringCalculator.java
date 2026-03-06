package solid.ocp.OCP_viol;

public class StringCalculator {

	 public void calculate(IStringOperation operation) throws Exception {
	        if (operation == null) {
	            throw new Exception("Operation Null");
	        }

	        else if (operation instanceof StringAddition) {
	        	
	            	StringAddition addition = (StringAddition) operation;
	            	addition.setResult(addition.getLeft() + addition.getRight());
	        } 
	        
	        else if (operation instanceof StringLengthComparison) {
	         
	        	StringLengthComparison lengthComparison = (StringLengthComparison) operation;
	            lengthComparison.setResult(lengthComparison.getLeft().length() - lengthComparison.getRight().length());
	        
	        }
	        else throw new Exception("Operation not recognized");
	    }
	 
}
