package tnsif.newpackage.state.info;

public class State {
public String stname;
public State()
{
	this.stname="";
}
public State(String stname) {
	super();
	this.stname=stname;
	

}

public String getStname() {
	return stname;
}

public void setStname(String stname) {
	this.stname = stname;
}

@Override
public String toString() {
	return "State [stname=" + stname + "]";
}

}
