package sorts;

public class MergeSort {
	private long compara=0, troca=0;
	private long tempoInicial=0, tempoFinal=0;
	
	public void ordena(int[] vetor, int inicio, int fim){
		if (this.tempoInicial==0)
			this.tempoInicial = System.nanoTime();
		int meio;
		if(inicio<fim){
			meio=(inicio+fim)/2;
			ordena(vetor, inicio, meio);
			ordena(vetor, meio+1, fim);
			intercala(vetor, inicio, meio, fim);
			
		}
		this.tempoFinal = System.nanoTime();
	}
	
	public void intercala(int[] vetor, int inicio, int meio, int fim){
		int aux[] = new int[vetor.length];
		for(int i=inicio; i<=meio; i++){
			aux[i] = vetor[i];
		} 
		
		for(int j=meio+1; j<=fim; j++){
			aux[fim+meio+1-j] = vetor[j];
		}
		
		int i=inicio;
		int j=fim;
		for(int k=inicio; k<=fim; k++){
			this.troca++;
			this.compara++;
			if(aux[i]<=aux[j]){
				vetor[k]=aux[i];
				i++;
			} else{
				vetor[k]=aux[j];
				j--;
			}
		} 
	}

	public long getCompara() {
		return compara;
	}

	public void setCompara(long compara) {
		this.compara = compara;
	}

	public long getTroca() {
		return troca;
	}

	public void setTroca(long troca) {
		this.troca = troca;
	}

	public long getTempoInicial() {
		return tempoInicial;
	}

	public void setTempoInicial(long tempoInicial) {
		this.tempoInicial = tempoInicial;
	}

	public long getTempoFinal() {
		return tempoFinal;
	}

	public void setTempoFinal(long tempoFinal) {
		this.tempoFinal = tempoFinal;
	}
}
