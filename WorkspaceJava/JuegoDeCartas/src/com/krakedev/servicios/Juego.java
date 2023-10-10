package com.krakedev.servicios;

import java.util.ArrayList;

import com.krakedev.entidades.Carta;
import com.krakedev.entidades.Naipe;

public class Juego {
	private Naipe naipe;
	private ArrayList<ArrayList<Carta>> cartasJugador;
	private ArrayList<Carta> naipeBarajado;

	public Juego(ArrayList<String> jugadores) {
		naipe = new Naipe();
		naipeBarajado = naipe.barajar();
		cartasJugador = new ArrayList<>();

		for (int i = 0; i < jugadores.size(); i++) {
			cartasJugador.add(new ArrayList<>());
		}
	}

	public void entregarCartas(int cartaPorJugador) {
		int numJugadores = cartasJugador.size();
		int numCartas = cartaPorJugador * numJugadores;

		int jugadores = 0;
		for (int i = 0; i < numCartas; i++) {
			Carta carta = naipeBarajado.get(i);
			cartasJugador.get(jugadores).add(carta);

			jugadores = (jugadores + 1) % numJugadores;
		}

	}

	public String determinarGanador() {
		int sumaGanador = 0;
		int idGanador = devolverTotal("jugador 1");;

		for (int i = 0; i < cartasJugador.size(); i++) {
			int suma = devolverTotal("jugador " + (i+1));

			if (suma > sumaGanador) {
				idGanador = i;
				sumaGanador = suma;
			}
		}
		if (idGanador != -1) {
			return "Jugador " + (idGanador + 1);
		} else {
			return "No hay ganador";
		}
	}

	public int devolverTotal(String idJugador) {

		int id = Integer.parseInt(idJugador.substring(idJugador.length() - 1)) - 1;

		ArrayList<Carta> cartaJugador = cartasJugador.get(id);
		int sumaValores = 0;

		for (int i = 0; i < cartaJugador.size(); i++) {
			Carta carta = cartaJugador.get(i);
			sumaValores += carta.getNumero().getValor();
		}
		return sumaValores;
	}

}
