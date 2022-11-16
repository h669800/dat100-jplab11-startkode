package no.hvl.dat100.jplab11.oppgave4;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		// Creates a FileWriter
		FileWriter file;
		BufferedWriter buffer;
		try {
			file = new FileWriter(filnavn);
			buffer = new BufferedWriter(file);
			
		      // Writes the string to the file
		      buffer.write(samling.toString());

		      // Closes the writer
		      buffer.close();
		      return true;
		      
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;

		
	}
}
