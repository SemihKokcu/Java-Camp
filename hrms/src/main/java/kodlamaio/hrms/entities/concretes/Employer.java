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
@Table(name="Employers")
public class Employer  {

	@Id
	@GeneratedValue
	@Column(name="userId")
	private int userId;
	
	@Column(name="companyName")
	private String companyName;
	
	@Column(name="website")
	private String website;
	
	@Column(name="dateOfBirth")
	private Date dateOfBirth;


	
	
	
	
	

	
	
	
	
	
}
