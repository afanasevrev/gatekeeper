package com.alrosa.staa.gatekeeper.repozitory;

import com.alrosa.staa.gatekeeper.Direction;

import java.util.UUID;

public class Main extends Global {
    private String completeName = "Главный";

    private final Direction direction = Direction.MAIN;

    @Override
    public String getCompleteName() {
        return completeName;
    }

    @Override
    public void setCompleteName(String completeName) {
        this.completeName = completeName;
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
