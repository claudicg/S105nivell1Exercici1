package n1exercici1.handlers;

import java.io.File;
import java.util.Arrays;

import n1exercici1.exceptions.DirectoriException;

public class Alfabet {
	
	public void ordenarAlfabet(String path) throws DirectoriException {
		
		File directori = new File(path);
		if(!directori.isDirectory()) {
			throw new DirectoriException("La ruta donada no és un directori vàlid");
		}
		
		File[] arxius = directori.listFiles();
		if(arxius == null || arxius.length == 0) {
			throw new DirectoriException("El directori està buit");
		}else {
			Arrays.sort(arxius);
			
			for(File arxiu : arxius) {
				if(arxiu.isFile()) {
					System.out.println(arxiu.getName());
				}	
			}	
		}
		
	}
}
