package com.hazardousdev.gym_dairy.model;

import com.github.rkmk.annotations.PrimaryKey;

import java.io.Serializable;

/**
 * @author alcovp
 */
public class User implements Serializable {

    private Long id;
    @PrimaryKey
    private String name;
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
