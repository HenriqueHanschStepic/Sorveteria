
public class Sundae extends Sorvete {
	
	private int custoDaCalda;
	public int calda;
	
	public Sundae(String nome, int custo, String calda, int custoDaCalda) {
		super(nome, custo);
		this.custoDaCalda = custoDaCalda;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getCusto() {
		// TODO Auto-generated method stub
		return (int) custo+custoDaCalda;
	}
	@Override
	public String toString() {
	  return String.format("Sundae de %s com\n%-25s %6s", getCalda(), 
	    getNome(), Sorveteria.centavos2ReaisECentavos(getCusto()));
	}

	private Object getCalda() {
		// TODO Auto-generated method stub
		return null;
	}
}
