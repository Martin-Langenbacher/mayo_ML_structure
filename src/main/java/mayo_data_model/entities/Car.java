package mayo_data_model.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;

import lombok.Getter;
import lombok.Setter;


//
//==> STRG Shift o --> alle imports !
//


@Getter
@Setter
@Entity
public class Car {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private boolean isRentalCar;
	
	private String brandModel;
	private String licensePlate;
	private int availableSeats;
	
	private String carImageURL;

	@Lob
	private byte[] carImage;
	
	
	// What is ???????
	// Long driverID (DataBase!)
	// List<Long> passengers
	
	
	
	// ManyToMany: --> user
	@ManyToMany
	@JoinTable(name = "car_user",
	joinColumns = @JoinColumn(name="car_id"),
	inverseJoinColumns = @JoinColumn(name = "user_id"))
	private List<User> users = new ArrayList<>();
	
	
	
	// ManyToMany: --> Ride
	@ManyToMany
	@JoinTable(name = "car_ride",
	joinColumns = @JoinColumn(name="car_id"),
	inverseJoinColumns = @JoinColumn(name = "ride_id"))
	private List<Ride> rides = new ArrayList<>();
	
	
	

	
	

}






