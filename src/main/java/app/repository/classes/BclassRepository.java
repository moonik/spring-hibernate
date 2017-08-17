package app.repository.classes;

import app.model.classes.B;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BclassRepository extends JpaRepository<B, Long> {
}
