package app.repository.classes;

import app.model.classes.Aaa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AaaClassRepository extends JpaRepository<Aaa, Long> {
}
