package com.tnsif.day8.multilevel;

public class City  extends State{
	
	private String cityName;
	private float area;
	public City() {
		super();
	}
	public City(String name, String capital,String stateName, String laungage,String cityName, float area) {
		super(name,capital,stateName,laungage);
		this.cityName = cityName;
		this.area = area;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public float getArea() {
		return area;
	}
	public void setArea(float area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return "City [cityName=" + cityName + ", area=" + area + ", getStateName()=" + getStateName()
				+ ", getLaungage()=" + getLaungage() + ", getName()=" + getName() + ", getCapital()=" + getCapital()
				+ "]";
	}
	
	

}
