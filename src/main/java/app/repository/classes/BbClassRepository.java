package app.repository.classes;

import app.model.classes.Bb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BbClassRepository extends JpaRepository<Bb, Long> {
}
