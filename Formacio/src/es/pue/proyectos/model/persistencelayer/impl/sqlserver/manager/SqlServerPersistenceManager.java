package es.pue.proyectos.model.persistencelayer.impl.sqlserver.manager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import es.pue.proyectos.model.persistencelayer.api.IProjectDAO;
import es.pue.proyectos.model.persistencelayer.impl.sqlserver.daos.ProjectDAO;
import es.pue.proyectos.model.persistencelayer.manager.PersistenceManager;

public class SqlServerPersistenceManager extends PersistenceManager{

	private IProjectDAO projectDAO;
	private final SessionFactory sessionFactory;
	private final Session session;
	private Transaction transaction;

	public SqlServerPersistenceManager(){
		try{
			Configuration configuration = new Configuration();
			configuration.configure("hibernate.cfg.xml");
			ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
			
			sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			session = sessionFactory.openSession();
		} catch (Throwable ex){
			System.err.print(ex);
			throw ex;
		}
	}
	
	@Override
	public void initTransaction() {
		transaction = session.beginTransaction();
	}

	@Override
	public void saveChanges() {
		transaction.commit();
	}

	@Override
	public void discardChanges() {
		transaction.rollback();
	}
	
	@Override
	public IProjectDAO getProjectDAO() {
		if (projectDAO==null){
			projectDAO=new ProjectDAO(session);
		}
		return projectDAO;
	}

	@Override
	public void destroy() {
		if (session.isOpen()){
			session.close();
		}
		if (!sessionFactory.isClosed()){
			sessionFactory.close();
		}
		
	}

}
