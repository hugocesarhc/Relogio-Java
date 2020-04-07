package Rotina;

public class Relogio {
 
	int hora=0;
	int minuto=0;
	int segundo=0;
	String Hora;
	
	public void setHora(int nHora, int nMinuto, int nSegundo) {
		hora = java.lang.Math.abs(hora);
		minuto = java.lang.Math.abs(minuto);
		segundo = java.lang.Math.abs(segundo);
		
		if (segundo < 60 && minuto < 60 && hora < 24) {
			this.hora = hora;
			this.minuto = minuto;
			this.segundo = segundo;
		}else {
			System.out.println("Dados inválidos");
		}
	}
	public String getHora() {
		return this.hora + ":" + this.minuto + ":" + segundo;
	}
	
	public void showHora() {
		System.out.println(this.getHora());
	}
	
	while (pulso==pulso) {
		public void pulso() {
			segundo++;
			if(segundo > 59) {
				segundo = 0;
				minuto++;
			}
			if (minuto > 59) {
				minuto = 0;
				hora++;
			}
			if (hora > 23) {
				hora = 0;
			}
		}
	System.out.println (pulso);
	}
}
