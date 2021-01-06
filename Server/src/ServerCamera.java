package Server;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class ServerCamera {

	public static void main(String[] args) {
		try {
			LocateRegistry.createRegistry(1098);
			CameraClass obj=new CameraClass();
			Naming.rebind("rmi://localhost:1098/camera",obj);
			System.out.println("Camera Server Running");
			obj.ImageTransfer();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
