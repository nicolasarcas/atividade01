import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Teste {
	public static void main(String[] args) {
		Random gerador = new Random ();
		List <Empregado> empregados = 
				new ArrayList <> (); //operador diamante
		for (int i = 1; i<= 10; i++) {
			int tipo = gerador.nextInt(4) + 1;
			Empregado aux = new Empregado (tipo);
			empregados.add(aux);
		}		
		for (Empregado e : empregados){System.out.printf("Valor a receber: %.2f %n", (e.getValorAReceber()));}
	}
}
