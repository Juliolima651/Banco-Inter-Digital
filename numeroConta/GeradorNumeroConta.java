package numeroConta;

import java.util.Random;

public class GeradorNumeroConta {
private Random random;
	
	public GeradorNumeroConta() {
		random = new Random();
	}
	public int gerarNumeroConta() {
		return random.nextInt(900000000) + 100000000;
	}

}
