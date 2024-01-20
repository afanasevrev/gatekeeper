package com.alrosa.staa.gatekeeper.repository.client.bureau;

import com.alrosa.staa.gatekeeper.Direction;
import com.alrosa.staa.gatekeeper.repository.client.Global;

import java.util.UUID;

public class Bureau extends Global {

    private String complete_name = "Бюро";

    private final Direction direction = Direction.BUREAU;
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
