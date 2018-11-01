
public class Sorvete extends ItemSobremesa {

	protected int custo;
	
	public Sorvete(String nome, int custo) {
		super(nome);
		this.custo = custo;
	}
	@Override
	public int getCusto() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String toString() {
	  return String.format("%-25s %6s", getNome(), Sorveteria.centavos2ReaisECentavos(getCusto()));
	}

}
