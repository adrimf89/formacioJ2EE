package es.pue.proyectos.model.businesslayer.entities;

import java.util.ArrayList;
import java.util.List;

import es.pue.proyectos.model.businesslayer.entities.base.EntityBase;

public class Project extends EntityBase{

	private String code;
	private String description; 
	private Client client;
	private Department department;
	private Person projectManager;
	private List<WorkingOrder> workingOrders;
	
	public Project() {
		workingOrders = new ArrayList<WorkingOrder>();
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public List<WorkingOrder> getWorkingOrders() {
		return workingOrders;
	}
	public void setWorkingOrders(List<WorkingOrder> workingOrders) {
		this.workingOrders = workingOrders;
	}
	public Person getProjectManager() {
		return projectManager;
	}
	public void setProjectManager(Person projectManager) {
		this.projectManager = projectManager;
	}
}
