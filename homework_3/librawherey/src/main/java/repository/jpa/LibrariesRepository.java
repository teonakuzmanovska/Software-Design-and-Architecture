package repository.jpa;

import model.Libraries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LibrariesRepository extends JpaRepository<Libraries, Long> {

}
