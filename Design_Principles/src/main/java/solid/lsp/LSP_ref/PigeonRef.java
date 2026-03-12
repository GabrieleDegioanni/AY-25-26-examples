package solid.lsp.LSP_ref;

public class PigeonRef implements FlyingBird {

	private int eggs;
	
	@Override
	public int getEggsCount() {
		
		return this.eggs;
	}
	
	@Override
	public void makeEgg() {
		this.eggs++;
	}
	
	@Override
	public void fly() {
		System.out.println("Pigeon flying");

	}

}
