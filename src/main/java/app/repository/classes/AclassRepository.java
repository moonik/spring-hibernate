package app.repository.classes;

import app.model.classes.A;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AclassRepository extends JpaRepository<A, Long> {
}
