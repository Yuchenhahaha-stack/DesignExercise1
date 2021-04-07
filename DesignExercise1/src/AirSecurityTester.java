
public class AirSecurityTester {

	public static void main(String[] args) {
		people Bob = new people();
		AirSecurity OHare = new AirSecurity();
		OHare.addNormal(Bob);
		System.out.println(OHare);
		
		System.out.println(OHare.legal(Bob));
	}

}
