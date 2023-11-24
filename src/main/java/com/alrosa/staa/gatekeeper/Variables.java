package com.alrosa.staa.gatekeeper;

import com.alrosa.staa.gatekeeper.repozitory.Global;
import javafx.scene.control.TreeItem;
import javafx.scene.image.Image;

public class Variables {
    /*
    Добавляем статический объект дерева - переменная, в которой будет размещаться
    выбранный объект в дереве
    */
    public static TreeItem<Global> item;
    //Объявляем статический enum
    public static Direction direction = Direction.MAIN;
    //Указываем путь к рисунку shield
    public static final Image image = new Image(StartGateKeeper.class.getResource("favicon/shield.png").toString());
    //Указываем путь к рисунку main
    public static final Image mainImage = new Image(StartGateKeeper.class.getResource("icons/main.png").toString());
    //Указываем путь к рисунку server
    public static final Image imageServer = new Image(StartGateKeeper.class.getResource("icons/server.png").toString());
    //Указываем путь к рисунку computer
    public static final Image imageComputer = new Image(StartGateKeeper.class.getResource("icons/computer.png").toString());
    //Указываем путь к рисунку bureau
    public static final Image imageBureau = new Image(StartGateKeeper.class.getResource("icons/bureau.png").toString());
}
