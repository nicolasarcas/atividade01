import java.util.Random;

public class Empregado {
	private int tipo;
	private double ValorAReceber;
	Random gerador = new Random ();
	
	//construtor padrão
	public Empregado() {
		
	}
	
	public Empregado(int tipo) {
		this.tipo = tipo;
		if(tipo == 1) {
			ValorAReceber = 2500 + gerador.nextDouble() * 700;
		}
		else if(tipo == 2) {
			ValorAReceber = ((1500 + gerador.nextDouble() * 500) * gerador.nextDouble()) + 1500 + gerador.nextDouble() * 500;
		}
		else if(tipo == 3) {
			ValorAReceber = (1200 + gerador.nextDouble() * 500) + ((1200 + gerador.nextDouble() * 500)*gerador.nextDouble()) + 500 + gerador.nextDouble() * 500;
		}
		else {
			ValorAReceber = 2000 + gerador.nextDouble() * 2000;
		}
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public double getValorAReceber() {
		return ValorAReceber;
	}
	
}
