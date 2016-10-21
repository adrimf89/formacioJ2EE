package es.pue.proyectos.model.persistencelayer.impl.sqlserver.daos;

import java.util.List;

import org.hibernate.Session;

import es.pue.proyectos.model.businesslayer.entities.Project;
import es.pue.proyectos.model.persistencelayer.api.IProjectDAO;

public class ProjectDAO implements IProjectDAO{

	private final Session session;
	
	public ProjectDAO(Session session){
		this.session=session;
	}
	
	@Override
	public List<Project> findProjects() {
		//HQL
		return null;
	}

	@Override
	public Project getProjectByCode(String code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Project getProjectById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveProject(Project project) {
		// TODO Auto-generated method stub
		
	}

}
