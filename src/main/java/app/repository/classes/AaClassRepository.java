package app.repository.classes;

import app.model.classes.Aa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AaClassRepository extends JpaRepository<Aa, Long> {
}
