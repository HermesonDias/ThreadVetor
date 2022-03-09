package controller;

public class ThreadVetor2 extends Thread {

	private int opc;
	private int vetor[];

	public ThreadVetor2(int opc, int[] vetor) {
		this.opc = opc;
		this.vetor = vetor;
	}

	@Override
	public void run() {
		calc();
	}

	private void calc() {
		int i = 0;
		int tamanho = vetor.length;
		
		if (opc == 2) {
			double tempoInicial = System.nanoTime();

			for (i = 0; i < tamanho; i++) {
				vetor[i] = vetor[i];
			}

			double tempoFinal = System.nanoTime();
			double tempoTotal = tempoFinal - tempoInicial;
			tempoTotal = tempoTotal / Math.pow(10, 9);

			System.out.println("Vetor Par ==>" + tempoTotal + " s.");
		}
	}
}
