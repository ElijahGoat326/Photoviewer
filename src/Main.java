import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class Main extends Application {

        @Override
        public void start(Stage primaryStage) throws Exception {
            // Construct controls
            FileInputStream input = new FileInputStream("resources/images/iconmonstr-home-6-48.png");
            Image image = new Image(input);
            ImageView imageView = new ImageView(image);

            HBox hbox = new HBox(imageView);

            // Layout the controls
            Scene scene = new Scene(hbox, 400, 200);
            // Put the layout into the scene
            primaryStage.setScene(scene);
            primaryStage.setTitle("My First JavaFX App");
            primaryStage.show();
        }

        public static void main(String[] args) {
            Application.launch(args);
        }
}