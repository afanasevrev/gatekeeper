package com.alrosa.staa.gatekeeper.admins_console.boxes;

import com.alrosa.staa.gatekeeper.Direction;
import com.alrosa.staa.gatekeeper.StartGateKeeper;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

import java.io.IOException;

public class Boxes {
    public Parent loader;
    public void init(Direction direction) {
        try {
            switch(direction) {
                case MAIN:     loader = new FXMLLoader().load(StartGateKeeper.class.getResource("admins_console/boxes/main.fxml"));
                               break;
                case SERVER:
                case COMPUTER:
                case BUREAU:

                default:       loader = new FXMLLoader().load(StartGateKeeper.class.getResource("admins_console/default.fxml"));
                               break;

            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
