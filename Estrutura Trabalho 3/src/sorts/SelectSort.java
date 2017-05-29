package sorts;

public class SelectSort {
	
	public int[] ordenar(int[] vetor){
		final int MAX = vetor.length;
		for(int i=0;i<MAX-1;i++){
			int MIN = i;
			for(int j=MIN+1; j<MAX; j++){
				if(vetor[j]<vetor[MIN]){
					MIN = j;
				}
			}
			int auxiliar = vetor[i];
			vetor[i] = vetor[MIN];
			vetor[MIN] = auxiliar;
		}
		return vetor;
	}
	
	public long[] retornaComparacoesTrocasTempo(int[] vetor){
		long compara=0, troca=0;
		long tempoInicial=System.nanoTime(), tempoFinal=0;
		final int MAX = vetor.length;
		for(int i=0;i<MAX-1;i++){
			int MIN = i;
			for(int j=MIN+1; j<MAX; j++){
				compara++;
				if(vetor[j]<vetor[MIN]){
					MIN = j;
				}
			}
			int auxiliar = vetor[i];
			if(i!=MIN){
				troca++;
			}
			vetor[i] = vetor[MIN];
			troca++;
			vetor[MIN] = auxiliar;
		}
		tempoFinal=System.nanoTime();
		return new long[] {compara,troca,(tempoFinal-tempoInicial)};
	}
}
