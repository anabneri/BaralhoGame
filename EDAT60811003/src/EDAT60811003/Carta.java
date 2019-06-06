package  EDAT60811003;
public class Carta {

	String face;
	String naipe;
	int valorCarta;
	
	
	public Carta(String face, String naipe, int valorCarta) {
		super();
		this.face = face;
		this.naipe = naipe;
		this.valorCarta = valorCarta;
	}


	public String getFace() {
		return face;
	}


	public void setFace(String face) {
		this.face = face;
	}


	public int getValorCarta() {
		return valorCarta;
	}


	public void setValorCarta(int valorCarta) {
		this.valorCarta = valorCarta;
	}


	public String getNaipe() {
		return naipe;
	}


	public void setNaipe(String naipe) {
		this.naipe = naipe;
	}


	@Override
	public String toString() {
		return "Carta [face=" + face + ", naipe=" + naipe + "]";
	}
	
	
	
}
