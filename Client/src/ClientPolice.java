import java.rmi.Naming;

public class ClientPolice {

	public static void main(String[] args) {
		try {
			SystemInterface stub=(SystemInterface) Naming.lookup("rmi://localhost:1099/system");
			for(int i=0;i<stub.AlertTransfer().length;i++) {
				System.out.println("les donnes de l'alert:"+stub.AlertTransfer()[i]);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
