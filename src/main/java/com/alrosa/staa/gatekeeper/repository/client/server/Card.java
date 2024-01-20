package com.alrosa.staa.gatekeeper.repository.client.server;

import com.alrosa.staa.gatekeeper.Direction;

import java.util.UUID;

public class Card extends Cards {
    private String complete_name = "Карта доступа";
    private final Direction direction = Direction.CARD;

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
