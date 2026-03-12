package solid.lsp.LSP_viol;

public class Pigeon implements Bird {

	private int eggs;
	
	@Override
	public int getEggsCount() {
		
		return this.eggs;
	}

	public void makeEgg() {
		this.eggs++;
	}
	
	@Override
	public void fly() {
		System.out.println("Pigeon flying");

	}

}
