package com.alrosa.staa.gatekeeper.repozitory;

import com.alrosa.staa.gatekeeper.Direction;

import java.util.UUID;

public class Perco extends Server {
    private String complete_name = "Контроллер Perco";

    private final Direction direction = Direction.PERCO;
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
