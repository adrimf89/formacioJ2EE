package es.pue.proyectos.presentationlayer.controllers;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import es.pue.proyectos.model.businesslayer.entities.Project;
import es.pue.proyectos.model.servicelayer.manager.ServiceManager;
import es.pue.proyectos.utilitieslayer.AppHelper.PersistenceTechnologies;

@ManagedBean(name="indexController")
@RequestScoped
public class IndexController {

	private String name;
	
	public IndexController(){
		
		name = "PUE";
		
		ServiceManager serviceManager = new ServiceManager();
		serviceManager.initTransaction(PersistenceTechnologies.SQL_SERVER);
		Project project = new Project();
		project.setCode("PRJ_CODE");
		project.setDescription("Project description");
		serviceManager.getProjectSerice().saveProject(project);
		serviceManager.saveChanges(PersistenceTechnologies.SQL_SERVER);
		
		List<Project> projects = serviceManager.getProjectSerice().findProjects();
		
		for (Project p : projects){
			System.out.println(p.getCode());
		}
	}

	public String getName() {
		return name;
	}
}
