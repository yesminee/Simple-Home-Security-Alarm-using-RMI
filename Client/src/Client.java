import java.rmi.Naming;
import Server.SystemInterface;
import Server.CameraInterface;

public class Client {

	public static void main(String[] args) {
		try {
			SystemInterface stub2=(SystemInterface) Naming.lookup("rmi://localhost:1099/camera");
			CameraInterface stub1=(CameraInterface) Naming.lookup("rmi://localhost:1098/system");
			System.out.println("resultat : "+stub1.ImageTransfer());
			System.out.println("requires police alert? : "+stub2.AlertTransfer());		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
