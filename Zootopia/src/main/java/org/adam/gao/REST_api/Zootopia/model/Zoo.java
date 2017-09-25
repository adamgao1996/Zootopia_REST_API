package org.adam.gao.REST_api.Zootopia.model;

public class Zoo {
	//unique for each animal
	long ID;
	String Species;
	String Name;
	long Age;
	public long getID() {
		return ID;
	}
	public void setID(long iD) {
		ID = iD;
	}
	public String getSpecies() {
		return Species;
	}
	public void setSpecies(String species) {
		Species = species;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public long getAge() {
		return Age;
	}
	public void setAge(long age) {
		Age = age;
	}
	
	
}
