import java.rmi.Naming;
public class ClientSystem {

	public static void main(String[] args) {
		try {
			CameraInterface stub=(CameraInterface) Naming.lookup("rmi://localhost:1098/camera");
			for(int i=0;i<stub.ImageTransfer().length;i++) {
				if(stub.ImageTransfer()[i]==false) {
					System.out.println("problem au niveau de camera:"+i);
				}
				else {
					System.out.println("No Problems Detected");
				}
			}
			}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
