package com.alrosa.staa.gatekeeper.repozitory.client.computer;

import com.alrosa.staa.gatekeeper.Direction;
import com.alrosa.staa.gatekeeper.repozitory.client.computer.Computer;

import java.util.UUID;

public class Console extends Computer {
    private String complete_name = "Консоль";
    private final Direction direction = Direction.CONSOLE;
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
