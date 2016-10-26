package es.pue.proyectos.presentationlayer.controllers.jsf.base;

import javax.annotation.PreDestroy;
import javax.faces.bean.RequestScoped;

import es.pue.proyectos.model.servicelayer.manager.ServiceManager;

@RequestScoped
public abstract class JSFRequestScopeBaseController {

	private final ServiceManager serviceManager;
	
	public JSFRequestScopeBaseController(){
		serviceManager=new ServiceManager();
	}

	public ServiceManager getServiceManager() {
		return serviceManager;
	}
	
	@PreDestroy
	public void destroy(){
		serviceManager.destroy();
	}
}
