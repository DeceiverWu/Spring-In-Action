package com.deceiver.pojo;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: deceiver
 * Date: 2019-06-11
 * Time: 11:01
 */
public class Spitter {

    private Long id;

    private String username;

    private String password;

    private String fullName;

    private List<Spittle> spittles;

    private String email;

    private boolean updateByEmail;

    public static final Spitter FAKE_SPITTER = new Spitter();
    static {
        FAKE_SPITTER.setUsername("Spitter Not Exists, Go Create It.");
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setSpittles(List<Spittle> spittles) {
        this.spittles = spittles;
    }

    public List<Spittle> getSpittles() {
        return spittles;
    }

    public void setUpdateByEmail(boolean updateByEmail) {
        this.updateByEmail = updateByEmail;
    }

    public boolean isUpdateByEmail() {
        return updateByEmail;
    }


    @Override
    public boolean equals(Object obj) {
        //
        if(obj == null)
            return false;
        if(! (obj instanceof Spitter))
            return false;
        Spitter other = (Spitter) obj;
        return new EqualsBuilder().append(fullName, other.getFullName()).
                append(username, other.getUsername()).append(password, other.getPassword()).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 31).append(fullName).append(username).append(password).toHashCode();
    }
}
