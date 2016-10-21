package es.pue.proyectos.model.servicelayer.api;

import java.util.List;

import es.pue.proyectos.model.businesslayer.entities.Project;

public interface IProjectService {

	public List<Project> findProjects();
	public Project getProjectByCode(String code);
	public Project getProjectById(String id);
	public void saveProject(Project project);
}
