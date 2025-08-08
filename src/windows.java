import javax.swing.JOptionPane;


public class windows {
    public static void main(String[] args){
        String name = JOptionPane.showInputDialog("Introduce tu nombre:");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad:"));
        JOptionPane.showMessageDialog(null, "Nombre: " + name + " y Edad: " + age);
    }
}
