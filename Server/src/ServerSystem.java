package Server;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class ServerSystem {

	public static void main(String[] args) {
		try {	
			LocateRegistry.createRegistry(1099);
			SystemClass obj=new SystemClass();
			Naming.rebind("rmi://localhost:1099/system",obj);
			System.out.println("Server System Running");
			if(obj.AlertTransfer()[5]=="true") {
				obj.AlertTransfer();
			}
			else {
				System.out.println("No Problems Detected");
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
