package repository.jpa;

import model.Schools;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SchoolsRepository extends JpaRepository<Schools, Long>{

}
