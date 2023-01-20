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
            FileInputStream input = new FileInputStream("Fazbear.jpg");
            Image image = new Image(input);
            ImageView imageView = new ImageView(image);
            imageView.setFitHeight(200);
            imageView.setFitWidth(400);

            FileInputStream input2 = new FileInputStream("bonnie.jpg");
            Image image2 = new Image(input2);
            imageView.setImage(image2);

            // Layout the controls
            HBox hbox = new HBox(imageView);
            Scene scene = new Scene(hbox, 400, 200);

            // Put the layout into the scene
            primaryStage.setTitle("ImageView Experiment 1");
            primaryStage.setScene(scene);
            primaryStage.setTitle("My First JavaFX App");
            primaryStage.show();

        }

        public static void main(String[] args) {
            Application.launch(args);
        }
}