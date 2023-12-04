package com.alrosa.staa.gatekeeper.admins_console;

import com.alrosa.staa.gatekeeper.Direction;
import com.alrosa.staa.gatekeeper.Variables;
import com.alrosa.staa.gatekeeper.repozitory.client.Global;
import com.alrosa.staa.gatekeeper.repozitory.client.Main;
import com.alrosa.staa.gatekeeper.repozitory.client.bureau.*;
import com.alrosa.staa.gatekeeper.repozitory.client.computer.Computer;
import com.alrosa.staa.gatekeeper.repozitory.client.computer.Console;
import com.alrosa.staa.gatekeeper.repozitory.client.server.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.Comparator;
import java.util.ResourceBundle;

public class ContainerConsole implements Initializable {
    @FXML
    private Button buttonCreate = new Button();
    @FXML
    private Button buttonCancel = new Button();
    @FXML
    private AnchorPane anchorPane = new AnchorPane();
    //Инициируем объект дерева
    private TreeItem<Global> globalTreeItem = new TreeItem<>(new Main());
    //Регистрируем рисунок главного объекта в ImageView
    private final ImageView globalView = new ImageView(Variables.mainImage);
    //Добавляем дерево
    private TreeView global = new TreeView(globalTreeItem);

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        AnchorPane.setRightAnchor(global, 0.0);
        AnchorPane.setTopAnchor(global, 0.0);
        AnchorPane.setLeftAnchor(global, 0.0);
        AnchorPane.setBottomAnchor(global, 0.0);
        anchorPane.getChildren().addAll(global);
        globalView.setFitHeight(25);
        globalView.setFitWidth(25);
        globalTreeItem.setGraphic(globalView);
        addItems(Variables.adminsConsoleDirection);
        globalTreeItem.setExpanded(true);

