package chain_of_responsibility;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        SupervisorRaiseRequest supervisor = new SupervisorRaiseRequest();
        ManagerRaiseRequest manager = new ManagerRaiseRequest();
        CEORaiseRequest ceo = new CEORaiseRequest();
        supervisor.setSuccessor(manager);
        manager.setSuccessor(ceo);

        try {
            System.out.println("Press Ctrl+C to end");
            while(true) {
                System.out.println("Syötä haluttu palkankorotus prosentteina esim. 2");
                System.out.print(">");
                double d = Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());
                supervisor.handleRaise(new RaiseRequest(d));
            }
        }catch(Exception e) {
            System.exit(1);
        }
    }
    
    
}
