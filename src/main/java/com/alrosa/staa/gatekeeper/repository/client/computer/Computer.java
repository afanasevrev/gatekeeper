package com.alrosa.staa.gatekeeper.repository.client.computer;

import com.alrosa.staa.gatekeeper.Direction;
import com.alrosa.staa.gatekeeper.repository.client.Global;

import java.util.UUID;

public class Computer extends Global {
    private String complete_name = "Компьютер";

    private final Direction direction = Direction.COMPUTER;
    @Override
    public String getCompleteName() {
        return complete_name;
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
