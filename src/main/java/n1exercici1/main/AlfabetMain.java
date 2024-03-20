package n1exercici1.main;

import n1exercici1.exceptions.DirectoriException;
import n1exercici1.handlers.Alfabet;

public class AlfabetMain {

	public static void main(String[] args) throws DirectoriException {
		
		String path = "";
		if(args.length == 1) {
			path = args[0];	
		}
		Alfabet demo = new Alfabet();
		demo.ordenarAlfabet(path);
	}

}
