package com.alrosa.staa.gatekeeper.repository.client.bureau;

import com.alrosa.staa.gatekeeper.Direction;

import java.util.UUID;

public class Users extends Bureau {
    private String compete_name = "Пользователи";
    private final Direction direction = Direction.USERS;

    @Override
    public String getCompleteName() {
        return this.compete_name;
    }

    @Override
    public void setCompleteName(String completeName) {
        this.compete_name = completeName;
    }

    @Override
    public UUID getId() {
        return null;
    }

    @Override
    public Direction getDirection() {
        return this.direction;
    }

    @Override
    public String toString() {
        return getCompleteName();
    }
}
