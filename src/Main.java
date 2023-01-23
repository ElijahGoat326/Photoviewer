import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class Main extends Application {
    int currentImage;
        @Override
        public void start(Stage primaryStage) throws Exception {
            // Construct controls
            FileInputStream input = new FileInputStream("Fazbear.jpg");
            Image image = new Image(input);
            ImageView imageView = new ImageView(image);
            imageView.setFitHeight(200);
            imageView.setFitWidth(400);

            FileInputStream input2 = new FileInputStream("Chica.jpeg");
            Image image2 = new Image(input2);
            imageView.setImage(image2);


            FileInputStream input3 = new FileInputStream("Foxy.jpg");
            Image image3 = new Image(input3);
            imageView.setImage(image3);

            FileInputStream input4 = new FileInputStream("springtrap.jpg");
            Image image4 = new Image(input4);
            imageView.setImage(image4);

            FileInputStream input5 = new FileInputStream("bonnie.jpg");
            Image image5 = new Image(input5);
            imageView.setImage(image5);

            currentImage = 5;

            Button button = new Button("My Label");
            button.setText("Forward!");
            button.setOnAction(actionEvent -> {
                System.out.println(currentImage);
                if (currentImage == 5) {
                    imageView.setImage(image);
                    currentImage = 1;
                } else if (currentImage == 1) {
                    imageView.setImage(image2);
                    currentImage = 2;
                } else if (currentImage == 2) {
                    imageView.setImage(image3);
                    currentImage = 3;
                } else if (currentImage == 3) {
                    imageView.setImage(image4);
                    currentImage = 4;
                } else if (currentImage == 4) {
                    imageView.setImage(image5);
                    currentImage = 5;
                }
            });


            Button button2 = new Button("My Label");
            button2.setText("Reverse!");
            button2.setOnAction(actionEvent -> {
                System.out.println(currentImage);
                if (currentImage == 1) {
                    imageView.setImage(image5);
                    currentImage = 5;
                } else if (currentImage == 5) {
                    imageView.setImage(image4);
                    currentImage = 4;
                } else if (currentImage == 4) {
                    imageView.setImage(image3);
                    currentImage = 3;
                } else if (currentImage == 3) {
                    imageView.setImage(image2);
                    currentImage = 2;
                } else if (currentImage == 2) {
                    imageView.setImage(image);
                    currentImage = 1;
                }
            });




            // Layout the controls
            HBox hbox = new HBox(imageView,button,button2);
            Scene scene = new Scene(hbox, 600, 400);

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