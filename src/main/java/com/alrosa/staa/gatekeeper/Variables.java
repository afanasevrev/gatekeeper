package com.alrosa.staa.gatekeeper;

import com.alrosa.staa.gatekeeper.repozitory.Bureau;
import com.alrosa.staa.gatekeeper.repozitory.Computer;
import com.alrosa.staa.gatekeeper.repozitory.Global;
import com.alrosa.staa.gatekeeper.repozitory.Server;
import javafx.scene.control.TreeItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

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
    //Регистрируем рисунок сервера в ImageView
    public static final ImageView serverView = new ImageView(imageServer);
    //Инициируем объект сервера
    public static final TreeItem<Global> serverTreeItem = new TreeItem<>(new Server());

    //Указываем путь к рисунку computer
    public static final Image imageComputer = new Image(StartGateKeeper.class.getResource("icons/computer.png").toString());
    //Регистрируем рисунок компьютера в ImageView
    public static final ImageView computerView = new ImageView(imageComputer);
    //Инициируем объект компьютера
    public static final TreeItem<Global> computerTreeItem = new TreeItem<>(new Computer());
    //********************************************************************************************
    //Указываем путь к рисунку bureau
    public static final Image imageBureau = new Image(StartGateKeeper.class.getResource("icons/bureau.png").toString());
    //Регистрируем рисунок бюро в ImageView
    public static final ImageView bureauView = new ImageView(imageBureau);
    //Инициируем объект бюро
    public static final TreeItem<Global> bureauTreeItem = new TreeItem<>(new Bureau());
    //********************************************************************************************

    static {
        serverView.setFitWidth(25);
        serverView.setFitHeight(25);
        serverTreeItem.setGraphic(serverView);

        computerView.setFitHeight(25);
        computerView.setFitWidth(25);
        computerTreeItem.setGraphic(computerView);

        bureauView.setFitWidth(25);
        bureauView.setFitHeight(25);
        bureauTreeItem.setGraphic(bureauView);
    }
}
