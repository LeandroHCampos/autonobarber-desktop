module org.example.autonobarberdesktop {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens org.example.autonobarberdesktop to javafx.fxml;
    exports org.example.autonobarberdesktop;
    exports org.example.autonobarberdesktop.controller;
    opens org.example.autonobarberdesktop.controller to javafx.fxml;
}