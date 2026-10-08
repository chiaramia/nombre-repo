package com.app.presentacion;

import com.app.logica.Artista;
import com.app.logica.Cancion;
import com.app.logica.ControladoraLogica;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

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

	}
}


