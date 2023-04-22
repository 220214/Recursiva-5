package view;

import Controller.Digito;

public class Main5 {

	public static void main(String[] args) {
		//usei o random para escolher qualquer numero aleatorio
		int num = (int)((Math.random()*-1000)+1);
		Digito d = new Digito ();
		int qdig = d.Qdig(num);
		System.out.println("A quandidade de digito do "+ num +"  = "+ qdig);
	}

}
