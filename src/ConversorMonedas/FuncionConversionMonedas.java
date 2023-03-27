package ConversorMonedas;

import javax.swing.JOptionPane;


public class FuncionConversionMonedas {

	
	// Tasas de conversion a fecha de 21 de Marzo de 2023
	
		double PAB_A_USD$ = 1.00 ; // 1 Balboa Panameño     = 1 Dolar Estaunidense
		double PAB_A_CAD$ = 1.37 ; // 1 Balboa Panameño     = 1.37 Dolares Canadienses
		double PAB_A_MXN$ = 18.60 ; // 1 Balboa Panameño   = 18.60 Pesos Mexicanos
		double PAB_A_ARS$ = 205.01 ; // 1 Balboa Panameño  = 205.01 Pesos Argentinos
		double PAB_A_KRW₩ = 1294.66 ; // 1 Balboa Panameño  = 1294.66 Won sur-coreano
		double PAB_A_GBP£  = 0.82  ; // 1 Balboa Panameño  = 0.82 Libras Esterlinas
		double PAB_A_EUR$ = 0.93 ; // 1 Balboa Panameño    = 0.93 Euros
		double PAB_A_JPY¥ = 132.44 ; // 1 Balboa Panameño  = 132.44 Yenes
		
		
		
		double JPY¥_A_PAB = 0.0076; // 1 Yen = 0.0076 Balboas Panameños
		double EUR$_A_PAB = 1.03; // 1 Euro = 1.03 Balboas Panameños
		double GBP£_A_PAB = 1.22 ; // 1 Libra Esterlina = 1.22 Balboas Panameños
		double KRW₩_A_PAB = 0.00077; // 1 Won sur-coreano = 0.00077 Balboas Panameños
		double ARS$_A_PAB = 0.0049; // 1 Peso Argentino = 0.0049 Balboas Panameños
		double MXN$_A_PAB = 0.054; // 1 Peso Mexicano = 0.054 Balboas Panameños
		double CAD$_A_PAB = 0.73; //Dolar Canadiense = 0.73 Balboa Panameño
		double USD$_A_PAB = 1.00; //Dolar Estaunidense = 1 Balboa Panameño
		
		

		OperacionConvertirMonedas conversiones = new OperacionConvertirMonedas();

