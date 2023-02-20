package notas;

public class Califica {

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
