package org.sambsoft.entities;


import javax.persistence.*;
import java.io.Serializable;


@Embeddable
@Access(AccessType.FIELD)
public class UserRoleId implements Serializable {
    @Column(name = "USER_ID")
    public String userId;
    @Column(name = "ROLE")
    public String role;

   public  UserRoleId(){

    }

    public UserRoleId(String userId, String role){
       this.userId=userId;
       this.role=role;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "UserRoleId{" +
                "userId='" + userId + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