        global.setOnMouseClicked(event -> {
            Variables.containerConsoleItem = (TreeItem<Global>) global.getSelectionModel().getSelectedItem();
            Variables.containerConsoleDirection = Variables.containerConsoleItem.getValue().getDirection();
        });
    }
    //Метод для построения дерева объектов
    private void addItems(Direction direction) {
        globalTreeItem.getChildren().clear();
        switch (direction) {
            case MAIN:
                       globalTreeItem.getChildren().addAll
                               (
                               Variables.serverTreeItem,
                               Variables.computerTreeItem,
                               Variables.bureauTreeItem
                               );
                       break;
            case SERVER:
                       globalTreeItem.getChildren().addAll(Variables.percoTreeItem);
                       break;
            case PERCO:
                       globalTreeItem.getChildren().addAll(Variables.PERCoC01TreeItem);
                       break;
            case PERCOC01:
                       globalTreeItem.getChildren().addAll(Variables.cardReaderTreeItem);
                       break;
            case COMPUTER:
                       globalTreeItem.getChildren().addAll(Variables.consoleTreeItem);
                       break;
            case BUREAU:
                       globalTreeItem.getChildren().addAll
                               (
                               Variables.usersTreeItem,
                               Variables.adminsTreeItem,
                               Variables.operatorsTreeItem,
                               Variables.globalAccessLevelsTreeItem,
                               Variables.cardsTreeItem,
                               Variables.cardLayoutsTreeItem,
                               Variables.positionsTreeItem,
                               Variables.organizationsTreeItem
                               );
                       break;
            case USERS:
            case ADMINS:
            case OPERATORS:
                       globalTreeItem.getChildren().addAll
                               (
                               Variables.manTreeItem,
                               Variables.womanTreeItem
                               );
                       break;
            case GLOBAL_ACCESS_LEVELS:
                       globalTreeItem.getChildren().addAll
                               (
                               Variables.globalAccessLevelTreeItem
                               );
                       break;
            case CARDS:
                       globalTreeItem.getChildren().addAll
                               (
                               Variables.cardTreeItem
                               );
                       break;
            case CARD_LAYOUTS:
                       globalTreeItem.getChildren().addAll
                               (
                               Variables.cardLayoutTreeItem
                               );
                       break;
            case POSITIONS:
                       globalTreeItem.getChildren().addAll
                               (
                               Variables.positionTreeItem
                               );
                       break;
            case ORGANIZATIONS:
                       globalTreeItem.getChildren().addAll
                               (
                               Variables.organizationTreeItem
                               );
                       break;
            case ORGANIZATION:
                       globalTreeItem.getChildren().addAll
                               (
                               Variables.officeTreeItem
                               );
                       break;
            default:   System.out.println("Selected item: default");
                       break;
        }
    }
    @FXML
    private void isPressedButtonCreate() {
        TreeItem<Global> item;
        ImageView imageView;
        switch (Variables.containerConsoleDirection) {
            case MAIN:     break;
            case SERVER:   item = new TreeItem<>(new Server());
                           imageView = new ImageView(Variables.imageServer);
                           imageView.setFitHeight(25);
                           imageView.setFitWidth(25);
                           item.setGraphic(imageView);
                           Variables.adminsConsoleItem.getChildren().add(item);
                           break;
            case COMPUTER: item = new TreeItem<>(new Computer());
                           imageView = new ImageView(Variables.imageComputer);
                           imageView.setFitHeight(25);
                           imageView.setFitWidth(25);
                           item.setGraphic(imageView);
                           Variables.adminsConsoleItem.getChildren().add(item);
                           break;
            case BUREAU:   item = new TreeItem<>(new Bureau());
                           imageView = new ImageView(Variables.imageBureau);
                           imageView.setFitHeight(25);
                           imageView.setFitWidth(25);
                           item.setGraphic(imageView);
                           Variables.adminsConsoleItem.getChildren().add(item);
                           break;
            case PERCO:    item = new TreeItem<>(new Perco());
                           imageView = new ImageView(Variables.imagePerco);
                           imageView.setFitHeight(25);
                           imageView.setFitWidth(25);
                           item.setGraphic(imageView);
                           Variables.adminsConsoleItem.getChildren().add(item);
                           break;
            case PERCOC01: item = new TreeItem<>(new PERCoC01());
                           imageView = new ImageView(Variables.imagePERCoC01);
                           imageView.setFitHeight(25);
                           imageView.setFitWidth(25);
                           item.setGraphic(imageView);
                           Variables.adminsConsoleItem.getChildren().add(item);
                           break;
            case CARDREADER:
                           item = new TreeItem<>(new CardReader());
                           imageView = new ImageView(Variables.imageCardReader);
                           imageView.setFitHeight(25);
                           imageView.setFitWidth(25);
                           item.setGraphic(imageView);
                           Variables.adminsConsoleItem.getChildren().add(item);
                           break;
            case CONSOLE:  item = new TreeItem<>(new Console());
                           imageView = new ImageView(Variables.imageConsole);
                           imageView.setFitHeight(25);
                           imageView.setFitWidth(25);
                           item.setGraphic(imageView);
                           Variables.adminsConsoleItem.getChildren().add(item);
                           break;
            case USERS:    item = new TreeItem<>(new Users());
                           imageView = new ImageView(Variables.imageUsers);
                           imageView.setFitHeight(25);
                           imageView.setFitWidth(25);
                           item.setGraphic(imageView);
                           Variables.adminsConsoleItem.getChildren().add(item);
                           break;
            case ADMINS:   item = new TreeItem<>(new Admins());
                           imageView = new ImageView(Variables.imageAdmins);
                           imageView.setFitHeight(25);
                           imageView.setFitWidth(25);
                           item.setGraphic(imageView);
                           Variables.adminsConsoleItem.getChildren().add(item);
                           break;
            case OPERATORS:
                           item = new TreeItem<>(new Operators());
                           imageView = new ImageView(Variables.imageOperators);
                           imageView.setFitHeight(25);
                           imageView.setFitWidth(25);
                           item.setGraphic(imageView);
                           Variables.adminsConsoleItem.getChildren().add(item);
                           break;
            case GLOBAL_ACCESS_LEVELS:
                           item = new TreeItem<>(new GlobalAccessLevels());
                           imageView = new ImageView(Variables.imageGlobalAccessLevels);
                           imageView.setFitHeight(25);
                           imageView.setFitWidth(25);
                           item.setGraphic(imageView);
                           Variables.adminsConsoleItem.getChildren().add(item);
                           break;
            case CARDS:    item = new TreeItem<>(new Cards());
                           imageView = new ImageView(Variables.imageCards);
                           imageView.setFitHeight(25);
                           imageView.setFitWidth(25);
                           item.setGraphic(imageView);
                           Variables.adminsConsoleItem.getChildren().add(item);
                           break;
            case CARD_LAYOUTS:
                           item = new TreeItem<>(new CardLayouts());
                           imageView = new ImageView(Variables.imageCardLayouts);
                           imageView.setFitHeight(25);
                           imageView.setFitWidth(25);
                           item.setGraphic(imageView);
                           Variables.adminsConsoleItem.getChildren().add(item);
                           break;
            case POSITIONS:
                           item = new TreeItem<>(new Positions());
                           imageView = new ImageView(Variables.imagePositions);
                           imageView.setFitHeight(25);
                           imageView.setFitWidth(25);
                           item.setGraphic(imageView);
                           Variables.adminsConsoleItem.getChildren().add(item);
                           break;
            case ORGANIZATIONS:
                           item = new TreeItem<>(new Organizations());
                           imageView = new ImageView(Variables.imageOrganizations);
                           imageView.setFitHeight(25);
                           imageView.setFitWidth(25);
                           item.setGraphic(imageView);
                           Variables.adminsConsoleItem.getChildren().add(item);
                           break;
            case MAN:      item = new TreeItem<>(new Man());
                           imageView = new ImageView(Variables.imageMan);
                           imageView.setFitHeight(25);
                           imageView.setFitWidth(25);
                           item.setGraphic(imageView);
                           Variables.adminsConsoleItem.getChildren().add(item);
                           break;
            case WOMAN:    item = new TreeItem<>(new Woman());
                           imageView = new ImageView(Variables.imageWoman);
                           imageView.setFitHeight(25);
                           imageView.setFitWidth(25);
                           item.setGraphic(imageView);
                           Variables.adminsConsoleItem.getChildren().add(item);
                           break;
            case GLOBAL_ACCESS_LEVEL:
                           item = new TreeItem<>(new GlobalAccessLevel());
                           imageView = new ImageView(Variables.imageGlobalAccessLevel);
                           imageView.setFitHeight(25);
                           imageView.setFitWidth(25);
                           item.setGraphic(imageView);
                           Variables.adminsConsoleItem.getChildren().add(item);
                           break;
            case CARD:     item = new TreeItem<>(new Card());
                           imageView = new ImageView(Variables.imageCard);
                           imageView.setFitHeight(25);
                           imageView.setFitWidth(25);
                           item.setGraphic(imageView);
                           Variables.adminsConsoleItem.getChildren().add(item);
                           break;
            case CARD_LAYOUT:
                           item = new TreeItem<>(new CardLayout());
                           imageView = new ImageView(Variables.imageCardLayout);
                           imageView.setFitHeight(25);
                           imageView.setFitWidth(25);
                           item.setGraphic(imageView);
                           Variables.adminsConsoleItem.getChildren().add(item);
                           break;
            case POSITION: item = new TreeItem<>(new Position());
                           imageView = new ImageView(Variables.imagePosition);
                           imageView.setFitHeight(25);
                           imageView.setFitWidth(25);
                           item.setGraphic(imageView);
                           Variables.adminsConsoleItem.getChildren().add(item);
                           break;
            case ORGANIZATION:
                           item = new TreeItem<>(new Organization());
                           imageView = new ImageView(Variables.imageOrganization);
                           imageView.setFitHeight(25);
                           imageView.setFitWidth(25);
                           item.setGraphic(imageView);
                           Variables.adminsConsoleItem.getChildren().add(item);
                           break;
            case OFFICE:   item = new TreeItem<>(new Office());
                           imageView = new ImageView(Variables.imageOffice);
                           imageView.setFitHeight(25);
                           imageView.setFitWidth(25);
                           item.setGraphic(imageView);
                           Variables.adminsConsoleItem.getChildren().add(item);
                           break;
            default:       System.out.println(Variables.containerConsoleItem.getValue().getDirection());
                           break;
        }
        //Сортируем элементы дерева после необходимых итераций
        Variables.adminsConsoleItem.getChildren().sort(Comparator.comparing(t->t.getValue().toString()));
    }
    @FXML
    private void isPressedButtonCancel() {
        Stage stage = (Stage) buttonCancel.getScene().getWindow();
        stage.close();
    }
}
