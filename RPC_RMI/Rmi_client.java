import java.rmi.Naming;

public class Rmi_client {
    public static void main(String[] args) {
        try {
            Calculator calc = (Calculator) Naming.lookup(
                "rmi://localhost/CalculatorService"
            );

            System.out.println("Add: " + calc.add(10, 5));
            System.out.println("Sub: " + calc.sub(10, 5));
            System.out.println("Mul: " + calc.mul(10, 5));
            System.out.println("Div: " + calc.div(10, 5));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
