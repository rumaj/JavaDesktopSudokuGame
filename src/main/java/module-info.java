module sample.javadesktopsudokugame {
    requires javafx.controls;
    requires javafx.fxml;


    opens sample.javadesktopsudokugame to javafx.fxml;
    exports sample.javadesktopsudokugame;
}