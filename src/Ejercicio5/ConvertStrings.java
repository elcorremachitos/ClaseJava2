package Ejercicio5;

public class ConvertStrings {
    public static void main (String[] args){
        String numberStr = "123";
        int number = Integer.parseInt(numberStr);
        System.out.println("El numero es " + number);

        String text = "Queloque mi gente bella";
        System.out.println("Longitud del texto: " + text.length());
        System.out.println("La subcadena 0 y 4 del texto son: " + text.substring(0, 3));
        System.out.println("Texto convertido a mayusculas: " + text.toUpperCase());
        System.out.println("Texto convertido a minusculas: " + text.toLowerCase());
    }
}
