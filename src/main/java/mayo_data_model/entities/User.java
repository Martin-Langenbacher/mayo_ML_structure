package mayo_data_model.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.NaturalId;

import lombok.Getter;
import lombok.Setter;


//
//==> STRG Shift o --> alle imports !
//


@Getter
@Setter
@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	//@NaturalId
	//@Column(unique = true)
	//@NotNull
	private String eMail;
	
	private String firstName;
	private String lastName;
	private String gender;
	private String userImageURL;

	@Lob
	private byte[] userImage;
	
	
	
	
	// ManyToMany: --> Role
	@ManyToMany(mappedBy = "users")
	private List<Role> roles = new ArrayList<>();
	
	
	// ManyToMany: --> Car
	@ManyToMany(mappedBy = "users")
	private List<Car> cars = new ArrayList<>();
	
	
	// ManyToMany: --> Ride
	@ManyToMany(mappedBy = "users")
	private List<Ride> rides = new ArrayList<>();
	
	

}






