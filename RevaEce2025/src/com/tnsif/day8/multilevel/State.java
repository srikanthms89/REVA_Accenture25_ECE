package com.tnsif.day8.multilevel;

public class State extends Country{
	
	private String stateName;
	private String laungage;
	public State() {
		super();
	}
	public State(String name, String capital,String stateName, String laungage) {
		super(name,capital);
		this.stateName = stateName;
		this.laungage = laungage;
	}
	
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getLaungage() {
		return laungage;
	}
	public void setLaungage(String laungage) {
		this.laungage = laungage;
	}
	
	@Override
	public String toString() {
		return "State [stateName=" + stateName + ", laungage=" + laungage + ", getName()=" + getName()
				+ ", getCapital()=" + getCapital() + "]";
	}

}
