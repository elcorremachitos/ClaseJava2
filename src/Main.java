public class Main {
    public static void main(String[] args) {
        byte age_juan = 18;
        int price = 2110000;
        boolean flag = true;
        char letter = 'B';
        String text = "Babuino";
        System.out.println("hola mi nombre es " + text + " y tengo " + age_juan + " años de edad");

        add_numbers operation_1 = new add_numbers(1,3);
        int result = operation_1.add_result();

        System.out.println(result);
    }
}