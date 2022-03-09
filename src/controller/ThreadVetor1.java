package controller;

public class ThreadVetor1 extends Thread {

	private int opc;
	private int vetor[];

	public ThreadVetor1(int opc, int vetor[]) {
		this.opc = opc;
		this.vetor = vetor;
	}

	@Override
	public void run() {
		calc();
	}

	private void calc() {

		if (opc == 1) {
			double tempoInicial = System.nanoTime();

			for (int i : vetor) {
				vetor = vetor;
			}

			double tempoFinal = System.nanoTime();
			double tempoTotal = tempoFinal - tempoInicial;
			tempoTotal = tempoTotal / Math.pow(10, 9);

			System.out.println("Vetor Impar ==>" + tempoTotal + " s.");
		}
	}

}
