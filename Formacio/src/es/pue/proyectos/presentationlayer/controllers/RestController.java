package es.pue.proyectos.presentationlayer.controllers;

import java.io.IOException;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import es.pue.proyectos.model.businesslayer.entities.Project;
import es.pue.proyectos.presentationlayer.controllers.jsf.base.JSFRequestScopeBaseController;

@ManagedBean(name="restController")
public class RestController extends JSFRequestScopeBaseController{

	public void getProjects() throws IOException{
		List<Project> projects = getServiceManager().getProjectSerice().findProjects();
		
		Gson gson = new GsonBuilder().serializeNulls().create();
		String projectStrings = gson.toJson(projects);
		
		FacesContext facesContext = FacesContext.getCurrentInstance();
		ExternalContext externalContext = facesContext.getExternalContext();
		externalContext.setResponseContentType("application/json");
		externalContext.setResponseCharacterEncoding("UTF-8");
		externalContext.getResponseOutputWriter().write(projectStrings);
		facesContext.responseComplete();
	}
}
