package ConversorLongitud;

import javax.swing.JOptionPane;

public class OperacionConvertirLongitud {


	
	//Las conversiones de medidas de longitud se dan mediante dos operaciones (Multiplicación o División), y ya que aplica para todas las medidas lineales,
	//se definen dos casos, los cuales estan condicionados como: tipo: 1 y 2. el programador define el tipo al llamar la función segun si se debe multiplicar
	//o dividir para poder realizar la convesión.
	
	public void ConvertirLongitud(double valor, String unidad, double factorConversión, String nomenclatura, double tipo) {
		double longitudCovertida;

		if (tipo == 1) {

			longitudCovertida = valor * factorConversión;
			longitudCovertida = (double) Math.round(longitudCovertida*1000d)/1000;
			JOptionPane.showMessageDialog(null, valor  + " "+ unidad + " = " + longitudCovertida + nomenclatura + ".");

		} else if (tipo == 2) {

			longitudCovertida = valor / factorConversión;
			longitudCovertida = (double) Math.round(longitudCovertida*1000d)/1000;
			JOptionPane.showMessageDialog(null, valor + " "+ unidad + " = " + longitudCovertida + nomenclatura + ".");
		}

	}

}