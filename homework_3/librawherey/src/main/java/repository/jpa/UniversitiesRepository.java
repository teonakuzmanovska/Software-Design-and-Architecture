package repository.jpa;

import model.Universities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UniversitiesRepository extends JpaRepository<Universities, Long>{

}
