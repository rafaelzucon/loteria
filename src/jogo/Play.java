package jogo;

import java.util.Scanner;

public class Play {

	
	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Digite o número correspondente ao tipo de jogo + [Enter]:");
		System.out.println("[1] Mega Sena [2] Dupla Sena");
		System.out.println("[3] Lotomania [4] Quina");
		System.out.println("[5] Lotofacil [6] Timemania");
		int tpJogo=teclado.nextInt();
		int nroTpJogo=0;
		int qtdNum=0;
		String jogoName="";
		
		switch (tpJogo) {
		case 1: {
			nroTpJogo=60;
			System.out.println("Informe quantidade de números:");
			qtdNum=teclado.nextInt();
			jogoName="Mega Sena";
			break;
		}	
		case 2:{ 
			nroTpJogo=50;
			System.out.println("Informe quantidade de números:");
			qtdNum=teclado.nextInt();
			jogoName="Dupla Sena";
			break;
		}	
		case 3:{ 
			nroTpJogo=100;
			qtdNum=50;
			jogoName="Lotomania";
			break;
		}
		case 4:{ 
			nroTpJogo=60;
			System.out.println("Informe quantidade de números:");
			qtdNum=teclado.nextInt();
			jogoName="Quina";
			break;
		}
		case 5:{ 
			nroTpJogo=25;
			System.out.println("Informe quantidade de números:");
			qtdNum=teclado.nextInt();
			jogoName="Lotofacil";
			break;
		}
		case 6:{ 
			nroTpJogo=80;
			qtdNum=10;
			jogoName="Timemania";
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + tpJogo);
		}
		
		System.out.println("Informe a quantidade de jogos para "+jogoName);
		int qtdPlay=teclado.nextInt();
		
		for (int i = 0; i < qtdPlay ; i++) {
			System.out.println("Jogo "+(i+1)+": ");
			int[] vtJogo = new int[qtdNum];
			Jogo loteria = new Jogo(qtdNum,vtJogo,nroTpJogo);
			loteria.resultado(vtJogo);
			System.out.println("");
			System.out.println("---------------------");
		}
	}
}
