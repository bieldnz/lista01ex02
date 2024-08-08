package controller;

public class VetorController {
	
	public VetorController() {
		super();
	}
	
	public int busca(int[] vetor, int tamanho, int n) {
		
		if(tamanho >= 0) {
			if(vetor[tamanho] < n) {
				n = vetor[tamanho];// O valor de n será alterado somente se a atual posição do vetor for menor que n
			}
			n = busca(vetor, (tamanho - 1), n);
		}
		return n; //O código vai parar quando ele examinar a ultima posição do vetor
	}
}
