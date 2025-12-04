package insurance.cv.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import insurance.cv.entity.Caravan;

@Repository
public interface CaravanRepo extends JpaRepository<Caravan, Long> {

}
