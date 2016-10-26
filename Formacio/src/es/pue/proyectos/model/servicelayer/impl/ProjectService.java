package es.pue.proyectos.model.servicelayer.impl;

import java.util.Date;
import java.util.List;

import es.pue.proyectos.model.businesslayer.entities.Project;
import es.pue.proyectos.model.persistencelayer.impl.sqlserver.manager.SqlServerPersistenceManager;
import es.pue.proyectos.model.servicelayer.api.IProjectService;

public class ProjectService implements IProjectService{

	private final SqlServerPersistenceManager sqlServerPersistenceManager;
	
	public ProjectService(SqlServerPersistenceManager sqlServerPersistenceManager){
		//AQUI CAL PASSAR CADASCUNA DE LES PERSISTENCIES QUE EXISTEIXEN PER PARAMETRE
		//ProjectService(this.sqlServerPersistenceManager, tech1PersistenceManager, tech2PersistenceManager);
		this.sqlServerPersistenceManager=sqlServerPersistenceManager;
	}
	
	@Override
	public List<Project> findProjects() {
		return sqlServerPersistenceManager.getProjectDAO().findProjects();
	}

	@Override
	public Project getProjectByCode(String code) {
		return sqlServerPersistenceManager.getProjectDAO().getProjectByCode(code);
	}

	@Override
	public Project getProjectById(String id) {
		return sqlServerPersistenceManager.getProjectDAO().getProjectById(id);
	}

	@Override
	public void saveProject(Project project) {
		if (project.getDbPersistedDate() == null){
			project.setDbPersistedDate(new Date());
		}
		
		sqlServerPersistenceManager.getProjectDAO().saveProject(project);
	}

}
