package gsdl;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.File;
import java.io.IOException;
import java.util.Random;

public class Test extends Application
{
    @Override
    public void start(Stage primaryStage) throws IOException
    {
        Pane pane = new Pane();
        File file = new File("testingFile/withSword.gsdl");
        TimelineDeserializer deserializer = new TimelineDeserializer(file);
        Group object = deserializer.getObject();
        object.setLayoutX(250);
        object.setLayoutY(250);
        pane.getChildren().add(object);
        Scene scene = new Scene(pane,500,500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
