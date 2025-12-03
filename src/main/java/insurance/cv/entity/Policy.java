package insurance.cv.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="policies")
public class Policy {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name = "Policy_id")
private int id;
private String policyName;
}
