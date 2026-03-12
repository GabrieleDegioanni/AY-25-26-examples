package solid.lsp.LSP_viol;

public class Duck implements Bird {

	private int eggs;
	
	public Duck() {
		eggs = 0;
	}
	
	
	public void makeEgg() {
		this.eggs++;
	}


	@Override
	public int getEggsCount() {
		
		return this.eggs;
	}

	@Override
	public void fly()  {
		throw new UnsupportedOperationException("Duck cannot fly");

	}

}
