
public class Cookie extends ItemSobremesa {

	private int numero;
	private int precoPorDuzia;
	
	public Cookie(String nome, int numero, int precoPorDuzia ) {
		super (nome);
		this.numero = numero;
		this.precoPorDuzia = precoPorDuzia;
		
	}

	@Override
	public int getCusto() {
		// TODO Auto-generated method stub
		return(int) precoPorDuzia/numero;
	}
	@Override
	public String toString() {
	  return String.format("%d @ %s /dz\n%-25s %6s", getNumero(), 
	    Sorveteria.centavos2ReaisECentavos(getPrecoPorDuzia()), getNome(), Sorveteria.centavos2ReaisECentavos(getCusto()));
	}

	private int getPrecoPorDuzia() {
		// TODO Auto-generated method stub
		return 0;
	}

	private Object getNumero() {
		// TODO Auto-generated method stub
		return null;
	}
}