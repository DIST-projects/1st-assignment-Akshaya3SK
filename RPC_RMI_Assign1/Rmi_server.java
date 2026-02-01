import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Rmi_server {
    public static void main(String[] args) {
        try {
            // Set hostname to EC2 public IP
            System.setProperty("java.rmi.server.hostname", "13.235.45.67");

            LocateRegistry.createRegistry(1099); // Default RMI port

            Calculator calc = new Cal_implementation();

            Naming.rebind("rmi://13.235.45.67/CalculatorService", calc);

            System.out.println("Calculator RMI Server is running on EC2...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


