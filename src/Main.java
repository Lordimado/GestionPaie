
public class Main {
		public static void main(String [] args){	
			Employe A=new Employe();
			EmployePleinTemps B=new EmployePleinTemps();
			EmployeTempsPartiel C=new EmployeTempsPartiel();
			A.jeSuis();
			System.out.println(A.ChequePaie());
		    System.out.println("-------------------------------------------------");
			B.jeSuis();
			System.out.println(B.ChequePaie());
			System.out.println("-------------------------------------------------");
			C.jeSuis();
			System.out.println(C.ChequePaie());
		}
}
