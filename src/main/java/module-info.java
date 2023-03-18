module com._1894._1894 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires de.jensd.fx.glyphs.fontawesome;
    requires java.sql;
    requires org.xerial.sqlitejdbc;


    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens com._1894._1894 to javafx.fxml;
    exports com._1894._1894;
    exports com._1894._1894.Controllers;
    exports com._1894._1894.Controllers.Admin;
    exports com._1894._1894.Controllers.Client;
    exports com._1894._1894.Models;
    exports com._1894._1894.Views;
}