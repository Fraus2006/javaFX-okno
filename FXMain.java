/*
 * (C) 2020, Tomas Kraus
 */

package cz.tk.javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
/**
 * Programm startup class.
 */
public class FXMain extends Application {
        
        private static class HelloWorldEventHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
            System.out.println(" Ja jsem: !");
           
        }
    }
        
        private static class HelloWorldEventHandler2 implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
            System.out.println(" Tomas!");
            
        }
    }


    private static class HelloWorldEventHandler3 implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
            System.out.println("Ja jsem Jana a jdu udelat neco duleziteho.!");
                int i=1;
                while(i!=10){
               System.out.println("Ja jsem Jana a jdu udelat neco duleziteho.!Jdu pocitat, kolik chyb jsem udelala: "+ i + "."); 
               i++;
         } 
        }
    }
    


    @Override
    public void start(Stage primaryStage) {
            
            
            Text text = new Text();
            text.setX(200);
            text.setY(200);
            String netext = "Text here";
            text.setText(netext);

            Button button =new Button();
            button.setText("Ja jsem");
            button.setOnAction(new HelloWorldEventHandler());
          
            Button button2 =new Button();
            button2.setText("Tomas");
            button2.setOnAction(new HelloWorldEventHandler2());

            Button button3 =new Button();
            button3.setText("Ja jsem Jana");
            button3.setOnAction(new HelloWorldEventHandler3());
           
           
           VBox layout = new VBox(20);
           layout.getChildren().addAll(button,button2,button3,text);
           primaryStage.setTitle("Moje okno (ne windows :D)");
           Scene scene1 = new Scene(layout,1000,500);
           primaryStage.setScene(scene1);
           primaryStage.show();

      
           
           
    
    




}

    public static final void main(String[] args) {
        launch(args);
    }

    
}
