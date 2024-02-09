package model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.NamedQuery;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
@Table(name = "tb_subject")
@NamedQuery(name = "Subject.findAll", query = "SELECT r from Subject r")


public class Subject {
	
	@Id
	@Column(name = "idsubject")
	private int idsubject;
	
	@Column(name = "subject")
	private String subject;
	
	@Column(name = "credits")
	private String credits;
	
	public Subject() {
		
	}

	public int getIdsubject() {
		return idsubject;
	}

	public void setIdsubject(int idsubject) {
		this.idsubject = idsubject;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getCredits() {
		return credits;
	}

	public void setCredits(String credits) {
		this.credits = credits;
	}
	
	

}
