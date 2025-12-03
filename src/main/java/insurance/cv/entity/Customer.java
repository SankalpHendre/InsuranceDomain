package insurance.cv.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "users")
public class Customer {
@Id
@GeneratedValue(strategy = GenerationType.AUTO )
@Column(name = "user_id")
private int userId;
@Column(name="user_name")
private String name;
@Column(name="user_dob")
private LocalDate date;
@Column(name="user_email",unique=true)
private String email;
@Column(name="user_mobile_no")
private String mobileNo;
@Column(name="user_address", length = 500 )
private String address;


}
