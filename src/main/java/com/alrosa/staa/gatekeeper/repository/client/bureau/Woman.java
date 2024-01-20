package com.alrosa.staa.gatekeeper.repository.client.bureau;

import com.alrosa.staa.gatekeeper.Direction;

import java.util.UUID;

public class Woman extends Bureau {
    private String complete_name = "Человек";
    private final Direction direction = Direction.WOMAN;

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
