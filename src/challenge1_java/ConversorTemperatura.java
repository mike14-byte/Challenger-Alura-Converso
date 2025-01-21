package challenge1_java;

import javax.swing.JOptionPane;


public class ConversorTemperatura {
	public void obtener_datos() {

		// ingresar tipo moneda
		Object[] opciones_temperatura = { "Grado Celsius a Kelvin ", "Grado Kelvin a Celsius",
				"Grado Celsius a Grado Fahrenheit", "Grado Fahrenheit a Grado Celsius",
				"Grado Fahrenheit a Grado Kelvin" };
		Object opciones_elegir_temperatura = JOptionPane.showInputDialog(null, "Seleccione un opción de conversión",
				"Menú", JOptionPane.QUESTION_MESSAGE, null, opciones_temperatura, opciones_temperatura[0]);
		String opcionTemperatura_elegida = (String) opciones_elegir_temperatura;

		if (opciones_elegir_temperatura == null) {
			DeseaContinuar deseaContinuar = new DeseaContinuar();
			deseaContinuar.mensaje_final();
			// por si escoge no seguir se sale del programa
			System.exit(0);
		}

		try {
			// ingresar valor
			String opcion_cantidad_grados = JOptionPane.showInputDialog(
					"Ingrese los grados que desea convertir \n Opción escogida : " + opcionTemperatura_elegida);
			double opcion_elegida_cantidadGrados = Double.parseDouble(opcion_cantidad_grados);

			// operación conversión
			ConversorTemperatura operacion = new ConversorTemperatura();
			operacion.resultado_conversion(opcionTemperatura_elegida, opcion_elegida_cantidadGrados);
		} // por si se ingresa un valor no permitido
		catch (NumberFormatException exception) {
			JOptionPane.showMessageDialog(null, "Valor no valido", "Error", JOptionPane.ERROR_MESSAGE);
			Desarrollo intentar_de_nuevo = new Desarrollo();
			intentar_de_nuevo.iniciar();

		}

	}

	public void resultado_conversion(String tipoConvercion, double cantidadGrados) {

		double resultado_conversion = 0;

		switch (tipoConvercion) {

		case "Grado Celsius a Kelvin ":

			resultado_conversion = cantidadGrados + 273.15;
			break;

		case "Grado Celsius a Grado Fahrenheit":

			resultado_conversion = (cantidadGrados * 1.8 ) + 32;
			break;

		case "Grado Fahrenheit a Grado Celsius":

			resultado_conversion = Math.round(((cantidadGrados - 32) * 5/9) * 100) / 100d;
			break;

		case "Grado Kelvin a Celsius":
			resultado_conversion = cantidadGrados - 273;
			break;

		case "Grado Fahrenheit a Grado Kelvin":
			resultado_conversion = Math.round((((cantidadGrados - 32) * 5/9) + 273.15) * 100) / 100d;
			break;

		default:
			break;

		}

		// mostrar conversión
		JOptionPane.showMessageDialog(null,
				"El valor de la conversión  " + tipoConvercion + " es : " + resultado_conversion);

		// mensaje final

		DeseaContinuar mensaje_final = new DeseaContinuar();
		mensaje_final.mensaje_final();

	}
}
