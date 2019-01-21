package com.example.demo.response;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class Topic implements Serializable {

    @NotNull
    private Integer id;
    
    private String name;
    private String label;

    public Topic() {
    }

    public Topic(Integer id, String name, String label) {
        this.id = id;
        this.name = name;
        this.label = label;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "Topic{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", label='" + label + '\'' +
                '}';
    }
}
