package ConversorVelocidad;

import javax.swing.JOptionPane;

public class FuncionConversionVelocidad {

	
public void VelocidadesConvertir(double valorVelocidad) {
		
		
		String opcionesConversionVelocidades = (JOptionPane.showInputDialog(null,
				"Elija la conversión que desea realizar a la velocidad introducida", "Opciones de Conversión",JOptionPane.QUESTION_MESSAGE,null, new Object[] {
						"Nudo a mph (Millas por Hora)",
						"mph(Millas por Hora) a Nudo",
						"mph (Millas/Hora) a Km/h (Kilómetros/Hora)",
						"Km/h (Kilómetros/Hora) a mph (Millas por Hora)",
						"Km/h (Kilómetros/Hora) a m/s (Metros/Segundos)",
						"m/s (Metros/Segundos) a Km/h (Kilómetros/Hora)",},"")).toString();
		
		
		switch (opcionesConversionVelocidades) {
		
		
		case "Nudo a mph (Millas por Hora)":
			
			double nudoAMillasHora = valorVelocidad * 1.151; //velocidad por el factor de conversion
			nudoAMillasHora = (double) Math.round(nudoAMillasHora * 1000d) / 1000;
			JOptionPane.showMessageDialog(null, valorVelocidad + " Nudos = " + nudoAMillasHora + " mph.");
			
			break;
			
		case "mph(Millas por Hora) a Nudo":
			
			double millasHorasANudos = valorVelocidad/1.151;//velocidad entre el factor de conversion
			millasHorasANudos = (double) Math.round(millasHorasANudos * 1000d) / 1000;
			JOptionPane.showMessageDialog(null, valorVelocidad + " mph = " + millasHorasANudos + " Nudos.");
	
			break;
			
		case "mph (Millas/Hora) a Km/h (Kilómetros/Hora)":
			
			double millasHorasAKilometrosHora= valorVelocidad*1.60934;//velocidad por el factor de conversion
			millasHorasAKilometrosHora = (double) Math.round(millasHorasAKilometrosHora * 1000d) / 1000;
			JOptionPane.showMessageDialog(null, valorVelocidad + " mph = " + millasHorasAKilometrosHora + " Km/h.");
	
			break;
			
		case "Km/h (Kilómetros/Hora) a mph (Millas por Hora)":
			
			double KilometrosHoraAMillasHoras = valorVelocidad/1.60934;//velocidad entre el factor de conversion;
			KilometrosHoraAMillasHoras = (double) Math.round(KilometrosHoraAMillasHoras * 100d) / 100;
			JOptionPane.showMessageDialog(null, valorVelocidad + " Km/h = " + KilometrosHoraAMillasHoras + " mph.");
			
			break;
			
		case "Km/h (Kilómetros/Hora) a m/s (Metros/Segundos)":
			
			double KilometrosHoraAMetrosSegundos = valorVelocidad/3.6;//velocidad entre el factor de conversion;
			KilometrosHoraAMetrosSegundos = (double) Math.round(KilometrosHoraAMetrosSegundos * 100d) / 100;
			JOptionPane.showMessageDialog(null, valorVelocidad + " Km/h = " + KilometrosHoraAMetrosSegundos + " m/s.");
			
			break;
		
		case "m/s (Metros/Segundos) a Km/h (Kilómetros/Hora)":
			
			double MetrosSegundosAKilometrosHora = valorVelocidad*3.6;//velocidad por el factor de conversion;
			MetrosSegundosAKilometrosHora = (double) Math.round(MetrosSegundosAKilometrosHora * 100d) / 100;
			JOptionPane.showMessageDialog(null, valorVelocidad + " m/s = " + MetrosSegundosAKilometrosHora + " Km/h.");
			
			break;
		
		
		
		}
		
		
	}
	
	
	
}
