package com.krakedev.juegos.servicios;

import java.util.ArrayList;

import com.krakedev.juegos.entidades.Carta;
import com.krakedev.juegos.entidades.Jugador;

public class Juego21 {

	private ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
	private Dealer dealer;

	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	public Dealer getDealer() {
		return dealer;
	}

	public void setDealer(Dealer dealer) {
		this.dealer = dealer;
	}

	public void cargarValores() {

		for (Carta a : dealer.getNaipe()) {
			if (a.getValor().equals("A")) {
				a.setValorJuego(11);
			} else if (a.getValor().equals("J") || a.getValor().equals("Q") || a.getValor().equals("K")) {
				a.setValorJuego(10);
			} else {
				int numero = Integer.parseInt(a.getValor());
				a.setValorJuego(numero);
			}
		}

	}

	public void inicializar() {
		dealer = new Dealer();
		cargarValores();
	}

	public void agregarJugador(Jugador jugador) {
		jugadores.add(jugador);

	}

	public void repartirCarta(Jugador jugador) {
		Carta repartiCarta = dealer.entregarCarta();
		jugador.recibirCarta(repartiCarta);

	}

	public void repartirRonda() {
		for (Jugador j : jugadores) {
			repartirCarta(j);
			calcularTotal();
		}
	}

	public void calcularTotal() {
		for (Jugador jugador : jugadores) {
			int valorSumar = 0;
			for (Carta carta : jugador.getCartas()) {
				valorSumar = valorSumar + carta.getValorJuego();
			}
			jugador.setValorTotal(valorSumar);
		}
	}

	public ArrayList<Jugador> validarGanador() {
		ArrayList<Jugador> ganadores = new ArrayList<Jugador>();
		for (Jugador ganador : jugadores) {
			if (ganador.getValorTotal() == 21) {
				ganadores.add(ganador);
			}
		}
		return ganadores;
	}

}
