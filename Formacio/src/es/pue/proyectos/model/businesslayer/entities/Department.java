package es.pue.proyectos.model.businesslayer.entities;

import java.util.ArrayList;
import java.util.List;

import es.pue.proyectos.model.businesslayer.entities.base.EntityBase;

public class Department extends EntityBase{

	private String name;
	private List<CostCenter> costCenters;
	
	public Department() {
		costCenters = new ArrayList<CostCenter>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<CostCenter> getCostCenters() {
		return costCenters;
	}

	public void setCostCenters(List<CostCenter> costCenters) {
		this.costCenters = costCenters;
	}
}
