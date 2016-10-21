package es.pue.proyectos.presentationlayer.controllers;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import es.pue.proyectos.model.businesslayer.entities.Project;
import es.pue.proyectos.model.servicelayer.manager.ServiceManager;

@ManagedBean(name="indexController")
@RequestScoped
public class IndexController {

	private String name;
	
	public IndexController(){
		
		name = "PUE";
		
		ServiceManager serviceManager = new ServiceManager();
		List<Project> projects = serviceManager.getProjectSerice().findProjects();
		
//		for (Project project : projects){
//			System.out.println(project.getCode());
//		}
	}

	public String getName() {
		return name;
	}
}
