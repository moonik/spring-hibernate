package app.repository;

import app.model.A;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AclassRepository extends JpaRepository<A, Long> {
}
