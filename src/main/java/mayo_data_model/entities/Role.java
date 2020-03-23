package mayo_data_model.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;


//
//==> STRG Shift o --> alle imports !
//



@Getter
@Setter
@Entity
public class Role {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private boolean isDriver;
	
	
	//Draft ....
	// OneToMany: --> Person
	
	
	

}



