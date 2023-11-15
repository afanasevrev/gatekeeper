module com.alrosa.staa.gatekeeper {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.alrosa.staa.gatekeeper to javafx.fxml;
    exports com.alrosa.staa.gatekeeper;
    exports com.alrosa.staa.gatekeeper.admins_console;
}