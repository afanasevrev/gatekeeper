package com.alrosa.staa.gatekeeper.repozitory;

import com.alrosa.staa.gatekeeper.Direction;

import java.util.UUID;

public class PERCoC01 extends Perco {

    private String complete_name = "Контроллер PERCoC01";

    private final Direction direction = Direction.PERCOC01;

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
