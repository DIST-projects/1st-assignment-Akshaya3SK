import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Cal_implementation extends UnicastRemoteObject implements Calculator {

    protected Cal_implementation() throws RemoteException {
        super();
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        if (b == 0) throw new ArithmeticException("Division by zero");
        return a / b;
    }
}
