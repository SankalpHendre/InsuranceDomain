package insurance.cv.entity;

<<<<<<< HEAD
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="policies")
public class Policy {
=======
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
>>>>>>> 37ef1f155039db10a642a95197eeb89fb7be1fba

@Entity
@Table(name="policies")
public class Policy {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name = "Policy_id")
private int id;
}
