import javax.swing.*;

public class ifElseIfandSwitch {
    public static void main(String[] args){
        // If and ElseIf
        int age = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad:"));
        if (age >= 0 && age <= 17){
            System.out.println("El usuario es menor de edad");
        } else if (age >= 18){
            System.out.println("El usuario es mayor de edad");
        } else {
            System.out.println("Error, edad invalida");
        }
        // Case
        int day = Integer.parseInt(JOptionPane.showInputDialog("Introduce el dia de la semana (En numero): "));
        String dayStr = "";
        switch (day){
            case 1:
                dayStr = "Lunes";
                break;
            case 2:
                dayStr = "Martes";
                break;
            default:
                dayStr = "Dia no valido";
                break;
        }
        System.out.println("El dia de hoy es " + dayStr);
    }
}
