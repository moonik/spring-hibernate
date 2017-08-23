package app.repository.classes;

import app.model.classes.D;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DclassRepository extends JpaRepository<D, Long> {
}
