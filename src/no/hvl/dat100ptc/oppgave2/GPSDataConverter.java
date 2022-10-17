package no.hvl.dat100ptc.oppgave2;

import no.hvl.dat100ptc.TODO;
import no.hvl.dat100ptc.oppgave1.GPSPoint;

public class GPSDataConverter {

	// konverter tidsinformasjon i gps data punkt til antall sekunder fra midnatt
	// dvs. ignorer information om dato og omregn tidspunkt til sekunder
	// Eksempel - tidsinformasjon (som String): 2017-08-13T08:52:26.000Z
    // skal omregnes til sekunder (som int): 8 * 60 * 60 + 52 * 60 + 26 
	private static int TIME_STARTINDEX = 11; // posisjon for start av tidspunkt i timestr

	
	public static int toSeconds(String timestr) {
		

		// TODO
		// OPPGAVE - START
		
		int secs;
		int hr, min, sec;
		
		String[] oppdeling = timestr.substring(TIME_STARTINDEX,19).split(":");
		hr = Integer.parseInt(oppdeling[0]);
		min = Integer.parseInt(oppdeling[1]);
		sec = Integer.parseInt(oppdeling[2]);
		
		secs = hr * 60 * 60 + min + 60 + sec;
	
		System.out.println("tiden i sekunder er ");
		 
		return secs;
		

		// OPPGAVE - SLUTT
		
	}

	public static GPSPoint convert(String timeStr, String latitudeStr, String longitudeStr, String elevationStr) {
//time er 31946, latitude er 60.385390, longitude er 5.217217 og elevation er 61.9.
		
		int Time = toSeconds(timeStr);
		double Latitude = Double.parseDouble(latitudeStr);
		double Longitude = Double.parseDouble(longitudeStr);
		double Elevation = Double.parseDouble(elevationStr);
		
		return new GPSPoint(Time, Latitude, Longitude, Elevation);
	// OPPGAVE - SLUTT ;
	    
	}
}


