package n1exercici1.handlers;

import java.io.File;
import java.util.Arrays;

public class Alfabet {
	
	public void ordenarAlfabet() {
		
		File directori = new File("src/main/resources/ArxiusTxt");
		if(!directori.isDirectory()) {
			System.out.println("La ruta donada no és un directori vàlid");
		}
		
		File[] arxius = directori.listFiles();
		if(arxius == null || arxius.length == 0) {
			System.out.println("El directori està buit");
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
