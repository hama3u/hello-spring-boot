package training.web;

import lombok.Data;

/**
 * Created by platykun on 2016/06/25.
 */
public class TestForm {
    String name;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
