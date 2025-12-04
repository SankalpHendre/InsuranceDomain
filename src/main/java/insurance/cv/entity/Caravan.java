package insurance.cv.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Table(name="caravan_master")
public class Caravan {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="carv_id")
	private Long carId;
	@Column(name="carvan_regNo", nullable = false,unique = true)
	private String regiestrationNo;
	@Column(name="model_name",nullable = false)
	private String model;
	@Column(name="mfg_date")
	private LocalDate manufacturerDate;
	@Column(name="carvan_price")
	private Long carvanPrice;
	@Column(name="registration_date")
	private LocalDate registrationDate;
	@Column(name="owner_name",nullable = false)
	private String ownerName;
	@Column(name="carvan_color")
	private String carvanColor;
	@ManyToOne
	@JoinColumn(name="cust_id")
	private Customer customer;
	

}
