package mayo_data_model.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
public class Ride {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String fromLocation;
	private String toLocation;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@NotNull
	private LocalDate startDate;
	private int startHour;
	private int startMinute;
	
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate returnDate;
	private int returnHour;
	private int returnMinute;
	
	
	private int availableSeatsForTrip;
	private boolean oneWayTrip;
	
	
	// Not yet:
	// arrival time with boolean iSDepartureTimeNotArrivalTime
	
	
	// Wie einbauen: List<Long> passengers
	
	
	
	
	
	
	// ManyToMany: --> user
	@ManyToMany
	@JoinTable(name = "ride_user",
	joinColumns = @JoinColumn(name="ride_id"),
	inverseJoinColumns = @JoinColumn(name = "user_id"))
	private List<User> users = new ArrayList<>();
	
	
	// ManyToMany: --> Car
	@ManyToMany(mappedBy = "rides")
	private List<Car> cars = new ArrayList<>();
	
	
	
	

}



// Hours reminder:
// https://www.tutorialspoint.com/java/java_date_time.htm




