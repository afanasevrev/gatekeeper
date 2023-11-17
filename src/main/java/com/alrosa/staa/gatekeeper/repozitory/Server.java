package com.alrosa.staa.gatekeeper.repozitory;

import com.alrosa.staa.gatekeeper.Direction;

import java.util.UUID;

public class Server extends Global {
    private String complete_name = "Сервер";
    private final Direction  direction = Direction.SERVER;

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
        return direction;
    }

    @Override
    public String toString() {
        return getCompleteName();
    }
}
