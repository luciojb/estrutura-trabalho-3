package main;

import java.util.Random;

import sorts.QuickSort;


public class ExecutaQuick {

	public static void main(String[] args) {
		QuickSort quick = new QuickSort();
		int[] vetor = new int [10000];
		
		for (int i=0; i<vetor.length;i++){
			vetor[i] = i;
		}
		
		quick.ordena(vetor, 0, vetor.length-1);
		
		System.out.println("\nVetor Ordenado 10000:\n");
		
		System.out.println("Comparações = "+quick.getCompara()+", trocas = "+quick.getTroca()+", tempo = "+ (double) (quick.getTempoFinal()-quick.getTempoInicial())/(Math.pow(1000, 3)));

		vetor = new int [100000];
		
		for (int i=0; i<vetor.length;i++){
			vetor[i] = i;
		}
		
		quick = new QuickSort();
		
		quick.ordena(vetor, 0, vetor.length-1);
		
		System.out.println("\nVetor Ordenado 100000:\n");
		
		System.out.println("Comparações = "+quick.getCompara()+", trocas = "+quick.getTroca()+", tempo = "+ (double) (quick.getTempoFinal()-quick.getTempoInicial())/(Math.pow(1000, 3)));

		vetor = new int [10000];
		
		int j=0;
		for (int i=vetor.length-1; i>=0;i--){
			vetor[j] = i;
			j++;
		}
		
		quick = new QuickSort();
		
		quick.ordena(vetor, 0, vetor.length-1);
		
		System.out.println("\nVetor Invertido 10000:\n");
		
		System.out.println("Comparações = "+quick.getCompara()+", trocas = "+quick.getTroca()+", tempo = "+ (double) (quick.getTempoFinal()-quick.getTempoInicial())/(Math.pow(1000, 3)));

		
		vetor = new int [100000];
		
		j=0;
		for (int i=vetor.length-1; i>=0;i--){
			vetor[j] = i;
			j++;
		}
		
		quick = new QuickSort();
		
		quick.ordena(vetor, 0, vetor.length-1);
		
		System.out.println("\nVetor Invertido 100000:\n");
		
		System.out.println("Comparações = "+quick.getCompara()+", trocas = "+quick.getTroca()+", tempo = "+ (double) (quick.getTempoFinal()-quick.getTempoInicial())/(Math.pow(1000, 3)));

		vetor = new int [10000];
		Random rand = new Random();
		for (int i=0; i<vetor.length;i++){
			vetor[i] = rand.nextInt(vetor.length);
		}
		
		quick = new QuickSort();
		
		quick.ordena(vetor, 0, vetor.length-1);
		
		System.out.println("\nVetor Aleatorio 10000:\n");
		
		System.out.println("Comparações = "+quick.getCompara()+", trocas = "+quick.getTroca()+", tempo = "+ (double) (quick.getTempoFinal()-quick.getTempoInicial())/(Math.pow(1000, 3)));

		vetor = new int [100000];
		for (int i=0; i<vetor.length;i++){
			vetor[i] = rand.nextInt(vetor.length);
		}
		
		quick = new QuickSort();
		
		quick.ordena(vetor, 0, vetor.length-1);
		
		System.out.println("\nVetor Aleatorio 100000:\n");
		
		System.out.println("Comparações = "+quick.getCompara()+", trocas = "+quick.getTroca()+", tempo = "+ (double) (quick.getTempoFinal()-quick.getTempoInicial())/(Math.pow(1000, 3)));



	}

}
