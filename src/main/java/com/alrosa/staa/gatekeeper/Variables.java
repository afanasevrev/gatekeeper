package com.alrosa.staa.gatekeeper;

import com.alrosa.staa.gatekeeper.repozitory.*;
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
    //Указываем путь к рисунку perco
    public static final Image imagePerco = new Image(StartGateKeeper.class.getResource("icons/perco.png").toString());
    //Регистрируем рисунок perco в ImageView
    public static final ImageView percoView = new ImageView(imagePerco);
    //Инициируем объект perco
    public static final TreeItem<Global> percoTreeItem = new TreeItem<>(new Perco());
    //********************************************************************************************
    //Указываем путь к рисунку PERCoC01
    public static final Image imagePERCoC01 = new Image(StartGateKeeper.class.getResource("icons/PERCoC01.png").toString());
    //Регистрируем рисунок PERCoC01 в ImageView
    public static final ImageView PERCoC01View = new ImageView(imagePERCoC01);
    //Инициируем объект PERCoC01
    public static final TreeItem<Global> PERCoC01TreeItem = new TreeItem<>(new PERCoC01());
    //********************************************************************************************
    //Указываем путь к рисунку cardreader
    public static final Image imageCardReader = new Image(StartGateKeeper.class.getResource("icons/cardreader.png").toString());
    //Регистрируем рисунок cardreader в ImageView
    public static final ImageView cardReaderView = new ImageView(imageCardReader);
    //Инициируем объект cardReader
    public static final TreeItem<Global> cardReaderTreeItem = new TreeItem<>(new CardReader());
    //********************************************************************************************
    //Указываем путь к рисунку console
    public static final Image imageConsole = new Image(StartGateKeeper.class.getResource("icons/console.png").toString());
    //Регистрируем рисунок console в ImageView
    public static final ImageView consoleView = new ImageView(imageConsole);
    //Инициируем объект console
    public static final TreeItem<Global> consoleTreeItem = new TreeItem<>(new Console());
    //********************************************************************************************
    //Указываем путь к рисунку users
    public static final Image imageUsers = new Image(StartGateKeeper.class.getResource("icons/users.png").toString());
    //Регистрируем рисунок users в ImageView
    public static final ImageView usersView = new ImageView(imageUsers);
    //Инициируем объект users
    public static final TreeItem<Global> usersTreeItem = new TreeItem<>(new Users());
    //********************************************************************************************
    //Указываем путь к рисунку admins
    public static final Image imageAdmins = new Image(StartGateKeeper.class.getResource("icons/admins.png").toString());
    //Регистрируем рисунок admins в ImageView
    public static final ImageView adminsView = new ImageView(imageAdmins);
    //Инициируем объект admins
    public static final TreeItem<Global> adminsTreeItem = new TreeItem<>(new Admins());
    //********************************************************************************************
    //Уазываем путь к рисунку operators
    public static final Image imageOperators = new Image(StartGateKeeper.class.getResource("icons/operators.png").toString());
    //Регисртриуем рисунок в ImageView
    public static final ImageView operatorsView = new ImageView(imageOperators);
    //Инициируем объект operators
    public static final TreeItem<Global> operatorsTreeItem = new TreeItem<>(new Operators());

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

        percoView.setFitHeight(25);
        percoView.setFitWidth(25);
        percoTreeItem.setGraphic(percoView);

        PERCoC01View.setFitWidth(25);
        PERCoC01View.setFitHeight(25);
        PERCoC01TreeItem.setGraphic(PERCoC01View);

        cardReaderView.setFitHeight(25);
        cardReaderView.setFitWidth(25);
        cardReaderTreeItem.setGraphic(cardReaderView);

        consoleView.setFitWidth(25);
        consoleView.setFitHeight(25);
        consoleTreeItem.setGraphic(consoleView);

        usersView.setFitWidth(25);
        usersView.setFitHeight(25);
        usersTreeItem.setGraphic(usersView);

        adminsView.setFitHeight(25);
        adminsView.setFitWidth(25);
        adminsTreeItem.setGraphic(adminsView);

        operatorsView.setFitWidth(25);
        operatorsView.setFitHeight(25);
        operatorsTreeItem.setGraphic(operatorsView);
    }
}