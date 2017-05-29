package main;

import java.util.Random;

import sorts.InsertionSort;


public class ExecutaInsert {

	public static void main(String[] args) {
		InsertionSort insert = new InsertionSort();
		int[] vetor = new int [10000];
		
		for (int i=0; i<vetor.length;i++){
			vetor[i] = i;
		}
		
		long[] ordenacao = insert.retornaComparacoesTrocasTempo(vetor);
		
		System.out.println("\nVetor Ordenado 10000:\n");
		
		System.out.println("Comparações = "+ordenacao[0]+", trocas = "+ordenacao[1]+", tempo = "+ (double) ordenacao[2]/(Math.pow(1000, 3)));

		vetor = new int [100000];
		
		for (int i=0; i<vetor.length;i++){
			vetor[i] = i;
		}
		
		ordenacao = insert.retornaComparacoesTrocasTempo(vetor);
		
		System.out.println("\nVetor Ordenado 100000:\n");
		
		System.out.println("Comparações = "+ordenacao[0]+", trocas = "+ordenacao[1]+", tempo = "+ (double) ordenacao[2]/(Math.pow(1000, 3)));

		vetor = new int [10000];
		
		int j=0;
		for (int i=vetor.length-1; i>=0;i--){
			vetor[j] = i;
			j++;
		}
		
		ordenacao = insert.retornaComparacoesTrocasTempo(vetor);
		
		System.out.println("\nVetor Invertido 10000:\n");
		
		System.out.println("Comparações = "+ordenacao[0]+", trocas = "+ordenacao[1]+", tempo = "+ (double) ordenacao[2]/(Math.pow(1000, 3)));

		
		vetor = new int [100000];
		
		j=0;
		for (int i=vetor.length-1; i>=0;i--){
			vetor[j] = i;
			j++;
		}
		
		ordenacao = insert.retornaComparacoesTrocasTempo(vetor);
		
		System.out.println("\nVetor Invertido 100000:\n");
		
		System.out.println("Comparações = "+ordenacao[0]+", trocas = "+ordenacao[1]+", tempo = "+ (double) ordenacao[2]/(Math.pow(1000, 3)));

		vetor = new int [10000];
		Random rand = new Random();
		for (int i=0; i<vetor.length;i++){
			vetor[i] = rand.nextInt(vetor.length);
		}
		
		ordenacao = insert.retornaComparacoesTrocasTempo(vetor);
		
		System.out.println("\nVetor Aleatório 10000:\n");
		
		System.out.println("Comparações = "+ordenacao[0]+", trocas = "+ordenacao[1]+", tempo = "+ (double) ordenacao[2]/(Math.pow(1000, 3)));

		vetor = new int [100000];
		for (int i=0; i<vetor.length;i++){
			vetor[i] = rand.nextInt(vetor.length);
		}
		
		ordenacao = insert.retornaComparacoesTrocasTempo(vetor);
		
		System.out.println("\nVetor Aleatório 100000:\n");
		
		System.out.println("Comparações = "+ordenacao[0]+", trocas = "+ordenacao[1]+", tempo = "+ (double) ordenacao[2]/(Math.pow(1000, 3)));

	}

}
