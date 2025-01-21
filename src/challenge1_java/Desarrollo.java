package challenge1_java;


import javax.swing.*;


public class Desarrollo {
	
	public void iniciar()  {
	
	
		// menú de opciones
		
		Object [] opciones ={"Conversor de Moneda","Conversor de Temperatura"}; 
		Object opcion_elegir = JOptionPane.showInputDialog(null,"Seleccione un opción de conversión", "Menú",JOptionPane.QUESTION_MESSAGE,null,opciones, opciones[0]);
		String opcion_elegida =(String)opcion_elegir;
		
	
		if (opcion_elegida!=null) {
			
			switch (opcion_elegida){
			
			case "Conversor de Moneda" :
				
				ConversorMoneda conversorMoneda = new ConversorMoneda();
				conversorMoneda.obtener_datos();
				break;
				
				
			
			case  "Conversor de Temperatura":
				
				ConversorTemperatura conversorTemperatura = new ConversorTemperatura();
				conversorTemperatura.obtener_datos();
				break;
			
			default:
				break;
				
			}
			
		}
		
	       
	}
		
		
}

