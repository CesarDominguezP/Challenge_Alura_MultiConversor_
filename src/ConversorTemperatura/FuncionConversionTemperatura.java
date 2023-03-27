package ConversorTemperatura;

import javax.swing.JOptionPane;

public class FuncionConversionTemperatura {
public void ConvertirTemperatura(double valorTemperatura) {
		
		//Mediante el "JOptionPane.showInputDialog" se busca que al ejecutar el codigo se muestre una ventana que contendra
		//en este caso las opciones para elegir, asi como la optencion de valores para el "Swicht".
		
		String opcionesConversionTemperatura = (JOptionPane.showInputDialog(null,
				"Elija la escala a la cual desea convertir la temperatura.", "Escalas de Temperatura", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] 
					{"Fahrenheit a Kelvin",
					"Farenhein a Celcius",
					"Kelvin a Fahrenheit",
					"Kelvin a Celcius",
					"Celcuis a Fahrenheit",
					"Celcuis a Kelvin"}, "Seleccion")).toString();
		
		
		switch (opcionesConversionTemperatura)  {
		
		//Ya que para las conversiones entre escalas de temperaturas existen formulas con valores preestablecidos, puede considerarse funcional 
		//el incluir el proceso de conversion en cada caso, de tal forma que no involucre la creacion de clases o funciones adicionales.
		
			case "Fahrenheit a Kelvin":
				
				double fahrenheitAKelvin = ((5 * (valorTemperatura - 32)) / 9) + 273.15;
				fahrenheitAKelvin = (double) Math.round(fahrenheitAKelvin * 100d) / 100;
				JOptionPane.showMessageDialog(null, valorTemperatura + " ºF (grados Fahrenheit) = " + fahrenheitAKelvin + " K (grados Kelvin).");
				break;
			
			case "Farenhein a Celcius":
				
				double fahrenheitACelsius = ((5 * (valorTemperatura - 32)) / 9);
				fahrenheitACelsius = (double) Math.round(fahrenheitACelsius * 100d) / 100;
				JOptionPane.showMessageDialog(null,  valorTemperatura + " ºF (grados Fahrenheit) = " + fahrenheitACelsius + " ºC (grados Celsius).");
				break;
				
			
			case "Kelvin a Fahrenheit":
				
				double kelvinAFahrenheit = (((9 * (valorTemperatura - 273.15)) / 5) + 32);
				kelvinAFahrenheit = (double) Math.round(kelvinAFahrenheit * 100d) / 100;
				JOptionPane.showMessageDialog(null, valorTemperatura + " K (grados Kelvin) = " + kelvinAFahrenheit + " ºF (grados Fahrenheit).");
				break;
			
			case "Kelvin a Celcius":
				
				double kelvinACelsius = valorTemperatura - 273.15;
				kelvinACelsius = (double) Math.round(kelvinACelsius * 100d) / 100;
				JOptionPane.showMessageDialog(null, valorTemperatura + " K (grados Kelvin) = " + kelvinACelsius + " ºC (grados Celsius).");
				break;
				
			
			case "Celcuis a Fahrenheit":
				
				double celsiusAFahrenheit = (((valorTemperatura * 9) / 5) + 32);
				celsiusAFahrenheit = (double) Math.round(celsiusAFahrenheit * 100d) / 100;
				JOptionPane.showMessageDialog(null, valorTemperatura + " ºC (grados Celsius) = " + celsiusAFahrenheit + " ºF (grados Fahrenheit).");
				break;
			
			case "Celcuis a Kelvin":
				
				double celsiusAKelvin = valorTemperatura + 273.15;
				celsiusAKelvin = (double) Math.round(celsiusAKelvin * 100d) / 100;
				JOptionPane.showMessageDialog(null, valorTemperatura + " ºC (grados Celsius) = " + celsiusAKelvin + " K (grados Kelvin).");
				break;
			
			
			}
		
		
	}
}
