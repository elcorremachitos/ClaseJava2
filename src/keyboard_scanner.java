import java.util.Scanner;

public class keyboard_scanner {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        // Introduce el nombre
        System.out.println("Por favor introduce tu nombre: ");
        String nombre = scanner.nextLine();
        // Ingrese su apellido
        System.out.println("Por favor introduce tu edad: ");
        byte age = scanner.nextByte();
        // Mostrar Datos
        System.out.println("Mi nombre es " + nombre + " y tengo " + age + " años de edad ");

        scanner.close();
    }
}
