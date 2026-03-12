package solid.lsp.LSP_ref;

public class DuckRef implements BirdRef {

	private int eggs;
	
	public DuckRef() {
		eggs = 0;
	}
	
	@Override
	public void makeEgg() {
		this.eggs++;
	}


	@Override
	public int getEggsCount() {
		
		return this.eggs;
	}


}
