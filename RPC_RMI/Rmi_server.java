import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Rmi_server {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099); // RMI default port
            Calculator calc = new Cal_implementation();
            Naming.rebind("rmi://localhost/CalculatorService", calc);
            System.out.println("Calculator RMI Server is running...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

