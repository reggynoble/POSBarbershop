/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barbershopsystem;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.scene.Node;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
/**
 *
 * @author reggynoble
 */
public class Barbershopsystem extends Application {
    
   @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("BOB'S BARBERSHOP");

        Button button1 = new Button("KIDS CUT");
        Button button2 = new Button("FADES");
        Button button3 = new Button("SNACK BAR");
        Button button4 = new Button("REGULAR CUT");
        Button button5 = new Button("PREMIUM CUT");
        Button button6 = new Button("TOTAL");

        GridPane gridPane = new GridPane();

        gridPane.add(button1, 0, 0, 1, 1);
        gridPane.add(button2, 1, 0, 1, 1);
        gridPane.add(button3, 2, 0, 1, 1);
        gridPane.add(button4, 0, 1, 1, 1);
        gridPane.add(button5, 1, 1, 1, 1);
        gridPane.add(button6, 2, 1, 1, 1);

        Scene scene = new Scene(gridPane, 800, 900);
        primaryStage.setScene(scene);
        primaryStage.show();
       
        
    }
                
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
