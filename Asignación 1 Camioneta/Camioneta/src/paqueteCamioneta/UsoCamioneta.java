package paqueteCamioneta;

import javax.swing.JOptionPane;

public class UsoCamioneta {

	
	public static void main(String[] args ) {
		
	Camioneta miCamioneta = new Camioneta();
	
	
	miCamioneta.asignaAsientoCuero(JOptionPane.showInputDialog("¿La camioneta cuenta con asientos de cuero? RESPONDER 'si' o 'no' "));
	miCamioneta.asignaClimatizador(JOptionPane.showInputDialog("¿La camioneta cuenta con aire acondicionado? RESPONDER 'si' o 'no' "));
	miCamioneta.asignaColor(JOptionPane.showInputDialog("¿De qué color es la camioneta? RESPONDER con nombre del color "));
	miCamioneta.asignaAutomatico(JOptionPane.showInputDialog("¿La camioneta cuenta con traccion automatica? RESPONDER 'si' o 'no'"));
	System.out.println(miCamioneta.dimeCaracterísticasGenerales());

	
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
