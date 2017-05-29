package sorts;

public class InsertionSort {
	public int[] ordenar(int[] vetor){
		int pivo, j;
		for(int i=0; i<vetor.length;i++){
			pivo = vetor[i];
			j= i-1;
			while(j>=0 && vetor[j]>pivo){
				vetor[j+1] = vetor[j];
				j=j-1;
			}
			vetor[j+1] = pivo;
		}
		return vetor;
	}
	
	public long[] retornaComparacoesTrocasTempo(int[] vetor){
		long compara=0, troca=0;
		long tempoInicial=System.nanoTime(), tempoFinal=0;
		int pivo, j;
		for(int i=0; i<vetor.length;i++){
			pivo = vetor[i];
			troca++;
			j= i-1;
			compara++;
			while(j>=0 && vetor[j]>pivo){
				vetor[j+1] = vetor[j];
				j=j-1;
				troca++;
				compara++;
			}
			vetor[j+1] = pivo;
			troca++;
		}
		
		tempoFinal=System.nanoTime();
		return new long[] {compara-1,troca-2,(tempoFinal-tempoInicial)};
	}
}
