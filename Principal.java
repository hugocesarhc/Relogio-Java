package Rotina;

public class Principal {

	public static void main(String[] args) {
		Relogio relogio = new Relogio();
		
		relogio.setHora(23, 59, 59);
		relogio.showHora();
		relogio.pulso();
	}

}
