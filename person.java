package tnsif.newpackage.personinfo;
import tnsif.newpackage.countryinfo.Country;
import tnsif.newpackage.state.info.State;

public class person {
	
	private  String personname;
	private Country c1;
	private State s1;
	

	public person(String personname,Country c1,State s1) {
		super();
		this.personname = personname;
		this.c1=c1;
		this.s1=s1;
			
	}

public String getPersonname() {
		return personname;
	}

	public void setPersonname(String personname) {
		this.personname = personname;
	}

	public Country getC1() {
		return c1;
	}

	public void setC1(Country c1) {
		this.c1 = c1;
	}

	public State getS1() {
		return s1;
	}

	public void setS1(State s1) {
		this.s1 = s1;
	}

public static void main(String[] args) {
		Country c1=new Country("india");
		State s1=new State("Ahmedabad");
		person p1=new person("payal",c1,s1);
		System.out.println(p1);
}


public String toString() {
	return "person [personname=" + personname + ", c1=" + c1 + ", s1=" + s1 + "]";}
}
