import java.util.LinkedList;

public class AirSecurity {
	static LinkedList<people> securityCheck;
	
	enum people {
		VIP, Crew, Passenger;
	}
	
	public AirSecurity() {
		securityCheck = new LinkedList<people>();
    }
	
	public void priorityAdd(people p) { //Adding VIP and crews, they go in front
		if(p.equals(people.Passenger)) { //Adding normal passenger will have no effect.
			return;
		}
		securityCheck.addFirst(p);
	}
	
	public void addNormal(people p) { // Adding normal people, they will go last
		if(!p.equals(people.Passenger)) { // But when VIP and crews use this operation, they will still go in front.
			securityCheck.addFirst(p);
			return;
		}
		securityCheck.addLast(p);
	}
	
	public void pass() { //Pretty much a remove method, but let people go through security lines.
		securityCheck.removeFirst();
	}
}

