package notas;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);// Para pedir un dato numérico por teclado
		int nota = 0;
		String evaluacion = "";
		System.out.print("Introduzca el valor de una calificación: ");
		nota = reader.nextInt();
			
		evaluacion = Califica.califica(nota);

		System.out.println(evaluacion);
		reader.close();
	}

	/**
	 * @param nota Un entero que introducimos en el metodo para que nos muestre el grado de evaluación.
	 * @return Un String que nos indicara el grado de la evaluación 
	 * @deprecated Use {@link Califica#califica(int)} instead
	 */
	public static String cali(int nota) {
		return Califica.califica(nota);
	}

	/**
	 * @param num_nota Un entero que introducimos en el metodo para que nos muestre el grado de evaluación.
	 * @return Un String que nos indicara el grado de la evaluación 
	 * @deprecated Use {@link Califica#califica(int)} instead
	 */
	public static String califica(int num_nota) {
		return Califica.califica(num_nota);
	}
}