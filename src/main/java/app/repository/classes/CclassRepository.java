package app.repository.classes;

import app.model.classes.C;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;
@Repository
public interface CclassRepository extends JpaRepository<C, Long> {

    @Query("select COUNT(c) from C c")
    Integer countObjects();

    @Query("select COUNT(c) from C c where c.name = ?1")
    Integer countObjectsByName(String name);

    @Query("select c from C c where c.name=?1")
    Collection<C> getAllByName(String name);

    Collection<C> findByName(String name);
}
