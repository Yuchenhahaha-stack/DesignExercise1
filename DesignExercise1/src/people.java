
public class people {
	String Name;
	String Designation;
	String [] Items;
	
	public people(String Name, String Designation, String [] Items) {
		this.Name=Name;
		this.Designation=Designation;
		this.Items=Items;
	}
	public people() {
		Name="Bob";
		Designation="Passenger";
		Items= new String[] {"weapons", "drugs", "weapons"};
	}
	
	public String[] getItems() {
		return Items;
	}
	
	public String getDesig() {
		return Designation;
	}
	
	public String getName() {
		return Name;
	}
}
