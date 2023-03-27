package ConversorMonedas;

import javax.swing.JOptionPane;

public class OperacionConvertirMonedas {

	//Dado que en la conversion de monedas se puede recurrir a la convertion mediante la multiplicacion por el factor de conversion, se define entonces una sola 
	//funcion que va a solicitar datos especificos segun la monena y el cambio, pero que realizara la misma operacion.
	
		public void ConvertirDinero(double valor, String moneda, double equivalente,String nomenclatura, String simbolo) {
			double ValorCovertido = valor*equivalente;
			ValorCovertido = (double) Math.round(ValorCovertido*100d)/100;
			JOptionPane.showMessageDialog(null, valor + " " + moneda + " = " + simbolo  + ValorCovertido + " " + nomenclatura + ".");
		}

	
	
	
}
