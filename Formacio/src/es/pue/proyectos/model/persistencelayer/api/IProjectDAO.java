package es.pue.proyectos.model.persistencelayer.api;

import java.util.List;

import es.pue.proyectos.model.businesslayer.entities.Project;

public interface IProjectDAO{

	public List<Project> findProjects();
	public Project getProjectByCode(String code);
	public Project getProjectById(String id);
	public void saveProject(Project project);
}
