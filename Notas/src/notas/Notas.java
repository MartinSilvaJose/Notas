package notas;

import java.util.Scanner;
/**
 * Clase donde tenemos al main del programa que nos permite ver la evaluación de las notas que introducimos.
 * @author José Miguel Martín Silva
 *@version 1.0
 *@since 20/02/2023
 */
public class Notas {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);// Para pedir un datopor teclado
		int nota = 0;//variable donde se guarda el dato que introduce el usuario y será procesado.
		String evaluacion = "";//variable que utilizaremos para generar los String de cada evaluacion.
		System.out.print("Introduzca el valor de una calificación: ");//texto para el usuario.
		nota = reader.nextInt();//momento de introducir el dato
/**
 * llamada al metodo califica.
 * @see {@link Califica#califica}
 */
		evaluacion = Califica.califica(nota);//ejecucion del metodo califica

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