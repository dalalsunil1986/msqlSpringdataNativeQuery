package org.sambsoft.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USERSETTINGS")
public class UserSettings {

    @Id
    private String id;
    private String settings;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSettings() {
        return settings;
    }

    public void setSettings(String settings) {
        this.settings = settings;
    }

    public UserSettings(String id, String settings) {
        this.id = id;
        this.settings = settings;
    }

    @Override
    public String toString() {
        return "UserSettings{" +
                "id='" + id + '\'' +
                ", settings='" + settings + '\'' +
                '}';
    }

    public UserSettings() {
    }
}
