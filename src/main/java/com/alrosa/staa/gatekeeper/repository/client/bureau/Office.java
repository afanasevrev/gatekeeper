package com.alrosa.staa.gatekeeper.repository.client.bureau;

import com.alrosa.staa.gatekeeper.Direction;

import java.util.UUID;

public class Office extends Organization {
    private String complete_name = "Отдел";
    private final Direction direction = Direction.OFFICE;

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
