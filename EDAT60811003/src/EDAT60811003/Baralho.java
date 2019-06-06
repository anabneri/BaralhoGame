package  EDAT60811003;

import java.util.Random;

public class Baralho {

	private PilhaObj baralho;
	
	public Baralho() {
	int cont = 0;
	
	String[] faces = {"As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei" };
	String [] naipe = {"Copas","Paus", "Ouros", "Espada"};
	
	baralho = new PilhaObj(52);
	
	
	
	while (!baralho.isFull()) {
         		baralho.push(new Carta(faces[cont%13],
         				naipe[cont/13],
         				cont%13 + 1));
         				cont++;
	}
	
}
	
	
	public Carta removerCarta(int indice) {
		PilhaObj aux = new PilhaObj(indice);
		
		for (int i = 0; i < indice; i++) {
			aux.push(baralho.pop());
		}
		
		Carta alvo = (Carta) baralho.pop();
		
		while (!aux.isEmpty()) {
			baralho.push(aux.pop());
		}
		return alvo;
	}
	
	public void embaralhar() {
		Random numeroAleatorio = new Random();
		
		for (int i = 0; i < 52; i++) {
			int ind = numeroAleatorio.nextInt(52);
			
			if(ind !=0) {
				baralho.push(removerCarta(ind));
			}
		}
	}
	
	public Carta virarCarta() {
		Carta cartaVirada = (Carta) baralho.pop();
		return cartaVirada;
	}
	
	public void exibir() {
		baralho.exibePilhaBaseTopo();
	}
	
}
