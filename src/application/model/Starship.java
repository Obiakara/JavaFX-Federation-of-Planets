/**
 * Lab5 is a JavaFX file
 * 
 * @author kenneth Okorafor (uoo431)
 * UTSA CS 3443 - Lab 5
 * Spring 2019
 */
package application.model;

import java.util.ArrayList;

public class Starship {
	private String name;
	private String registry;
	private String shipClass;
	private ArrayList<CrewMember> crewMember = new ArrayList<>();
	//private ArrayList<BufferedImage> images = new ArrayList<>();
	/**
	 * @param name
	 * @param registry
	 * @param shipClass
	 * @param crewMember
	 */
	public Starship(String name, String registry, String shipClass) {
		super();
		this.name = name;
		this.registry = registry;
		this.shipClass = shipClass;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the registry
	 */
	public String getRegistry() {
		return registry;
	}
	/**
	 * @param registry the registry to set
	 */
	public void setRegistry(String registry) {
		this.registry = registry;
	}
	/**
	 * @return the shipClass
	 */
	public String getShipClass() {
		return shipClass;
	}
	/**
	 * @param shipClass the shipClass to set
	 */
	public void setShipClass(String shipClass) {
		this.shipClass = shipClass;
	}
	/**
	 * @return the crewMember
	 */
	public ArrayList<CrewMember> getCrewMember() {
		return crewMember;
	}
	/**
	 * @param crewMember the crewMember to set
	 */
	public void setCrewMember(ArrayList<CrewMember> crewMember) {
		this.crewMember = crewMember;
	}

	/**
	 * This method takes in a crewMember object and adds it to the crewMember array	
	 * @param crew
	 */
	public void addCrewMember(CrewMember crew) {
		this.crewMember.add(crew);
		}


}
		
		

