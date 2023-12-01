package com.alrosa.staa.gatekeeper.admins_console;

import com.alrosa.staa.gatekeeper.Direction;
import com.alrosa.staa.gatekeeper.Variables;
import com.alrosa.staa.gatekeeper.repozitory.client.Global;
import com.alrosa.staa.gatekeeper.repozitory.client.Main;
import com.alrosa.staa.gatekeeper.repozitory.client.bureau.Bureau;
import com.alrosa.staa.gatekeeper.repozitory.client.computer.Computer;
import com.alrosa.staa.gatekeeper.repozitory.client.server.Server;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.net.URL;
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
            case POSITIONS:
                       globalTreeItem.getChildren().addAll
                               (
                               Variables.positionTreeItem
                               );
            case ORGANIZATIONS:
                       globalTreeItem.getChildren().addAll
                               (
                               Variables.organizationTreeItem
                               );
            case ORGANIZATION:
                       globalTreeItem.getChildren().addAll
                               (
                               Variables.officeTreeItem
                               );
            default:   System.out.println("Selected item: default");
                       break;
        }
    }
    @FXML
    private void isPressedButtonCreate() {
        TreeItem<Global> item;
        ImageView imageView;
        switch (Variables.containerConsoleDirection) {
            case MAIN:
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
            default:       System.out.println(Variables.containerConsoleItem.getValue().getDirection());
                           break;
        }
    }
    @FXML
    private void isPressedButtonCancel() {
        Stage stage = (Stage) buttonCancel.getScene().getWindow();
        stage.close();
    }
}
