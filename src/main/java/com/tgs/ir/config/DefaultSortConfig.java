package com.tgs.ir.config;
import com.tgs.ir.user.UserEntity;
import org.springframework.stereotype.Component;
import java.util.HashMap;
import java.util.Map;

@Component
public class DefaultSortConfig {

    private final Map<Class<?>, String> defaultSortFields = new HashMap<>();

    public DefaultSortConfig() {
        // Define default sort fields for each entity class
        defaultSortFields.put(UserEntity.class, "name"); // Example for User entity
        // Add other entities and their default sort fields as needed
    }

    public String getDefaultSortField(Class<?> entityClass) {
        return defaultSortFields.getOrDefault(entityClass, "id"); // Fallback to "id" if not found
    }
}
