package com.alrosa.staa.gatekeeper.repozitory;

import com.alrosa.staa.gatekeeper.Direction;

import java.security.DigestException;
import java.util.UUID;

public class CardLayouts extends Bureau {
    private String complete_name = "Макеты карт";
    private final Direction direction = Direction.CARD_LAYOUTS;

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
