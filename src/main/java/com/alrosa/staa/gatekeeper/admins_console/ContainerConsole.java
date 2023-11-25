package com.alrosa.staa.gatekeeper.admins_console;

import com.alrosa.staa.gatekeeper.Direction;
import com.alrosa.staa.gatekeeper.Variables;
import com.alrosa.staa.gatekeeper.repozitory.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class ContainerConsole implements Initializable {
    @FXML
    AnchorPane anchorPane = new AnchorPane();
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
        addItems(Variables.direction);
        globalTreeItem.setExpanded(true);
    }
    //Метод для построения дерева объектов
    private void addItems(Direction direction) {
        switch (direction) {
            case MAIN: globalTreeItem.getChildren().addAll(Variables.serverTreeItem, Variables.computerTreeItem, Variables.bureauTreeItem);
                       break;
            case SERVER:
                       break;

            default:   System.out.println("Selected item: default");
                       break;
        }
    }
}
