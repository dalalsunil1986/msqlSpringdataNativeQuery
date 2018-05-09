package org.sambsoft.repositories;

import org.sambsoft.entities.UserSettings;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserSettingsRepository  extends JpaRepository<UserSettings, String> {
}
