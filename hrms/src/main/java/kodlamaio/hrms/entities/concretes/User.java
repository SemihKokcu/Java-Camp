package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
@Entity
@Table(name="Users")
public  class User {

	@Id
	@GeneratedValue
	@Column(name="id")
	private int  id;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String passkodaword;
	
	

	
}
