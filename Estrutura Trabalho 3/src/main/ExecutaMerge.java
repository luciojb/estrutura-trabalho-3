package main;

import java.util.Random;

import sorts.MergeSort;


public class ExecutaMerge {

	public static void main(String[] args) {
		MergeSort merge = new MergeSort();
		int[] vetor = new int [10000];
		
		for (int i=0; i<vetor.length;i++){
			vetor[i] = i;
		}
		
		merge.ordena(vetor, 0, vetor.length-1);
		
		System.out.println("\nVetor Ordenado 10000:\n");
		
		System.out.println("Comparações = "+merge.getCompara()+", trocas = "+merge.getTroca()+", tempo = "+ (double) (merge.getTempoFinal()-merge.getTempoInicial())/(Math.pow(1000, 3)));

		vetor = new int [100000];
		
		for (int i=0; i<vetor.length;i++){
			vetor[i] = i;
		}
		
		merge = new MergeSort();
		
		merge.ordena(vetor, 0, vetor.length-1);
		
		System.out.println("\nVetor Ordenado 100000:\n");
		
		System.out.println("Comparações = "+merge.getCompara()+", trocas = "+merge.getTroca()+", tempo = "+ (double) (merge.getTempoFinal()-merge.getTempoInicial())/(Math.pow(1000, 3)));

		vetor = new int [10000];
		
		int j=0;
		for (int i=vetor.length-1; i>=0;i--){
			vetor[j] = i;
			j++;
		}
		
		merge = new MergeSort();
		
		merge.ordena(vetor, 0, vetor.length-1);
		
		System.out.println("\nVetor Invertido 10000:\n");
		
		System.out.println("Comparações = "+merge.getCompara()+", trocas = "+merge.getTroca()+", tempo = "+ (double) (merge.getTempoFinal()-merge.getTempoInicial())/(Math.pow(1000, 3)));

		
		vetor = new int [100000];
		
		j=0;
		for (int i=vetor.length-1; i>=0;i--){
			vetor[j] = i;
			j++;
		}
		
		merge = new MergeSort();
		
		merge.ordena(vetor, 0, vetor.length-1);
		
		System.out.println("\nVetor Invertido 100000:\n");
		
		System.out.println("Comparações = "+merge.getCompara()+", trocas = "+merge.getTroca()+", tempo = "+ (double) (merge.getTempoFinal()-merge.getTempoInicial())/(Math.pow(1000, 3)));

		vetor = new int [10000];
		Random rand = new Random();
		for (int i=0; i<vetor.length;i++){
			vetor[i] = rand.nextInt(vetor.length);
		}
		
		merge = new MergeSort();
		
		merge.ordena(vetor, 0, vetor.length-1);
		
		System.out.println("\nVetor Aleatorio 10000:\n");
		
		System.out.println("Comparações = "+merge.getCompara()+", trocas = "+merge.getTroca()+", tempo = "+ (double) (merge.getTempoFinal()-merge.getTempoInicial())/(Math.pow(1000, 3)));

		vetor = new int [100000];
		for (int i=0; i<vetor.length;i++){
			vetor[i] = rand.nextInt(vetor.length);
		}
		
		merge = new MergeSort();
		
		merge.ordena(vetor, 0, vetor.length-1);
		
		System.out.println("\nVetor Aleatorio 100000:\n");
		
		System.out.println("Comparações = "+merge.getCompara()+", trocas = "+merge.getTroca()+", tempo = "+ (double) (merge.getTempoFinal()-merge.getTempoInicial())/(Math.pow(1000, 3)));

	}

}
