package com.krakedev.juegos.test;

import com.krakedev.juegos.servicios.Dealer;

public class TestAleatorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dealer d = new Dealer();
		
		for (int i = 0; i <25; i++) {
			int valor=d.generarAleatorio(10);
			System.out.println(valor);
			}
		}
		
	}


