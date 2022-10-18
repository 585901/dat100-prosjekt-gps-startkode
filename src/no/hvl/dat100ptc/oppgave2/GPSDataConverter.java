package no.hvl.dat100ptc.oppgave2;

import java.util.Scanner;

import no.hvl.dat100ptc.TODO;
import no.hvl.dat100ptc.oppgave1.GPSPoint;

// konverter tidsinformasjon i gps data punkt til antall sekunder fra midnatt
// dvs. ignorer information om dato og omregn tidspunkt til sekunder
// Eksempel - tidsinformasjon (som String): 2017-08-13T08:52:26.000Z
// skal omregnes til sekunder (som int): 8 * 60 * 60 + 52 * 60 + 26 


public class GPSDataConverter {


	private static int TIME_STARTINDEX = 11; // posisjon for start av tidspunkt i timestr

	
	public static int toSeconds(String timestr) {
		

		// TODO
		// OPPGAVE - START
		
		int secs;
 		int hr, min, sec;

 		// TODO
 		// OPPGAVE - START
 		String timer = timestr.substring(TIME_STARTINDEX, 13);
 		String minutter = timestr.substring(14, 16);
 		String sekunder = timestr.substring(17, 19);

 		hr = Integer.parseInt(timer);
 		min = Integer.parseInt(minutter);
 		sec = Integer.parseInt(sekunder);

 		
 		secs = 60 * hr + 60 * min + sec;

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




