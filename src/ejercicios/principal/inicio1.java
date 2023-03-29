package ejercicios.principal;
import java.util.Scanner;

import salud.empleado;

public class inicio1 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        
        // Crear un objeto de la clase Empleado
        empleado empleado1 = new empleado();

        empleado1.calcularHonorarios();

        empleado1.imprimirDatos();

        lectura.close();

        
    }
    
} {
    
}
