package sorts;

public class QuickSort {
	private long compara=0, troca=0;
	private long tempoInicial=0, tempoFinal=0;
	
	public void ordena(int[] vetor, int inicio, int fim){
		this.tempoInicial = System.nanoTime();
		int meio;
		if(inicio<fim){
			meio = particao(vetor, inicio, fim);
			ordena(vetor, inicio, meio);
			ordena(vetor, meio+1, fim);
		}
		this.tempoFinal = System.nanoTime();
	}
	
	public int particao(int[] vetor, int inicio, int fim){
		int pivo = vetor[(inicio+fim)/2];
		int i=inicio-1;
		int j=fim+1;
		while(i<j){
			do{
				j--;
				this.compara++;
			}while(vetor[j]>pivo);
			do{
				i++;
				this.compara++;
			}while(vetor[i]<pivo);
			
			if(i<j){
				int aux = vetor[i];
				vetor[i] = vetor[j];
				vetor[j] = aux;
				this.troca++;
			}
		}
		return j;
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
