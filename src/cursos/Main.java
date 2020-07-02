package cursos;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int opcion = 0;
		do {
			System.out.println("--------------------");
			System.out.println("Aplicacion de mensajes");
			System.out.println("1.- Crear un mensaje");
			System.out.println("2.- Mostrar mensajes");
			System.out.println("3.- Editar un mensaje");
			System.out.println("4.- Eliminar un mensaje");
			System.out.println("5.- Salir");
			opcion = sc.nextInt();
			
			switch(opcion) {
			case 1:
				mensajesService.crearMensaje();
				break;
			case 2:
				mensajesService.listarMensaje();
				break;
			case 3:
				mensajesService.editarMensaje();
				break;
			case 4:
				mensajesService.borrarMensaje();
				break;
			default:
				break;
			}
		
		}while(opcion != 5);

	}
}