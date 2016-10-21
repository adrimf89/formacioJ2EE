package es.pue.proyectos.model.persistencelayer.manager;

import es.pue.proyectos.model.persistencelayer.api.IProjectDAO;
import es.pue.proyectos.model.persistencelayer.impl.sqlserver.manager.SqlServerPersistenceManager;
import es.pue.proyectos.utilitieslayer.AppHelper.PersistenceTechnologies;

public abstract class PersistenceManager {

	public abstract void initTransaction();
	public abstract void saveChanges();
	public abstract void discardChanges();
	
	public abstract IProjectDAO getProjectDAO();
	
	public static PersistenceManager getPersistenceManager(PersistenceTechnologies persistenceTechnologies){
		PersistenceManager persistenceManager=null;
		
		switch (persistenceTechnologies) {
		case SQL_SERVER:
			persistenceManager = new SqlServerPersistenceManager();
			break;
		}
		
		return persistenceManager;
	}
}
