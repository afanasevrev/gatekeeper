package com.alrosa.staa.gatekeeper;

import com.alrosa.staa.gatekeeper.repository.client.*;
import com.alrosa.staa.gatekeeper.repository.client.bureau.*;
import com.alrosa.staa.gatekeeper.repository.client.computer.Computer;
import com.alrosa.staa.gatekeeper.repository.client.computer.Console;
import com.alrosa.staa.gatekeeper.repository.client.server.*;
import javafx.scene.control.TreeItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Variables {
    /** Переменные объекты **/
    /**
    Добавляем статический объект дерева - переменная,
    в которой будет размещаться
    выбранный объект в дереве
    */
    public static TreeItem<Global> containerConsoleItem;
    public static TreeItem<Global> adminsConsoleItem;
    //Объявляем статический enum
    public static Direction containerConsoleDirection = Direction.MAIN;
    public static Direction adminsConsoleDirection = Direction.MAIN;
    /** Переменные объекты. Конец. **/

    /** Постоянные объекты **/
    //Указываем путь к рисунку shield. Значок.
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
    /** ---------------------------------------------------------------------------------------- **/
    //Указываем путь к рисунку bureau
    public static final Image imageBureau = new Image(StartGateKeeper.class.getResource("icons/bureau.png").toString());
    //Регистрируем рисунок бюро в ImageView
    public static final ImageView bureauView = new ImageView(imageBureau);
    //Инициируем объект бюро
    public static final TreeItem<Global> bureauTreeItem = new TreeItem<>(new Bureau());
    /** ---------------------------------------------------------------------------------------- **/
    //Указываем путь к рисунку perco
    public static final Image imagePerco = new Image(StartGateKeeper.class.getResource("icons/perco.png").toString());
    //Регистрируем рисунок perco в ImageView
    public static final ImageView percoView = new ImageView(imagePerco);
    //Инициируем объект perco
    public static final TreeItem<Global> percoTreeItem = new TreeItem<>(new Perco());
    /** ---------------------------------------------------------------------------------------- **/
    //Указываем путь к рисунку PERCoC01
    public static final Image imagePERCoC01 = new Image(StartGateKeeper.class.getResource("icons/PERCoC01.png").toString());
    //Регистрируем рисунок PERCoC01 в ImageView
    public static final ImageView PERCoC01View = new ImageView(imagePERCoC01);
    //Инициируем объект PERCoC01
    public static final TreeItem<Global> PERCoC01TreeItem = new TreeItem<>(new PERCoC01());
    /** ---------------------------------------------------------------------------------------- **/
    //Указываем путь к рисунку cardreader
    public static final Image imageCardReader = new Image(StartGateKeeper.class.getResource("icons/cardreader.png").toString());
    //Регистрируем рисунок cardreader в ImageView
    public static final ImageView cardReaderView = new ImageView(imageCardReader);
    //Инициируем объект cardReader
    public static final TreeItem<Global> cardReaderTreeItem = new TreeItem<>(new CardReader());
    /** ---------------------------------------------------------------------------------------- **/
    //Указываем путь к рисунку console
    public static final Image imageConsole = new Image(StartGateKeeper.class.getResource("icons/console.png").toString());
    //Регистрируем рисунок console в ImageView
    public static final ImageView consoleView = new ImageView(imageConsole);
    //Инициируем объект console
    public static final TreeItem<Global> consoleTreeItem = new TreeItem<>(new Console());
    /** ---------------------------------------------------------------------------------------- **/
    //Указываем путь к рисунку users
    public static final Image imageUsers = new Image(StartGateKeeper.class.getResource("icons/users.png").toString());
    //Регистрируем рисунок users в ImageView
    public static final ImageView usersView = new ImageView(imageUsers);
    //Инициируем объект users
    public static final TreeItem<Global> usersTreeItem = new TreeItem<>(new Users());
    /** ---------------------------------------------------------------------------------------- **/
    //Указываем путь к рисунку admins
    public static final Image imageAdmins = new Image(StartGateKeeper.class.getResource("icons/admins.png").toString());
    //Регистрируем рисунок admins в ImageView
    public static final ImageView adminsView = new ImageView(imageAdmins);
    //Инициируем объект admins
    public static final TreeItem<Global> adminsTreeItem = new TreeItem<>(new Admins());
    /** ---------------------------------------------------------------------------------------- **/
    //Уазываем путь к рисунку operators
    public static final Image imageOperators = new Image(StartGateKeeper.class.getResource("icons/operators.png").toString());
    //Регистриуем рисунок в ImageView
    public static final ImageView operatorsView = new ImageView(imageOperators);
    //Инициируем объект operators
    public static final TreeItem<Global> operatorsTreeItem = new TreeItem<>(new Operators());
    /** ---------------------------------------------------------------------------------------- **/
    //Указываем путь к рисунку global_access_levels
    public static final Image imageGlobalAccessLevels = new Image(StartGateKeeper.class.getResource("icons/global_access_levels.png").toString());
    //Регистрируем рисунок в ImageView
    public static final ImageView globalAccessLevelsView = new ImageView(imageGlobalAccessLevels);
    //Инициируем объект global_access_levels
    public static final TreeItem<Global> globalAccessLevelsTreeItem = new TreeItem<>(new GlobalAccessLevels());
    /** ---------------------------------------------------------------------------------------- **/
    //Указываем путь к рисунку cards
    public static final Image imageCards = new Image(StartGateKeeper.class.getResource("icons/cards.png").toString());
    //Регистрируем рисунок в ImageView
    public static final ImageView cardsView = new ImageView(imageCards);
    //Инициируем объект cards
    public static final TreeItem<Global> cardsTreeItem = new TreeItem<>(new Cards());
    /** ---------------------------------------------------------------------------------------- **/
    //Указываем путь к рисунку card_layouts
    public static final Image imageCardLayouts = new Image(StartGateKeeper.class.getResource("icons/card_layouts.png").toString());
    //Регистрируем рисунок в ImageView
    public static final ImageView cardLayoutsView = new ImageView(imageCardLayouts);
    //Инициируем объект cardLayouts
    public static final TreeItem<Global> cardLayoutsTreeItem = new TreeItem<>(new CardLayouts());
    /** ---------------------------------------------------------------------------------------- **/
    //Указываем путь к рисунку positions
    public static final Image imagePositions = new Image(StartGateKeeper.class.getResource("icons/positions.png").toString());
    //Регистрируем рисунок в ImageView
    public static final ImageView positionsView = new ImageView(imagePositions);
    //Инициируем объект positions
    public static final TreeItem<Global> positionsTreeItem = new TreeItem<>(new Positions());
    /** ---------------------------------------------------------------------------------------- **/
    //Указываем путь к рисунку organizations
    public static final Image imageOrganizations = new Image(StartGateKeeper.class.getResource("icons/organizations.png").toString());
    //Регистрируем рисунок в ImageView
    public static final ImageView organizationsView = new ImageView(imageOrganizations);
    //Инициируем объект organizations
    public static final TreeItem<Global> organizationsTreeItem = new TreeItem<>(new Organizations());
    /** ---------------------------------------------------------------------------------------- **/
    public static final Image imageMan = new Image(StartGateKeeper.class.getResource("icons/man.png").toString());
    //Регистрируем рисунок в ImageView
    public static final ImageView manView = new ImageView(imageMan);
    //Инициируем объект man
    public static final TreeItem<Global> manTreeItem = new TreeItem<>(new Man());
    /** ---------------------------------------------------------------------------------------- **/
    //Указываем путь к рисунку woman
    public static final Image imageWoman = new Image(StartGateKeeper.class.getResource("icons/woman.png").toString());
    //Регистрируем рисунок в ImageView
    public static final ImageView womanView = new ImageView(imageWoman);
    //Инициируем объект woman
    public static final TreeItem<Global> womanTreeItem = new TreeItem<>(new Woman());
    /** ---------------------------------------------------------------------------------------- **/
    //Указываем путь к рисунку global_access_level
    public static final Image imageGlobalAccessLevel = new Image(StartGateKeeper.class.getResource("icons/global_access_level.png").toString());
    //Регистрируем рисунок в ImageView
    public static final ImageView globalAccessLevelView = new ImageView(imageGlobalAccessLevel);
    //Инициируем объект globalAccessLevel
    public static final TreeItem<Global> globalAccessLevelTreeItem = new TreeItem<>(new GlobalAccessLevel());
    /** ---------------------------------------------------------------------------------------- **/
    //Указываем путь к рисунку card
    public static final Image imageCard = new Image(StartGateKeeper.class.getResource("icons/card.png").toString());
    //Регистрируем рисунок в ImageView
    public static final ImageView cardView = new ImageView(imageCard);
    //Инициируем объект card
    public static final TreeItem<Global> cardTreeItem = new TreeItem<>(new Card());
    /** ---------------------------------------------------------------------------------------- **/
    //Указываем путь к рисунку card_layout
    public static final Image imageCardLayout = new Image(StartGateKeeper.class.getResource("icons/card_layout.png").toString());
    //Регистрируем рисунок в ImageView
    public static final ImageView cardLayoutView = new ImageView(imageCardLayout);
    //Инициируем объект cardLayout
    public static final TreeItem<Global> cardLayoutTreeItem = new TreeItem<>(new CardLayout());
    /** ---------------------------------------------------------------------------------------- **/
    //Указываем путь к рисунку position
    public static final Image imagePosition = new Image(StartGateKeeper.class.getResource("icons/position.png").toString());
    //Регистрируем рисунок в ImageView
    public static final ImageView positionView = new ImageView(imagePosition);
    //Инициируем объект position
    public static final TreeItem<Global> positionTreeItem = new TreeItem<>(new Position());
    /** ---------------------------------------------------------------------------------------- **/
    //Указываем путь к рисунку organization
    public static final Image imageOrganization = new Image(StartGateKeeper.class.getResource("icons/organization.png").toString());
    //Регистрируем рисунок в ImageView
    public static final ImageView organizationView = new ImageView(imageOrganization);
    //Инициируем объект organization
    public static final TreeItem<Global> organizationTreeItem = new TreeItem<>(new Organization());
    /** ---------------------------------------------------------------------------------------- **/
    //Указываем путь к рисунку office
    public static final Image imageOffice = new Image(StartGateKeeper.class.getResource("icons/office.png").toString());
    //Регистрируем рисунок в ImageView
    public static final ImageView officeView = new ImageView(imageOffice);
    //Инициируем объект office
    public static final TreeItem<Global> officeTreeItem = new TreeItem<>(new Office());

    /** Постоянные объекты. Конец. **/

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

        globalAccessLevelsView.setFitHeight(25);
        globalAccessLevelsView.setFitWidth(25);
        globalAccessLevelsTreeItem.setGraphic(globalAccessLevelsView);

        cardsView.setFitHeight(25);
        cardsView.setFitWidth(25);
        cardsTreeItem.setGraphic(cardsView);

        cardLayoutsView.setFitWidth(25);
        cardLayoutsView.setFitHeight(25);
        cardLayoutsTreeItem.setGraphic(cardLayoutsView);

        positionsView.setFitHeight(25);
        positionsView.setFitWidth(25);
        positionsTreeItem.setGraphic(positionsView);

        organizationsView.setFitWidth(25);
        organizationsView.setFitHeight(25);
        organizationsTreeItem.setGraphic(organizationsView);

        manView.setFitHeight(25);
        manView.setFitWidth(25);
        manTreeItem.setGraphic(manView);

        womanView.setFitWidth(25);
        womanView.setFitHeight(25);
        womanTreeItem.setGraphic(womanView);

        globalAccessLevelView.setFitWidth(25);
        globalAccessLevelView.setFitHeight(25);
        globalAccessLevelTreeItem.setGraphic(globalAccessLevelView);

        cardView.setFitWidth(25);
        cardView.setFitHeight(25);
        cardTreeItem.setGraphic(cardView);

        cardLayoutView.setFitHeight(25);
        cardLayoutView.setFitWidth(25);
        cardLayoutTreeItem.setGraphic(cardLayoutView);

        positionView.setFitHeight(25);
        positionView.setFitWidth(25);
        positionTreeItem.setGraphic(positionView);

        organizationView.setFitWidth(25);
        organizationView.setFitHeight(25);
        organizationTreeItem.setGraphic(organizationView);

        officeView.setFitHeight(25);
        officeView.setFitWidth(25);
        officeTreeItem.setGraphic(officeView);
    }
}
