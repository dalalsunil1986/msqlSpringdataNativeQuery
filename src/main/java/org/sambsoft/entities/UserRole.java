package org.sambsoft.entities;


import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "USERROLE")
public class UserRole {

    //some test
    @EmbeddedId
     public  UserRoleId userRoleId;

    public UserRole(String userId, String role) {
        this.userRoleId = new UserRoleId(userId, role);
    }

    public String getUserId() {
        return this.userRoleId.userId;
    }

    public String getRole() {
        return this.userRoleId.role;
    }

    public UserRole() {
    }

    @Override
    public String toString() {
        return "UserRole{" +
                "userRoleId=" + userRoleId +
                '}';
    }


}
