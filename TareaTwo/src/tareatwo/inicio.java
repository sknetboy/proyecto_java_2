package tareatwo;

import java.util.Scanner;

public class inicio {

	public static void main(String[] args) {
		 // Inicialización de Scanner para obtener la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el número total de estudiantes
        System.out.println("Ingrese el número total de estudiantes: ");
        int numEstudiantes = scanner.nextInt();

        // Crear un arreglo para almacenar las calificaciones de los estudiantes
        int[] calificaciones = new int[numEstudiantes];

        // Solicitar al usuario las calificaciones de cada estudiante y almacenarlas en el arreglo
        for (int i = 0; i < numEstudiantes; i++) {
            System.out.println("Ingrese la calificación del estudiante " + (i + 1) + ": ");
            calificaciones[i] = scanner.nextInt();
        }

        // Inicializar variables para contar cuántos estudiantes pertenecen a cada categoría
        int reprobados = 0;
        int buenos = 0;
        int muyBuenos = 0;
        int sobresalientes = 0;

        // Clasificar a los estudiantes en las categorías según sus calificaciones
        for (int calificacion : calificaciones) {
            if (calificacion >= 60 && calificacion < 70) {
                reprobados++;
            } else if (calificacion >= 70 && calificacion < 80) {
                buenos++;
            } else if (calificacion >= 80 && calificacion < 90) {
                muyBuenos++;
            } else if (calificacion >= 90 && calificacion <= 99) {
                sobresalientes++;
            }
        }

        // Mostrar los resultados de la evaluación
        System.out.println("\nResultados de la evaluación:");
        System.out.println("Reprobados: " + reprobados);
        System.out.println("Buenos: " + buenos);
        System.out.println("Muy Buenos: " + muyBuenos);
        System.out.println("Sobresalientes: " + sobresalientes);

        // Cerrar el objeto Scanner para liberar recursos
        scanner.close();
    }
}
