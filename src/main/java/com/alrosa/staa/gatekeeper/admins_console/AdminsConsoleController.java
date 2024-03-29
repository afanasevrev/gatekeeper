package com.alrosa.staa.gatekeeper.admins_console;

import com.alrosa.staa.gatekeeper.Direction;
import com.alrosa.staa.gatekeeper.Variables;
import com.alrosa.staa.gatekeeper.admins_console.boxes.Boxes;
import com.alrosa.staa.gatekeeper.repository.client.Global;
import com.alrosa.staa.gatekeeper.repository.client.Main;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class AdminsConsoleController implements Initializable {
    private Stage stage = new Stage();
    private Container container = new Container();
    //Добавим контекстное меню
    private ContextMenu contextMenu = new ContextMenu();
    //Создание кнопки "Добавить"
    private MenuItem menuAdd = new MenuItem("Добавить");
    //Создание кнопки "Удалить"
    private MenuItem menuDelete = new MenuItem("Удалить");
    //Окно для отображения дерева
    @FXML
    private AnchorPane windowTree = new AnchorPane();
    //Добавляем основную ветку дерева
    public static TreeItem<Global> mainSystem = new TreeItem<>(new Main());
    //Добавляем дерево
    public static TreeView treeView = new TreeView(mainSystem);
    //Регистрируем рисунок в ImageView
    private final ImageView mainView = new ImageView(Variables.mainImage);
    //Горизонтальный сплиттер
    @FXML
    private SplitPane horizontal = new SplitPane();
    //Вертикальный сплиттер
    @FXML
    private SplitPane vertical = new SplitPane();
    @FXML
    private VBox vBox = new VBox();
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //В контекстное меню добавляем кнопки
        contextMenu.getItems().addAll(menuAdd, menuDelete);
        //В наше дерево добавляем контекстное меню
        treeView.setContextMenu(contextMenu);

        AnchorPane.setLeftAnchor(vBox, 0.0);
        AnchorPane.setBottomAnchor(vBox, 0.0);
        AnchorPane.setTopAnchor(vBox, 0.0);
        AnchorPane.setRightAnchor(vBox, 0.0);

        AnchorPane.setLeftAnchor(horizontal, 0.0);
        AnchorPane.setBottomAnchor(horizontal, 0.0);
        AnchorPane.setTopAnchor(horizontal, 0.0);
        AnchorPane.setRightAnchor(horizontal, 0.0);

        AnchorPane.setLeftAnchor(vertical, 0.0);
        AnchorPane.setBottomAnchor(vertical, 0.0);
        AnchorPane.setTopAnchor(vertical, 0.0);
        AnchorPane.setRightAnchor(vertical, 0.0);

        AnchorPane.setLeftAnchor(treeView, 0.0);
        AnchorPane.setBottomAnchor(treeView, 0.0);
        AnchorPane.setTopAnchor(treeView, 0.0);
        AnchorPane.setRightAnchor(treeView, 0.0);

        windowTree.getChildren().add(treeView);
        mainView.setFitWidth(25);
        mainView.setFitHeight(25);
        mainSystem.setGraphic(mainView);

        treeView.setOnMouseClicked(event -> {
            Variables.adminsConsoleItem = (TreeItem<Global>) treeView.getSelectionModel().getSelectedItem();
            Variables.adminsConsoleDirection = Variables.adminsConsoleItem.getValue().getDirection();
                    //Проверяем, что элемент не является пустым и что была нажата правая кнопка мыши
                    if (Variables.adminsConsoleItem != null && event.getButton() == MouseButton.SECONDARY) {
                        //Добавляем реакцию на нажатие кнопки "Добавить"
                        menuAdd.setOnAction(event1 -> {
                            try {
                                Variables.containerConsoleDirection = Direction.MAIN;
                                container.start(stage);
                            } catch (Exception e) {
                                throw new RuntimeException(e);
                            }
                        });
                        //Добавляем реакцию на нажатие кнопки "Удалить"
                        menuDelete.setOnAction(event1 -> {
                            //System.out.println(Variables.direction);
                            switch (Variables.adminsConsoleDirection) {
                                case MAIN:
                                          break;
                                default:  Variables.adminsConsoleItem.getParent().getChildren().remove(Variables.adminsConsoleItem);
                                          break;
                            }
                        });
                        //Проверяем, что элемент не является пустым и что была нажата левая кнопка мыши
                    } else if(Variables.adminsConsoleItem != null && event.getButton() == MouseButton.PRIMARY) {
                        switch(Variables.adminsConsoleDirection) {
                            case MAIN:
                                    vBox.getChildren().clear();
                                    vBox.getChildren().add(Boxes.loaderMain);
                                    break;
                            case SERVER:
                                    vBox.getChildren().clear();
                                    vBox.getChildren().add(Boxes.loaderServer);
                                    break;
                            default:
                                    vBox.getChildren().clear();
                                    break;
                        }
                    }
            }
        );
    }
    //Метод для добавления объекта в дерево системы
    private void addItem(TreeItem treeItem, Image image) {
        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(25);
        imageView.setFitWidth(25);
        treeItem.setGraphic(imageView);
        Variables.adminsConsoleItem.getChildren().add(treeItem);
    }
}
