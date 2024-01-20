package com.alrosa.staa.gatekeeper.repository.client.bureau;

import com.alrosa.staa.gatekeeper.Direction;

import java.util.UUID;

public class Positions extends Bureau {
    private String complete_name = "Должности";
    private Direction direction = Direction.POSITIONS;

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
