/*
 * 1.	Crear una clase llamada Verificador Contraseñas que contenga 
 * como atributos: 
•	Contraseña ingresada
•	Nivel de seguridad (Esta NO será leída desde teclado, su valor será asignado por un método)
2.	Crear métodos para lectura y/o impresión de atributos.
3.	Agregar un método que RECIBA COMO PARÁMETRO la contraseña para confirmar y 
la compare contra la contraseña original y RETORNE un valor BOOLEANO para 
posteriormente indicarle al usuario si coinciden o no. En caso de no coincidir,
 no deberá poder avanzar a las acciones del siguiente método.
 
 
4.	Agregar otro método que ASIGNE UN VALOR a la variable de instancia nivel de seguridad, a través del análisis de la contraseña ingresada, verificando que cumple con las condiciones indicadas en la imagen. En caso de cumplir con las 3 primeras, se asigna nivel BAJO; si cumple con las primeras 4, se asigna MEDIO y en caso de cumplir con TODAS, se asigna ALTO
5.	Agregar un menú que solo termine cuando el usuario lo indique y que le permita seguir ingresando y analizando contraseñas.

 */

import java.util.Scanner;

class VerificadorContrasenias{
	String password ;
	String nivelSeguridad;
	
	public VerificadorContrasenias() {}
	
	public boolean compararPassword(String password2) {
		return password.equals(password2);
	}
	
	public String passMayusculas() {
		return password.toUpperCase();
	}
	
	public void analizarPassMayusculas(String p) {
		String y = passMayusculas();
	}
}

public class PruebaAsesoria {

	public static void main(String[] args) {
		VerificadorContrasenias obj1 = new VerificadorContrasenias();
		obj1.password = "abc123";
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa contrasenia a confirmar: ");
		String pass2 = entrada.next();
		System.out.println( obj1.compararPassword(pass2) ? "Iguales" : "Diferentes");

		obj1.analizarPassMayusculas( obj1.passMayusculas() );
        
        // comentario
	}

}
