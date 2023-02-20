package notas;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);// Para pedir un dato numérico por teclado
		int nota = 0;
		String evaluacion = "";
		System.out.print("Introduzca el valor de una calificación: ");
		nota = reader.nextInt();
			
		evaluacion = cali(nota);

		System.out.println(evaluacion);
		reader.close();
	}

	/**
	 * @param nota Un entero que introducimos en el metodo para que nos muestre el grado de evaluación.
	 * @return Un String que nos indicara el grado de la evaluación 
	 */
	public static String cali(int nota) {
		String evaluacion;
		if (nota >= 0 && nota < 5) {
			evaluacion = "Suspenso";
		}
		else if (nota >= 5 && nota < 7) {
			evaluacion = "Aprobado";
		}
		else if (nota >= 7 && nota <9) {
			evaluacion = "Notable";
		}
		else if (nota >= 9 && nota <= 10) {
			evaluacion = "Sobresaliente";
		}
		else {
			evaluacion = "El valor de la calificación introducida no es correcta";
		}
		return evaluacion;
	}
}