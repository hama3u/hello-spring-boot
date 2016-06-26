package training.Logic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Controller;
import training.domain.Customer;
import training.domain.Project;
import training.domain.ProjectRepository;
import training.web.TestForm;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * h2データベースへtestformに格納された値を登録する。
 * Created by platykun on 2016/06/25.
 */
@Controller
public class TestLogic {

    @Autowired
    NamedParameterJdbcTemplate jdbcTemplate;

    /**
     *     DBにtestFormのデータを登録して一覧表示された文字列を返却する。
     */
    public String registData(TestForm testForm){
        String sql = "SELECT * from project";
        SqlParameterSource param = new MapSqlParameterSource();
//        String result = jdbcTemplate.queryForObject(sql, param, String.class);
//        System.out.println("result = " + result);
//        List<Project> projectList = jdbcTemplate.query(
//                sql,
//                new RowMapper<Project>() {
//                    public Project mapRow(ResultSet rs, int rowNum) throws SQLException {
//                        Project p = new Project();
//                        p.setProjectId(rs.getInt("PROJECT_ID"));
//                        p.setName(rs.getString("NAME"));
//                        return p;
//                    }
//                }
//        );
        List<Prject> hoge = ProjectRepository.findAllData();



        return null;
    }


}
