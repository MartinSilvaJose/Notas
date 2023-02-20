package notas;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);// Para pedir un dato numérico por teclado
		int nota = 0;
		String evaluacion = "";
		System.out.print("Introduzca el valor de una calificación: ");
		nota = reader.nextInt();
			
		evaluacion = califica(nota);

		System.out.println(evaluacion);
		reader.close();
	}

	/**
	 * @param nota Un entero que introducimos en el metodo para que nos muestre el grado de evaluación.
	 * @return Un String que nos indicara el grado de la evaluación 
	 * @deprecated Use {@link #califica(int)} instead
	 */
	public static String cali(int nota) {
		return califica(nota);
	}

	/**
	 * @param num_nota Un entero que introducimos en el metodo para que nos muestre el grado de evaluación.
	 * @return Un String que nos indicara el grado de la evaluación 
	 */
	public static String califica(int num_nota) {
		String evaluacion;
		if (num_nota >= 0 && num_nota < 5) {
			evaluacion = "Suspenso";
		}
		else if (num_nota >= 5 && num_nota < 7) {
			evaluacion = "Aprobado";
		}
		else if (num_nota >= 7 && num_nota <9) {
			evaluacion = "Notable";
		}
		else if (num_nota >= 9 && num_nota <= 10) {
			evaluacion = "Sobresaliente";
		}
		else {
			evaluacion = "El valor de la calificación introducida no es correcta";
		}
		return evaluacion;
	}
}