package com.alrosa.staa.gatekeeper.admins_console;

import com.alrosa.staa.gatekeeper.repozitory.Global;
import com.alrosa.staa.gatekeeper.repozitory.Main;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class AdminsConsoleController implements Initializable {
    //Окно для отображения дерева
    @FXML
    private AnchorPane windowTree = new AnchorPane();
    //Добавляем основную ветку дерева
    private TreeItem<Global> mainSystem = new TreeItem<>(new Main());
    //Добавляем дерево
    private TreeView treeView = new TreeView(mainSystem);
    //Указываем путь к рисунку main
    private Image mainImage = new Image("icons/main.png");
    //Регистрируем рисунок в ImageView
    private ImageView mainView = new ImageView(mainImage);
    //Горизонтальный сплиттер
    @FXML
    private SplitPane horizontal = new SplitPane();
    //Вертикальный сплиттер
    @FXML
    private SplitPane vertical = new SplitPane();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        AnchorPane.setLeftAnchor(horizontal, 0.0);
        AnchorPane.setBottomAnchor(horizontal, 0.0);
        AnchorPane.setTopAnchor(horizontal, 0.0);
        AnchorPane.setRightAnchor(horizontal, 0.0);
        AnchorPane.setLeftAnchor(vertical, 0.0);
        AnchorPane.setBottomAnchor(vertical, 0.0);
        AnchorPane.setTopAnchor(vertical, 0.0);
        AnchorPane.setRightAnchor(vertical, 0.0);
    }
}
