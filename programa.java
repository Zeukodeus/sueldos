// creé un programa que reciba los sueldos de 5 empleados, los almacene en un vector
//y los muestre por pantalla.

import java.util.Scanner;

public class programa {
    public static void main(String[] args) {
        int numEmpleados = 5; // Número de empleados
        double[] sueldos = new double[numEmpleados]; // Declarar un arreglo para almacenar los sueldos

        // Crear un objeto Scanner para la entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Solicitar los sueldos de los empleados y almacenarlos en el arreglo
        for (int i = 0; i < numEmpleados; i++) {
            System.out.print("Ingrese el sueldo del empleado " + (i + 1) + ": ");
            sueldos[i] = scanner.nextDouble();
        }

        // Cerrar el Scanner después de su uso
        scanner.close();

        // Mostrar los sueldos por pantalla
        System.out.println("Sueldos de los empleados:");
        for (int i = 0; i < numEmpleados; i++) {
            System.out.println("Empleado " + (i + 1) + ": $" + sueldos[i]);
        }
    }
}
