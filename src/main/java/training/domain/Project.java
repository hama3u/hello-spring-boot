package training.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Created by platykun on 2016/06/26.
 */
@Entity
@Table(name="project")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Project {
    @Id
    @GeneratedValue
    private  Integer projectId;

    @Column(nullable = false)
    private String name;
//    private String projectName;
//    private String projectManager;
}