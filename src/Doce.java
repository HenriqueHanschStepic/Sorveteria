
public class Doce extends ItemSobremesa {

		private double peso;
		private int precoPorQuilo;
		
		public Doce(String nome, double peso, int precoPorQuilo ) {
			super (nome);
			this.peso = peso;
			this.precoPorQuilo = precoPorQuilo;
		}
	@Override
	public int getCusto() {
		// TODO Auto-generated method stub
		return(int) peso*precoPorQuilo;
	}
	@Override
	public String toString() {
	  return String.format("%.2f g @ %s /kg\n%-25s %6s", getPeso(), 
	    Sorveteria.centavos2ReaisECentavos(precoPorQuilo), getNome(), Sorveteria.centavos2ReaisECentavos(getCusto()));
	}

	private Object getPeso() {
		// TODO Auto-generated method stub
		return null;
	}

}

