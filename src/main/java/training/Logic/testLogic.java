package training.Logic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Controller;
import training.web.TestForm;

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
        String sql = "SELECT * from test";
        SqlParameterSource param = new MapSqlParameterSource();
        String result = jdbcTemplate.queryForObject(sql, param, String.class);

        System.out.println("result = " + result);

        return null;
    }


}
