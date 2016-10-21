package es.pue.proyectos.model.businesslayer.entities.base;

import java.util.Date;
import java.util.UUID;

public abstract class EntityBase {

	private String id;
	private Date dbPersistedDate;
	private Date deletedDate;
	
	public EntityBase() {
		id=UUID.randomUUID().toString();
		dbPersistedDate=null;
		deletedDate=null;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getDbPersistedDate() {
		return dbPersistedDate;
	}
	public void setDbPersistedDate(Date dbPersistedDate) {
		this.dbPersistedDate = dbPersistedDate;
	}
	public Date getDeletedDate() {
		return deletedDate;
	}
	public void setDeletedDate(Date deletedDate) {
		this.deletedDate = deletedDate;
	}
}
