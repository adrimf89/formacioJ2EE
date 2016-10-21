package es.pue.proyectos.model.businesslayer.entities;

import java.util.ArrayList;
import java.util.List;

import es.pue.proyectos.model.businesslayer.entities.base.EntityBase;

public class WorkingOrder extends EntityBase{

	private String code;
	private String description;
	private Person teamLeader;
	private CostCenter costCenter;
	private String parentWorkingOrderId;
	private List<Task> tasks;
	private List<WorkingOrder> subWorkingOrders;
	private List<Person> team;
	
	public WorkingOrder() {
		tasks = new ArrayList<Task>();
		subWorkingOrders = new ArrayList<WorkingOrder>();
		team = new ArrayList<Person>(); 
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
	public Person getTeamLeader() {
		return teamLeader;
	}
	public void setTeamLeader(Person teamLeader) {
		this.teamLeader = teamLeader;
	}
	public CostCenter getCostCenter() {
		return costCenter;
	}
	public void setCostCenter(CostCenter costCenter) {
		this.costCenter = costCenter;
	}
	public List<Task> getTasks() {
		return tasks;
	}
	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}
	public List<WorkingOrder> getSubWorkingOrders() {
		return subWorkingOrders;
	}
	public void setSubWorkingOrders(List<WorkingOrder> subWorkingOrders) {
		this.subWorkingOrders = subWorkingOrders;
	}

	public String getParentWorkingOrderId() {
		return parentWorkingOrderId;
	}

	public void setParentWorkingOrderId(String parentWorkingOrderId) {
		this.parentWorkingOrderId = parentWorkingOrderId;
	}

	public List<Person> getTeam() {
		return team;
	}

	public void setTeam(List<Person> team) {
		this.team = team;
	}	
}
