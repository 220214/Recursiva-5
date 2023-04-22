package Controller;

public class Digito {

	public Digito() {
		super();
	}
	public  int Qdig( int num) {
		// se for entre o intervalo -10 e 10 retorna 1 , fiz para conseguir contabilizar o 0
		if (num >-10 && num < 10) {
				return 1;
		}else {
			return 1 + Qdig(num/10);
		}
	}

}
