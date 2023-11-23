package com.alrosa.staa.gatekeeper;

import javafx.scene.image.Image;

public class Variables {
    //Объявляем статический enum
    public static Direction direction;
    //Указываем путь к рисунку shield
    public static final Image image = new Image(StartGateKeeper.class.getResource("favicon/shield.png").toString());
    //Указываем путь к рисунку main
    public static final Image mainImage = new Image(StartGateKeeper.class.getResource("icons/main.png").toString());
    //Указываем путь к рисунку server
    public static final Image imageServer = new Image(StartGateKeeper.class.getResource("icons/server.png").toString());
}
