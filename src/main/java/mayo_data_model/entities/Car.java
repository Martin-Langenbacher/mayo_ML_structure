package mayo_data_model.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.NaturalId;
import org.springframework.format.annotation.DateTimeFormat;

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
	
	
	
	
	
	
	
	
	//Draft ....
	// OneToMany: --> Person
	
	

}





/*

@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@NaturalId
	@Column(unique = true)
	@NotNull
	private String email;

	@NotNull
	private String password;

	@NotNull
	private String firstName;

	private String lastName;

	private String zipCode;

	@NotNull
	private String city;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@NotNull
	private LocalDate dateOfBirth;

	private String description;
	private String imageURL;

	@Lob
	private byte[] image;



public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(unique = true)
	private String title;
	private String author;
	
	
	// OneToMany: --> Person
		@OneToMany(mappedBy = "book")
		priv



*/

