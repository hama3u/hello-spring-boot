package training.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by platykun on 2016/06/26.
 */
@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer> {
    @Query("SELECT * from Project")
    List<Project> findAllData();
}
