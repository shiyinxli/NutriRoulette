module org.example.nutriroulette {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;

    opens org.example.nutriroulette.controllers to javafx.fxml;
    exports org.example.nutriroulette;
    exports org.example.nutriroulette.recipe;
}