package es.pue.proyectos.model.businesslayer.entities;

import java.util.ArrayList;
import java.util.List;

import es.pue.proyectos.model.businesslayer.entities.base.EntityBase;

public class Task extends EntityBase{

	private String name;
	private Person personInCharge;
	private String parentTaskId;
	private List<Task> subTasks;
	private List<Person> team;
	private List<Resource> resources;
	
	public Task() {
		subTasks = new ArrayList<Task>();
		team = new ArrayList<Person>();
		resources = new ArrayList<Resource>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person getPersonInCharge() {
		return personInCharge;
	}

	public void setPersonInCharge(Person personInCharge) {
		this.personInCharge = personInCharge;
	}

	public String getParentTaskId() {
		return parentTaskId;
	}

	public void setParentTaskId(String parentTaskId) {
		this.parentTaskId = parentTaskId;
	}

	public List<Task> getSubTasks() {
		return subTasks;
	}

	public void setSubTasks(List<Task> subTasks) {
		this.subTasks = subTasks;
	}

	public List<Person> getTeam() {
		return team;
	}

	public void setTeam(List<Person> team) {
		this.team = team;
	}

	public List<Resource> getResources() {
		return resources;
	}

	public void setResources(List<Resource> resources) {
		this.resources = resources;
	}
}
