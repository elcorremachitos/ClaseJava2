package Ejercicio4;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class NameDialog {

    public ArrayList<String> addName(){
        boolean flag = true;
        ArrayList<String> names = new ArrayList<>();

        while (flag){
            String name = JOptionPane.showInputDialog(null, "Ingrese su nombre:");
            names.add(name);
            int option = JOptionPane.showConfirmDialog(null, "¿Quieres ingresar otro nombre?", "Nombres", JOptionPane.YES_NO_OPTION);
            if (option != JOptionPane.YES_OPTION){
                flag = false;
            }
        }
        return names;
    }
}
