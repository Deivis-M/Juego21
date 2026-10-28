package com.krakedev.juegos.test;

import com.krakedev.juegos.entidades.Jugador;
import com.krakedev.juegos.servicios.Juego21;

public class TestJuego21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Juego21 juego = new Juego21();
		
		Jugador j1 = new Jugador();
		j1.setNickname("Santiago");
		Jugador j2 = new Jugador();
		j2.setNickname("David");
		Jugador j3 = new Jugador();
		j3.setNickname("Eduardo");
		
		
		juego.agregarJugador(j1);
		juego.agregarJugador(j2);
		juego.agregarJugador(j3);
		
		juego.inicializar();
		juego.repartirRonda();
		j1.imprimir();
		j2.imprimir();
		j3.imprimir();
		
		juego.getDealer().imprimirNaipe();;
		
		
		
	}

}
