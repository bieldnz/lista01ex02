package view;

import java.util.Random;
import controller.VetorController;

public class Principal {
	public static void main(String[] args) {
		
		int[] vetor = new int[10];
		Random gerador = new Random();
		VetorController vetorController = new VetorController();
		
		for(int x = 0; x < 10; x++) {
			vetor[x] = gerador.nextInt(100) ;
			System.out.println(vetor[x]);
		}
		int resultado = vetorController.busca(vetor, (vetor.length - 1), vetor[(vetor.length - 1)]);
		System.out.println("Resultado: " + resultado);
	}
}
