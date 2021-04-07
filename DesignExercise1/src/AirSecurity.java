import java.util.LinkedList;

public class AirSecurity {
	LinkedList<people> securityCheck;
	
	public AirSecurity() {
		securityCheck = new LinkedList<people>();
    }
	
	public void priorityAdd(people p) { //Adding VIP and crews, they go in front
		if(p.getDesig().equals("Passenger")) { //Adding normal passenger will have no effect.
			return;
		}
		securityCheck.addFirst(p);
	}
	
	public void addNormal(people p) { // Adding normal people, they will go last
		if(!p.getDesig().equals("Passenger")) { // But when VIP and crews use this operation, they will still go in front.
			securityCheck.addFirst(p);
			return;
		}
		securityCheck.addLast(p);
	}
	
	public void pass() { //Pretty much a remove method, but let people go through security lines.
		securityCheck.removeFirst();
	}
	
	public boolean legal(people p) { //Check for Illegal Items, return false if illegal.
		String [] thing = p.getItems();
		for(String s : thing) {
			s = s.toLowerCase();
			if(s.equals("weapons") || s.equals("drugs")) {
				return false;
			}
		}
		return true;
	}
	
	public String toString() {
		String s = "";
		for(people p : securityCheck) {
			s = s + " " + p.getName();
		}
		return "Passengers are" + s;
	}
}