		public void ConvertirDivisas(double Cantidad) {
			//Mediante el "JOptionPane.showInputDialog" se busca que al ejecutar el codigo se muestre una ventana que contendra
			//en este caso las opciones para elegir, asi como la optencion de valores para el "Swicht".
			
		 String opcionesConversionDivisas = (JOptionPane.showInputDialog(null,
					"ELige la divisa a la cual desea convertir su dinero.", "Conversiones", JOptionPane.QUESTION_MESSAGE, null,
					new Object[] 
						{"De Balboas a USD$(Dolares Estaunidenses",
						"De Balboas a CAD$(Dolares Canadienses",
						"De Balboas a MXN$(Pesos Mexicanos",
						"De Balboas a ARS$(Pesos Argentinos",
						"De Balboas a KRW₩(Won sur-coreano)",
						"De Balboas a GBP£(Libras Esterlinas)",
						"De Balboas a EUR$(Euros)",
						"De Balboas a JPY¥(Yenes)",
						"De Yenes a PAB(Balboas Panameños)",
						"De Euros a PAB(Balboas Panameños)",
						"De Libras Esterlinas a PAB(Balboas Panameños)",
						"De Won sur-coreano a PAB(Balboas Panameños)",
						"De Pesos Argentinos a PAB(Balboas Panameños)",
						"De Pesos Mexicanos a PAB(Balboas Panameños)",
						"De Dolares Canadienses a PAB(Balboas Panameños)",
						"De Dolares Estaunidenses a PAB(Balboas Panameños)"}, "Seleccion")).toString();	
			
			
			switch (opcionesConversionDivisas) {
			
			
			// en cada caso se sigue el siguiente orden par  los valores de la funcion "ConvertirDinero":
			
			//cantidad - recible el valor que introduce el usuario
			//en la segunda posicion se coloca la varible que contiene el factor de conversion segun las varibles definas al inicio de prensete clase.
			//en la tercera posicion se coloca el nombre de la monena en cuestion a la cual será convertido el valor introducido por el usuario.
			//en la cuarta posicion se coloca el simbolo de la monea a la que se convertira el valor introducido por el usuario.
				case "De Balboas a USD$(Dolares Estaunidenses":
					conversiones.ConvertirDinero(Cantidad, "Balboas", PAB_A_USD$, "Dolares", "$");
					break;
					
				case "De Balboas a CAD$(Dolares Canadienses":
					conversiones.ConvertirDinero(Cantidad,"Balboas", PAB_A_CAD$, "Dolares Canadienses", " $");
					break;
					
		
				case "De Balboas a MXN$(Pesos Mexicanos":
					conversiones.ConvertirDinero(Cantidad,"Balboas", PAB_A_MXN$, "Pesos Mexicanos", " $");
					break;
					
		
				case "De Balboas a ARS$(Pesos Argentinos":
					conversiones.ConvertirDinero(Cantidad,"Balboas", PAB_A_ARS$, "Pesos Argentinos", " $");
					break;
					
				case "De Balboas a KRW₩(Won sur-coreano)":
					conversiones.ConvertirDinero(Cantidad,"Balboas", PAB_A_KRW₩, "Won sul-coreano", " ₩");
					break;
					
				case "De Balboas a GBP£(Libras Esterlinas)":
					conversiones.ConvertirDinero(Cantidad,"Balboas", PAB_A_GBP£, "Libras Esterlinas", " £");
					break;
					
		
				case "De Balboas a EUR$(Euros)" :
					conversiones.ConvertirDinero(Cantidad,"Balboas", PAB_A_EUR$, "Euros", " €");
					break;
					
					
				case "De Balboas a JPY¥(Yenes)": 
					conversiones.ConvertirDinero(Cantidad,"Balboas", PAB_A_JPY¥, "Yenes Japones",  " ¥");
					break;
					
				
					
					
					
					
				case "De Yenes a PAB(Balboas Panameños)":
					
					conversiones.ConvertirDinero(Cantidad,"Yenes", JPY¥_A_PAB, "Balboas Panameños", "B/.");
					break;
					
					
				case "De Euros a PAB(Balboas Panameños)":
					conversiones.ConvertirDinero(Cantidad, "Euros", EUR$_A_PAB, "Balboas Panameños", "B/.");
					break; 
					
					
				case "De Libras Esterlinas a PAB(Balboas Panameños)":
					conversiones.ConvertirDinero(Cantidad, "Libras Esterlinas", GBP£_A_PAB, "Balboas Panameños", "B/.");
					break; 
					
					
				case "De Won sur-coreano a PAB(Balboas Panameños)":
					conversiones.ConvertirDinero(Cantidad, "Won sul-coreano", KRW₩_A_PAB, "Balboas Panameños", "B/.");
					break; 
					
					
				case "De Pesos Argentinos a PAB(Balboas Panameños)":
					conversiones.ConvertirDinero(Cantidad, "Pesos Argentinos", ARS$_A_PAB, "Balboas Panameños", "B/.");
					break;
					
					
				case "De Pesos Mexicanos a PAB(Balboas Panameños)":
					conversiones.ConvertirDinero(Cantidad, "Pesos Mexicanos", MXN$_A_PAB, "Balboas Panameños", "B/.");
					break;
					
					
				case "De Dolares Canadienses a PAB(Balboas Panameños)":
					conversiones.ConvertirDinero(Cantidad,"Dolares Canadienses", CAD$_A_PAB, "Balboas Panameños", "B/.");
					break;
					
					
				case "De Dolares Estaunidenses a PAB(Balboas Panameños)":
					conversiones.ConvertirDinero(Cantidad,"Dolares Estaunidenses", USD$_A_PAB, "Balboas Panameños", "B/.");
					break;
					
		
				}

		}
	
}
