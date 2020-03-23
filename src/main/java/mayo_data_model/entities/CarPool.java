package mayo_data_model.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;



//
//==> STRG Shift o --> alle imports !
//

@Getter
@Setter
@Entity
public class CarPool {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String fromLocation;
	private String toLocation;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@NotNull
	private LocalDate startDate;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate returnDate;
	
	private int availableSeatsForTrip;
	private boolean oneWayTrip;
	
	
	
	
	// What is ?????????????????????????????????ß
	//boolean arrDep;
	
	// Wie einbauen: List<Long> passengers
	
	
	
	
	
	
	//Draft ....
	// OneToMany: --> Person
	
	
	

}




