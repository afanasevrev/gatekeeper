package com.alrosa.staa.gatekeeper.repository.client.server;

import com.alrosa.staa.gatekeeper.Direction;
import com.alrosa.staa.gatekeeper.repository.client.bureau.Bureau;

import java.util.UUID;

public class Cards extends Bureau {
    private String complete_name = "Карты доступа";
    private final Direction direction = Direction.CARDS;

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
