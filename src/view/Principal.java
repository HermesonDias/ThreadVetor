package view;

import controller.ThreadVetor1;
import controller.ThreadVetor2;

public class Principal {

	public static void main(String[] args) {
		int opc = 0;
		int[] vetor = new int[1000];
		int i = 0;
		
		for(opc = 1; opc <= 2; opc ++) {
		for(i = 0; i < 1000; i++) {
				vetor[i] = (int)(Math.random()*100)+1;
		}
		Thread tVetor1 = new ThreadVetor1(opc, vetor);
		tVetor1.start();
		Thread tVetor2 = new ThreadVetor2(opc, vetor);
		tVetor2.start();
		}
	}

}
