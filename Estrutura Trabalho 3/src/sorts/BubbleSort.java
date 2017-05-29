package sorts;

public class BubbleSort {
	
	public int[] ordenar(int[] vetor){
		final int MAX = vetor.length;
		for(int j=0; j<MAX;j++){
			for(int i=0; i<MAX-1; i++){
				if(vetor[i]>vetor[i+1]){
					int aux = vetor[i];
					vetor[i]=vetor[i+1];
					vetor[i+1] = aux;
				}
			}
		}
		
		return vetor;
	}
	
	public long[] retornaComparacoesTrocasTempo(int[] vetor){
		long compara=0, troca=0;
		long tempoInicial=System.nanoTime(), tempoFinal=0;
		final int MAX = vetor.length;
		for(int j=0; j<MAX;j++){
			for(int i=0; i<MAX-1; i++){
				compara++;
				if(vetor[i]>vetor[i+1]){
					int aux = vetor[i];
					vetor[i]=vetor[i+1];
					vetor[i+1] = aux;
					troca++;
				}
			}
		}
		
		tempoFinal=System.nanoTime();
		return new long[] {compara,troca, (tempoFinal-tempoInicial)};
	}
}
