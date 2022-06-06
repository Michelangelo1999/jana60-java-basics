package jana60;

public class SistemiOperativi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int macUsers = 3;
        int windowsUsers = 20;
        
        System.out.println("MAC users: " + macUsers);
        System.out.println("WINDOWS users: " + windowsUsers);
        
        int totaleUtenti = macUsers + windowsUsers;
        System.out.println("totale: " + totaleUtenti);
        
        float percMac = (float)macUsers * 100 / (float)totaleUtenti;
        float percWindows = (float)windowsUsers * 100 / (float)totaleUtenti;
        
        System.out.println("percentuale mac: " + percMac + "%");
        System.out.println("percentuale windovs: " + percWindows + "%");
	}

}
