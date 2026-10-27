package com.krakedev.juegos.servicios;

import java.util.ArrayList;

import com.krakedev.juegos.entidades.Carta;

public class Dealer {
	

	private ArrayList<Carta> naipe;

	public ArrayList<Carta> getNaipe() {
		return naipe;
	}

	public void setNaipe(ArrayList<Carta> naipe) {
		this.naipe = naipe;
	}
	
	public Dealer () {
		naipe = new ArrayList<Carta>();
		generarNaipe();
	}

	public void generarNaipe() {
		
		ArrayList<String> palos = new ArrayList<String>();
		ArrayList<String> valores = new ArrayList<String>();
		
		for (int i = 1 ; i < 5 ; i++) {
			if (i == 1) {
				palos.add("T");
			}else if (i == 2) {
				palos.add("CN");
			}else if (i == 3) {
				palos .add("CR");
			}else {
				palos.add("D");
			}
			
		}
		for (int j = 1 ; j<14;j++) {
			if (j == 1) {
				valores.add("A");
			}else if (j == 2) {
				valores.add("2");
			}else if (j == 3) {
				valores .add("3");
			}else if (j == 4) {
				valores.add("4");
			}else if (j == 5) {
				valores .add("5");
			}else if (j == 6) {
				valores.add("6");
			}else if (j == 7) {
				valores .add("7");
			}else if (j == 8) {
				valores.add("8");
			}else if (j == 9) {
				valores .add("9");
			}else if (j == 10) {
				valores.add("10");
			}else if (j == 11) {
				valores .add("J");
			}else if (j == 12) {
				valores.add("Q");
			}else if (j == 13) {
				valores .add("K");
			}
			
		}
		for (int i = 0; i < palos.size(); i++) {
		    for (int j = 0; j < valores.size(); j++) {
		        Carta c = new Carta();
		        c.setValor(valores.get(j));
		        c.setPalo(palos.get(i));
		        naipe.add(c);
		    }
		}
	}
	
	public void imprimirNaipe () {
		
		for (Carta a : naipe) {
			a.imprimir();
		}
		
	}
	
	public int generarAleatorio(int maximo) {

		int numeroAleatorio=(int)((Math.random()*maximo)+1);
		return numeroAleatorio;
	}
	
	
}

	
