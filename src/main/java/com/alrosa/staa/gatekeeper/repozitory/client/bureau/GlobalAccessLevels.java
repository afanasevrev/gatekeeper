package com.alrosa.staa.gatekeeper.repozitory.client.bureau;

import com.alrosa.staa.gatekeeper.Direction;
import com.alrosa.staa.gatekeeper.repozitory.client.bureau.Bureau;

import java.util.UUID;

public class GlobalAccessLevels extends Bureau {
    private String complete_name = "Глобальные уровни доступа";
    private final Direction direction = Direction.GLOBAL_ACCESS_LEVELS;

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
