package de.icybits.ts3.sq.api.basic;
/**
 * 
 * @author Saali
 *
 */

public class Properties {
	
	private String name;
	private Boolean changeable;
	
	protected Properties(String name, Boolean changeable){
		this.name = name;
		this.changeable = changeable;
	}
	
	public String getName(){
		return name;
	}
	
	public Boolean isChangeable(){
		return changeable;
	}
	
	@Override
	public String toString() {
		return getName();
	}
	
	@Override
	public int hashCode() {
		return name.hashCode() + changeable.hashCode();
	}
	
	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (!(object instanceof Properties)) {
			return false;
		}
		Properties otherProperty = (Properties) object;
		if (!name.equals(otherProperty.name)) {
			return false;
		}
		return changeable.equals(otherProperty.changeable);
	}
	
}
