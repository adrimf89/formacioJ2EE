package es.pue.proyectos.model.servicelayer.manager;

import es.pue.proyectos.model.persistencelayer.impl.sqlserver.manager.SqlServerPersistenceManager;
import es.pue.proyectos.model.persistencelayer.manager.PersistenceManager;
import es.pue.proyectos.model.servicelayer.api.IProjectService;
import es.pue.proyectos.model.servicelayer.impl.ProjectService;
import es.pue.proyectos.utilitieslayer.AppHelper.PersistenceTechnologies;

public class ServiceManager {

	private final SqlServerPersistenceManager sqlServerPersistenceManager;
	
	public ServiceManager(){
		sqlServerPersistenceManager=(SqlServerPersistenceManager)PersistenceManager.getPersistenceManager(PersistenceTechnologies.SQL_SERVER);
	}
	
	//Services
	private IProjectService projectService;
	
	public IProjectService getProjectSerice(){
		if (projectService==null){
			projectService = new ProjectService();
		}
		return projectService;
	}
	
	public void initTransaction(PersistenceTechnologies persistenceTechnologies) {
		switch (persistenceTechnologies) {
		case SQL_SERVER:
			sqlServerPersistenceManager.initTransaction();
			break;
		}
	}

	public void saveChanges(PersistenceTechnologies persistenceTechnologies) {
		switch (persistenceTechnologies) {
		case SQL_SERVER:
			sqlServerPersistenceManager.saveChanges();
			break;
		}
	}

	public void discardChanges(PersistenceTechnologies persistenceTechnologies) {
		switch (persistenceTechnologies) {
		case SQL_SERVER:
			sqlServerPersistenceManager.discardChanges();
			break;
		}
	}
	
}
