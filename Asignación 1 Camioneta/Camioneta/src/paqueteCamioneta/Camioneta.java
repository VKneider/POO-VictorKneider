package paqueteCamioneta;

public class Camioneta {

	private int ruedas;
	   
    private int largo;
   
    private int ancho;
   
    private int motor;
   
    private String color;
   
    private boolean asientoCuero, climatizador;
	
	private boolean automatico;
	
	
	public Camioneta() {
		
	ruedas=4;	
	largo=3;
	ancho=2;
	motor=2000;
	
	
	}
	
	
	//M�TODO SETTER "color"
	public void asignaColor(String p1) {
		
		color=p1;
		
	}
	
	//M�TODO SETTER "asientoCuero"
	public void asignaAsientoCuero(String p1) {
		
		if (p1.equalsIgnoreCase("si")) {asientoCuero=true; } else { asientoCuero=false;	}
	
	}
	
	
	//M�TODO SETTER "automatico" / "sincronico"
	public void asignaAutomatico(String p1) {
		
		if (p1.equalsIgnoreCase("si")) {automatico=true;  } else { automatico=false; 	}
	
	}
	
	
	//M�TODO SETTER "climatizador"
	public void asignaClimatizador(String p1) {
		
		if (p1.equalsIgnoreCase("si")) {climatizador=true; } else {climatizador=false; }
		
	}
	
	
	//M�TODO GETTER "color"
	
	public String dimeColor() {return "El color de la camioneta es "+color;}
	

	
	//M�TODO GETTER "asientoCuero"
	
	public String dimeAsientoCuero() {
		
		if(asientoCuero== true) { return "La camioneta cuenta con asientos de cuero"; } else { return "La camioneta no cuenta con asientos de cuero"; } 
		
	}
	
	
	
	//M�TODO GETTER "automatico" / "sincronico"
	
	public String dimeAutomatico() {
		
		if(automatico== true) { return "La camioneta cuenta con traccion automatica" ;} else { return "La camioneta cuenta con traccion sincronica" ;} 
		
	}
	

	//M�TODO GETTER "climatizador"
	public String dimeClimatizador() {
		
		if(climatizador== true){ return "La camioneta cuenta con aire acondicionado" ;} else { return "La camioneta no cuenta con aire acondicionado" ;} 
		
	}
	
	
	
	//M�TODO GETTER "todo"
	
	public String dimeCaracter�sticasGenerales() {	
		
		 return "La plataforma del vehiculo tiene " + ruedas + " ruedas, mide"+
		             +largo + " metros de largo y " + ancho + " metros de  ancho, " 
		            + dimeAutomatico() + ", en cuanto al aire acondicionado " + dimeClimatizador() + ","  + dimeAsientoCuero() + " y para finalizar  cuenta con un motor de " +motor + " caballos de fuerza";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
