package es.pue.proyectos.model.businesslayer.entities;

import es.pue.proyectos.model.businesslayer.entities.base.EntityBase;

public class CostCenter extends EntityBase{

	private String name;
	
	public CostCenter() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
