module com.alrosa.staa.gatekeeper {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.alrosa.staa.gatekeeper to javafx.fxml;
    exports com.alrosa.staa.gatekeeper;
}