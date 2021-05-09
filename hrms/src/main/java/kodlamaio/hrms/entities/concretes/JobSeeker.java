package kodlamaio.hrms.entities.concretes;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name="JobSeekers")
public class JobSeeker {
	
	@Id
	@GeneratedValue
	@Column(name="userId")
    private int  userId;
	
	@Column(name="positionId")
    private int positionId; 
	
	@Column(name="name")
	private String name;
	
	@Column(name="surName")
	private String surName;
	
	@Column(name="identityNumber")
	private String identityNumber;
	
	@Column(name="dateOfBirth")
	private Date dateOfBirth;
	
	
	
	
}
