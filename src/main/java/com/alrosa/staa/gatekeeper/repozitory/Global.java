package com.alrosa.staa.gatekeeper.repozitory;

import com.alrosa.staa.gatekeeper.Direction;

import java.util.UUID;

public abstract class Global {
    //Метод для возврата имени класса
    public abstract String getCompleteName();
    //Метод для возврата уникального унифицированного id, который хранится в базе данных проекта
    public abstract UUID getId();
    //Метод для возврата enum-a
    public abstract Direction getDirection();
}