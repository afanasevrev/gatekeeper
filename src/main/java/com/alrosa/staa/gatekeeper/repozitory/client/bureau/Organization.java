package com.alrosa.staa.gatekeeper.repozitory.client.bureau;

import com.alrosa.staa.gatekeeper.Direction;

import java.util.UUID;

public class Organization extends Organizations {
    private String complete_name = "Организация";
    private final Direction direction = Direction.ORGANIZATION;

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
