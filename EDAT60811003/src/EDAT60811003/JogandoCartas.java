package EDAT60811003;

import java.util.Scanner;

public class JogandoCartas {

	public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			int qntCartas;
			
			
			Baralho  baralhinho = new Baralho();
			
			baralhinho.exibir();
			
			baralhinho.embaralhar();
			
			baralhinho.exibir();
			
			baralhinho.embaralhar();
			
			System.out.println("Digite quantidade de cartas que vao ser viradas  entre 3 e 7: ");
			qntCartas = scanner.nextInt();
			
			while(qntCartas < 3 || qntCartas > 7 ) {
				System.out.println("Digite novamente: ");
				qntCartas = scanner.nextInt();
				
			}
			
			Carta[] cartas= new Carta[qntCartas];
			
			for (int i = 0; i < qntCartas; i++) {
				cartas[i] = baralhinho.virarCarta();
				System.out.println(cartas[i]);
				
			}
			
			boolean ganhou = true;
			
			for (int i = 0; i < cartas.length - 1; i++) {
			 if(cartas[i].getValorCarta() > cartas[i+1].getValorCarta()) {
				 ganhou = false;
				 break;
			 }
			}
			
			if ( ganhou == true) {
				System.out.println("uhu voce ganhou!!!");
			}
			else{
				System.out.println("infelizmente voce perdeu :(");
			}
			
			
			
			scanner.close();
			
			
		}
		

	}


