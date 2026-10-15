package com.app.presentacion;

import com.app.logica.Artista;
import com.app.logica.Cancion;
import com.app.logica.ControladoraLogica;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		Calendar cal1 = new GregorianCalendar(1972, Calendar.AUGUST, 9);
		Date FechaOdeatri = cal1.getTime();
		
		Calendar cal2 = new GregorianCalendar(2009, Calendar.DECEMBER, 11);
		Date FechaShakira = cal2.getTime();

		ControladoraLogica conLog = new ControladoraLogica();
		try {
			Artista a1 = new Artista("odetari","hyperpop", "Estados Unidos", 31, FechaOdeatri);
			conLog.crearArtista(a1);
			
			Artista a2 = new Artista("Shakira", "Pop latino", "colombia", 49, FechaShakira);
			conLog.crearArtista(a2);
		// INSTANCIAR DOS CANCIONES
			Cancion c1 = new Cancion("heavy love", 2.23f, 2024);
			conLog.crearCancion(c1);
			Cancion c2 = new Cancion("Loba", 3.50f, 2009);
			conLog.crearCancion(c2);
			
		} catch (Exception e) {
			System.out.println("No se pudo crear el elemento: " + e.getMessage());
		}

		// ----- LECTURA DE ARTISTAS -----
		System.out.println("=== TODOS LOS ARTISTAS ===");
		List<Artista> artistas = conLog.listarArtistas();
		for (Artista a : artistas) {
		System.out.println(a);
		}
		System.out.println("=== BUSCAR ARTISTA CON ID 1 ===");
		Artista encontrado = conLog.buscarUnArtista(1);
		if (encontrado != null) {
		System.out.println(encontrado);
		} else {
		System.out.println("No existe un artista con ese id");
		}
		System.out.println("=== BUSCAR ARTISTA CON ID 999 ===");
		Artista noExiste = conLog.buscarUnArtista(999);
		if (noExiste != null) {
		System.out.println(noExiste);
		} else {
		System.out.println("No existe un artista con ese id");
		
	}
		
		// ----- LECTURA DE CANCIONES -----
				System.out.println("=== TODOS LAS CANCIONES ===");
				List<Cancion> cancion1 = conLog.listarCanciones();
				for (Cancion a : cancion1) {
				System.out.println(a);
				}
				System.out.println("=== BUSCAR CANCION CON ID 1 ===");
				Cancion encontrado1 = conLog.buscarCancion(1);
				if (encontrado1 != null) {
				System.out.println(encontrado1);
				} else {
				System.out.println("No existe un cancion con ese id");
				}
				System.out.println("=== BUSCAR CANCION CON ID 999 ===");
				Cancion noExiste1 = conLog.buscarCancion(999);
				if (noExiste1 != null) {
				System.out.println(noExiste1);
				} else {
				System.out.println("No existe una cancion con ese id");
				
				//5- Los datos de ambas ejecuciones son igules, lo unico que cambia es el id.
			}
}

}
