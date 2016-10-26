package es.pue.proyectos.presentationlayer.controllers;

import java.util.List;

import javax.faces.bean.ManagedBean;

import es.pue.proyectos.model.businesslayer.entities.Project;
import es.pue.proyectos.presentationlayer.controllers.jsf.base.JSFRequestScopeBaseController;
import es.pue.proyectos.utilitieslayer.AppHelper.PersistenceTechnologies;

@ManagedBean(name="indexController")
public class IndexController extends JSFRequestScopeBaseController{

	private String name;
	
	public IndexController(){
		
		name = "PUE";
		
		getServiceManager().initTransaction(PersistenceTechnologies.SQL_SERVER);
		Project project = new Project();
		project.setCode("PRJ_CODE");
		project.setDescription("Project description");
		getServiceManager().getProjectSerice().saveProject(project);
		getServiceManager().saveChanges(PersistenceTechnologies.SQL_SERVER);
		
		List<Project> projects = getServiceManager().getProjectSerice().findProjects();
		
		for (Project p : projects){
			System.out.println(p.getId());
		}
	}

	public String getName() {
		return name;
	}
}
