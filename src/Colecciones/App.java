package Colecciones;

import java.util.HashSet;

public class App {

	public static void main(String[] args) {
		
		Restaurant rest1 = new Restaurant ("Can Roca", 10);
		Restaurant rest2 = new Restaurant ("El Bulli", 9);
		Restaurant rest3 = new Restaurant ("El Bulli", 11);
		Restaurant rest4 = new Restaurant ("El Bulli", 9);
		
		//He creado 4 restaurantes con las diferentes opciones para comprobar si los métodos funcionan.
		
		HashSet <Restaurant> listaRest = new HashSet<Restaurant>();
		
		listaRest.add(rest1);
		listaRest.add(rest2);
		listaRest.add(rest3);
		listaRest.add(rest4);
		
		// solo guardará en el el HashSet 3 restaurante ya que una tiene mismo nombre y misma puntaución
		
		for (Restaurant restaurante : listaRest) {
			System.out.println(restaurante.getNombre()+ "y su puntación es "+ restaurante.getPuntuacion());
		}
		
		
	}

}
