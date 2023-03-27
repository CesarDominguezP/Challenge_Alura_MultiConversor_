package ConversorLongitud;


import javax.swing.JOptionPane;

public class FuncionConversionLongitud {
	
	OperacionConvertirLongitud convertir = new OperacionConvertirLongitud();

	public void convertirMedidas(double medida) {

		
		//Mediante el "JOptionPane.showInputDialog" se busca que al ejecutar el codigo se muestre una ventana que contendra
		//en este caso las opciones para elegir, asi como la optencion de valores para el "Swicht".
		String MedidasLongitud = (JOptionPane.showInputDialog(null,
				"Elija el tipo de conversion a realizar para la longitud medida", "Conversiones de Longitud",
				JOptionPane.QUESTION_MESSAGE, null,
				new Object[] { "Años Luz a Millas", 
						"Años Luz a Kilómetros",
						"Kilómetros a Años Luz",
						"Kilómetros a Millas", 
						"Kilómetros a Metros", 
						"Metros a Millas", 
						"Metros a Kilómetros",
						"Metros a Pies", 
						"Metros a Pulgadas", 
						"Metros a Centímetros", 
						"Pies a Metros",
						"Pies a Pulgadas", 
						"Pies a Centímetros",
						"Pulgadas a Metros", 
						"Pulgadas a Pies",
						"Pulgadas a Centímetros",
						"Decímetros a Centímetros", 
						"Decímetros a Milímetros", 
						"Centímetros a Metros", 
						"Centímetros a Pies",
						"Centímetros a Pulgadas",
						"Centímetros a Decímetros",
						"Centímetros a Milímetros",
						"Milímetros a Decímetros", 
						"Milímetros a Centímetros" },"Seleccion")).toString();
		
		
		switch (MedidasLongitud) {
		
		//Los datos a colocar al llamar la funcion ".convertirLongitud" son:
		//medida, esta varible recibe el valor introducido por el usuario.
		//en la segunda posición se coloca el factor de conversión especifico para pasar de una medida a otra.
		//en la tercera posición se coloca el simbolo de la unidad a la que se convirtio el valor introducido por el usuario y su nombre.
		// en la ultima condicion de la funcion ".convertirLongitud" se elige: 1 para conversiones mediante multiplicacion; y 2 para conversiones mediante division.
		
			case "Años Luz a Millas":
			convertir.ConvertirLongitud(medida, "Años Luz", 5.8786E+12, "Mi (Millas)", 1);
			break;
			
			case "Años Luz a Kilómetros":
			convertir.ConvertirLongitud(medida, "Años Luz", 9.4607E+12, "km (Kilómetros)", 1);
			break;
		
			
			case "Kilómetros a Años Luz":
			convertir.ConvertirLongitud(medida, "Kilómetros", 9.4607E+12, "Años Luz)", 2);
			break;
		
			
			case "Kilómetros a Millas":
			convertir.ConvertirLongitud(medida,"Kilómetros", 1.609344, "Mi (Millas)", 2);
			break;
		
			
			case "Kilómetros a Metros":
			convertir.ConvertirLongitud(medida,"Kilómetros", 1000, "m (metros)",1);
			break;
		
			
			case "Metros a Millas":
			convertir.ConvertirLongitud(medida, "Metros", 1609.34, "Mi (Millas)",2);
			break;
		
			
			case "Metros a Kilómetros":
			convertir.ConvertirLongitud(medida, "Metros", 1000, "km (Kilómetros)",2);
			break;
		
			
			case "Metros a Pies":
			convertir.ConvertirLongitud(medida, "Metros", 3.2808399, "ft (Pies)",1);
			break;
		
			
			case "Metros a Pulgadas":
			convertir.ConvertirLongitud(medida, "Metros", 39.3700787, "in (Pulgadas)",1);
			break;
		
			
			case "Metros a Centímetros":
			convertir.ConvertirLongitud(medida, "Metros", 100, "cm (Centímetros)",1);
			break;
		
			
			case "Pies a Metros":
			convertir.ConvertirLongitud(medida, "Pies", 3.2808399, "m (Metros)",2);
			break;
		
			
			case "Pies a Pulgadas":
			convertir.ConvertirLongitud(medida,"Pies", 12, "in (Pulgadas)",1);
			break;
		
			
			case "Pies a Centímetros":
			convertir.ConvertirLongitud(medida,"Pies", 30.48, "cm (Centímetros)",1);
			break;
		
			
			case "Pulgadas a Metros":
			convertir.ConvertirLongitud(medida, "Pulgadas", 39.3700787, "m (Metros)",2);
			break;
		
			
			case "Pulgadas a Pies":
			convertir.ConvertirLongitud(medida, "Pulgadas", 12, "ft (Pies)",2);
			break;
		
			
			case "Pulgadas a Centímetros":
			convertir.ConvertirLongitud(medida, "Pulgadas", 2.54, "cm (Centímetros)",1);
			break;
		
	
			
			case "Decímetros a Centímetros":
			convertir.ConvertirLongitud(medida, "Decímetros", 10, "cm (Centímetros)",1);
			break;
		
	
			
			case "Decímetros a Milímetros":
			convertir.ConvertirLongitud(medida, "Decímetros", 100, "mm (Milímetros)",1);
			break;
		
	
			case "Centímetros a Metros":
			convertir.ConvertirLongitud(medida, "Centímetros", 100, "m (Metros)",2);
			break;
		
			
			case "Centímetros a Pies":
			convertir.ConvertirLongitud(medida, "Centímetros", 30.48, "ft (Pies)",2);
			break;
	
			
			case "Centímetros a Pulgadas":
			convertir.ConvertirLongitud(medida, "Centímetros", 2.54, "in (Pulgadas)",2);
			break;
		
	
			
			case "Centímetros a Decímetros":
			convertir.ConvertirLongitud(medida, "Centímetros", 10, "dm (Decímetros)",2);
			break;
		
	
			
			case "Centímetros a Milímetros":
			convertir.ConvertirLongitud(medida, "Centímetros", 10, "mm (Milímetros)",1);
			break;
		
			
			case "Milímetros a Decímetros":
				convertir.ConvertirLongitud(medida, "Milímetros", 100, "dm (Decímetros)",2);
				break;
				
				
			case "Milímetros a Centímetros":
			convertir.ConvertirLongitud(medida, "Milímetros", 10, " cm (Centímetros)",2);
			break;
		
				
			
		
		
		
		
		
		
		}

	}

}


