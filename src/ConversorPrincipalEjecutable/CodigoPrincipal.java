package ConversorPrincipalEjecutable;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.UIManager;


import ConversorLongitud.FuncionConversionLongitud;
import ConversorMonedas.FuncionConversionMonedas;
import ConversorTemperatura.FuncionConversionTemperatura;
import ConversorVelocidad.FuncionConversionVelocidad;



public class CodigoPrincipal {
public static void main(String[] args) {
		
		//Las siguientes lineas de código son para personalizar la fuente, el color de texto y el color de fondo de los botones respectivamente.
		
		UIManager. put("OptionPane.messageFont", new Font("Segoe UI", Font.  ITALIC, 18));
		UIManager. put("OptionPane.messageForeground", Color.black);
		UIManager.put("Button.background", Color.white);
		
		//se crean funciones para enlazar la clase actual(CodigoEjecutandoProyecto) con las de cada conversor
		
		FuncionConversionMonedas divisas = new FuncionConversionMonedas();
		FuncionConversionTemperatura temp = new FuncionConversionTemperatura();
		FuncionConversionLongitud longitud = new FuncionConversionLongitud();
		FuncionConversionVelocidad velocidad = new FuncionConversionVelocidad();

		//el loop es una medida de control para que las condiciones se realicen y cuando se opte por cancelar posterior a una conversión el loop cierre y por ente la compilacion.
		//para que este inicialice se establece la varible "control" como true.
		
		boolean control = true;

		while (control) {
			
			//Mediante el "JOptionPane.showInputDialog" se busca que al ejecutar el codigo se muestre una ventana que contendra
			//en este caso las opciones para elegir, asi como la optencion de valores.
			
			String opcionesConversion = (JOptionPane.showInputDialog(null, "Seleccione el tipo de conversor que desea usar.",
					"MENU DE CONVERSORES", JOptionPane.QUESTION_MESSAGE, null, new Object[] { "Conversor de Divisas",
							"Conversorar de Temperatura", "Conversor de Medidas de Longitud","Conversor de Velocidades" },
					"Seleccione el tipo de conversor")).toString();

			//el JOptionPane.showInputDialog proporciona opciones elegibles por el "switch", importante definir previamente la varible, en este caso como un "String".
			
			switch (opcionesConversion) {
			

				case "Conversor de Divisas":
					        //solicitud para ingresar valor
							String valorCantidad = JOptionPane.showInputDialog("Porfavor ingrese la cantidad de dinero a convertir.");
			
							//condiciones que validan, primeramente inicializa, luego condiciona que el valor no sea "null" y que conincida solamente con el conjunto de numeros dados por el conjunto definido.
							if (ValorDinero(valorCantidad) & (valorCantidad != null) & valorCantidad.matches("[0-9]\\d*(\\.\\d+)?$")) {
							 
								//se tranforma el valor optenido (String) a uno double para poder realizar las operaciones.
								double miValorCantidad = Double.parseDouble(valorCantidad);
								divisas.ConvertirDivisas(miValorCantidad);
					
							//con esta condicion se desea saber si el usuario quiere que el loop sigan en funcion o si este debe detenerse y cerrar.	
								int seleccion1 = JOptionPane.showConfirmDialog(null, "¿Desea Realizar otra conversion?");
								
										if (JOptionPane.OK_OPTION == seleccion1) {
					
											System.out.println("OK_OPTION seleccionado");
					
										} else {
					
											control = false;
											JOptionPane.showMessageDialog(null, "Cerrando Programa.");
											break;
										}
					
										break;
			
							} else {
								System.out.println("Solo deben introducirse valores numericos");
								JOptionPane.showMessageDialog(null,"Valor o accion no permitida en esta sección, intente nuevamente.");
								break;
			
							}
					
					
	
				case "Conversorar de Temperatura":
					
							//solicitud para ingresar valor
							String valorTemperatura = JOptionPane.showInputDialog("Porfavor ingrese el valor de la temperatura tomada.");
							
							//condiciones que validan, primeramente inicializa, luego condiciona que el valor no sea "null" y que conincida solamente con el conjunto de numeros dados por el conjunto definido.
							if (ValorTemperatura(valorTemperatura) & (valorTemperatura != null) & (valorTemperatura.matches("^-?[0-9]\\d*(\\.\\d+)?$") )) {
			
								//se tranforma el valor optenido (String) a uno double para poder realizar las operaciones.
								double temperatura = Double.parseDouble(valorTemperatura);
								temp.ConvertirTemperatura(temperatura);
			
								//con esta condicion se desea saber si el usuario quiere que el loop sigan en funcion o si este debe detenerse y cerrar.
								int seleccion2 = JOptionPane.showConfirmDialog(null, "¿Desea Realizar otra conversion?");
			
									if (JOptionPane.OK_OPTION == seleccion2) {
				
										System.out.println("OK_OPTION seleccionado");
				
									} else {
				
										control = false;
										JOptionPane.showMessageDialog(null, "Cerrando Programa");
										break;
									}
			
									break;
			
							} else {
								System.out.println("Solo deben introducirse valores numericos.");
								JOptionPane.showMessageDialog(null,"Valor o accion no permitida en esta sección, intente nuevamente.");
								break;
			
							}
					
					
	
				case "Conversor de Medidas de Longitud":
	
							//solicitud para ingresar valor
							String medidaLongitud = JOptionPane.showInputDialog("Porfavor el valor de la longitud medida.");
			
							//condiciones que validan, primeramente inicializa, luego condiciona que el valor no sea "null" y que conincida solamente con el conjunto de numeros dados por el conjunto definido.
							if (ValorLongitud(medidaLongitud) & (medidaLongitud != null) & (medidaLongitud.matches("[0-9]\\d*(\\.\\d+)?$"))) {
				
								//se tranforma el valor optenido (String) a uno double para poder realizar las operaciones.
								double miMedidaLongitud = Double.parseDouble(medidaLongitud);
								longitud.convertirMedidas(miMedidaLongitud);
				
								//con esta condicion se desea saber si el usuario quiere que el loop sigan en funcion o si este debe detenerse y cerrar.
								int seleccion3 = JOptionPane.showConfirmDialog(null, "¿Desea Realizar otra conversion?");
				
									if (JOptionPane.OK_OPTION == seleccion3) {
				
										System.out.println("OK_OPTION seleccionado");
				
									} else {
					
										control = false;
										JOptionPane.showMessageDialog(null, "Cerrando Programa");
										break;
									}
				
									break;
			
							} else {
								System.out.println("Solo deben introducirse valores numericos.");
								JOptionPane.showMessageDialog(null,"Valor o accion no permitida en esta sección, intente nuevamente.");
								break;
			
							}
							
							
				case "Conversor de Velocidades":
					//solicitud para ingresar valor
					String velocidadRegistrada = JOptionPane.showInputDialog("Porfavor el valor de la longitud medida.");
	
					//condiciones que validan, primeramente inicializa, luego condiciona que el valor no sea "null" y que conincida solamente con el conjunto de numeros dados por el conjunto definido.
					if (ValorVelocidad(velocidadRegistrada) & (velocidadRegistrada != null) & (velocidadRegistrada.matches("[0-9]\\d*(\\.\\d+)?$"))) {
		
						//se tranforma el valor optenido (String) a uno double para poder realizar las operaciones.
						double miVelocidadRegistrada = Double.parseDouble(velocidadRegistrada);
						velocidad.VelocidadesConvertir(miVelocidadRegistrada);
		
						//con esta condicion se desea saber si el usuario quiere que el loop sigan en funcion o si este debe detenerse y cerrar.
						int seleccion4 = JOptionPane.showConfirmDialog(null, "¿Desea Realizar otra conversion?");
		
							if (JOptionPane.OK_OPTION == seleccion4) {
		
								System.out.println("OK_OPTION seleccionado");
		
							} else {
			
								control = false;
								JOptionPane.showMessageDialog(null, "Cerrando Programa");
								break;
							}
		
							break;
	
					} else {
						System.out.println("Solo deben introducirse valores numericos.");
						JOptionPane.showMessageDialog(null,"Valor o accion no permitida en esta sección, intente nuevamente.");
						break;
	
					}
					

			}

		}

	}




// Se busca inicializar las funciones respectivas para que las mismas reciban valores segun el caso.
	private static boolean ValorDinero(String valorCantidad) {

		return true;
	}
	

	private static boolean ValorTemperatura(String inputTemperatura) {

		return true;

	}
	

	private static boolean ValorLongitud(String medidaLongitud) {

		return true;
	}
	
	
	private static boolean ValorVelocidad(String velocidadRegistrada) {
		// TODO Auto-generated method stub
		return true;
	}
}
