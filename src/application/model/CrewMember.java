/**
 * Lab5 is a JavaFX file
 * 
 * @author kenneth Okorafor (uoo431)
 * UTSA CS 3443 - Lab 5
 * Spring 2019
 */
package application.model;

public class CrewMember {
	private String name;
	private String position;
	private String rank;
	private String registry;
	private String species;
	/**
	 * @param name
	 * @param position
	 * @param rank
	 * @param registry
	 * @param species
	 */
	public CrewMember(String name, String position, String rank, String registry, String species) {
		super();
		this.name = name;
		this.position = position;
		this.rank = rank;
		this.registry = registry;
		this.species = species;
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
	 * @return the position
	 */
	public String getPosition() {
		return position;
	}
	/**
	 * @param position the position to set
	 */
	public void setPosition(String position) {
		this.position = position;
	}
	/**
	 * @return the rank
	 */
	public String getRank() {
		return rank;
	}
	/**
	 * @param rank the rank to set
	 */
	public void setRank(String rank) {
		this.rank = rank;
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
	 * @return the species
	 */
	public String getSpecies() {
		return species;
	}
	/**
	 * @param species the species to set
	 */
	public void setSpecies(String species) {
		this.species = species;
	}	

}
