package com.alrosa.staa.gatekeeper.repository.client.bureau;

import com.alrosa.staa.gatekeeper.Direction;

import java.util.UUID;

public class Admins extends Bureau {
    private String complete_name = "Администраторы";
    private final Direction direction = Direction.ADMINS;

    @Override
    public String getCompleteName() {
        return this.complete_name;
    }

    @Override
    public void setCompleteName(String completeName) {
        this.complete_name = completeName;
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
