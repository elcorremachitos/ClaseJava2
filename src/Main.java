import Ejercicio1.Add_numbers;
import Ejercicio4.NameDialog;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        // Suma
        Add_numbers operation_1 = new Add_numbers(1,3);
        int result = operation_1.add_result();
        System.out.println(result);

        // Codigo de Mostrar lista de nombres y registrar
        NameDialog names = new NameDialog();
        ArrayList<String> nameList = names.addName();
        JOptionPane.showMessageDialog(null,"La lista de nombres es: \n" + nameList);
     }
}