package jogo;

public class Jogo {
	
	private int qtdNum;
	private int count;
	private int tpJogo;

	public int getQtdNum() {
		return qtdNum;
	}

	public void setQtdNum(int qtdNum) {
		this.qtdNum = qtdNum;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	public int getTpJogo() {
		return tpJogo;
	}

	public void setTpJogo(int tpJogo) {
		this.tpJogo = tpJogo;
	}
	
	public Jogo(int n, int[] vtJogo, int nros) {
		this.qtdNum=n;
		this.count=0;
		this.tpJogo=nros; 		
		Jogar(vtJogo);
	}

	public void Jogar(int[] vtJogo){
		int numRand=0;
		boolean aux=true;
		boolean repeat=false;
		do {
			  numRand =  (int)(Math.random() *100);
			for (int i = 0; i < vtJogo.length; i++) {
				if ( (vtJogo[i]==numRand) || (numRand <= 0 || numRand > this.tpJogo) ) {
					repeat=true;
					i = vtJogo.length+1;
				}
			}	
			if (repeat) {
				Jogar(vtJogo);
			}
			else {
					vtJogo[this.count]=numRand;
					this.count++;
				}
			
			if (this.count<this.qtdNum) aux=true;
			else aux=false;
		} while (aux);
		
		ordena(vtJogo);
	}
	
	public void ordena(int[] vtJogo) {
		for (int i = 0; i < vtJogo.length; i++) {
			for (int j = i+1; j < vtJogo.length; j++) {
				if (vtJogo[i]>vtJogo[j]) {
					int aux = vtJogo[i];
					vtJogo[i]=vtJogo[j];
					vtJogo[j]=aux;
				
				}
			}
			
		}
	}
	
	public void resultado(int[] vtJogo) {
		System.out.println("Resultado: ");
		for (int i = 0; i < vtJogo.length; i++) {
			System.out.print(" "+vtJogo[i]+" " );
		}
	}

}
