import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage; 

public class App extends Application {

    @Override
    public void start (Stage primaryStage) {

        AnchorPane root = new AnchorPane();
        
        Label lbl1 = new Label("Antonio Salazar");
        ImageView img1 = new ImageView("icon.jpg");
        img1.setFitWidth(50);
        img1.setFitHeight(50);
        Label lbl2 = new Label("Toby Ortega");
        ImageView img2 = new ImageView("icon.jpg");
        img2.setFitWidth(50);
        img2.setFitHeight(50);
        Label lbl3 = new Label("Martina Mejia");
        ImageView img3 = new ImageView("iconm.jpg");
        img3.setFitWidth(50);
        img3.setFitHeight(50);
        Label lbl4 = new Label("Tamara Olmedo");
        ImageView img4 = new ImageView("iconm.jpg");
        img4.setFitWidth(50);
        img4.setFitHeight(50);
        Label lbl5 = new Label("Sandra Quintana");
        ImageView img5 = new ImageView("iconm.jpg");
        img5.setFitWidth(50);
        img5.setFitHeight(50);
        Label lbl6 = new Label("Brian Prados");
        ImageView img6 = new ImageView("icon.jpg");
        img6.setFitWidth(50);
        img6.setFitHeight(50);
        Label lbl7 = new Label("Cecilia Molinero");
        ImageView img7 = new ImageView("iconm.jpg");
        img7.setFitWidth(50);
        img7.setFitHeight(50);
        Label lbl8 = new Label("Bernardo Nieto");
        ImageView img8 = new ImageView("icon.jpg");
        img8.setFitWidth(50);
        img8.setFitHeight(50);

        ObservableList<String> nombres = FXCollections.observableArrayList(
                "Antonio Salazar",
                "Toby Ortega",
                "Martina Mejia",
                "Tamara Olmedo",
                "Sandra Quintana",
                "Brian Prados",
                "Cecilia Molinero",
                "Bernardo Nieto"
        );
        ListView<String> lv = new ListView<>(nombres);
        ScrollPane sp = new ScrollPane(root);
        sp.setFitToHeight(true);
        sp.setFitToWidth(true);
        TextField tf = new TextField();
        tf.setPrefHeight(70);
        tf.setPrefWidth(249);
        
        root.getChildren().addAll(lbl1, img1, lbl2, img2, lbl3, img3, lbl4, img4, lbl5, img5, lbl6, img6, lbl7, img7, lbl8, img8, lv, tf);
        AnchorPane.setLeftAnchor(lbl1, 80d);
        AnchorPane.setTopAnchor(lbl1, 25d);
        AnchorPane.setLeftAnchor(img1, 20d);
        AnchorPane.setTopAnchor(img1, 10d);

        AnchorPane.setLeftAnchor(lbl2, 80d);
        AnchorPane.setTopAnchor(lbl2, 100d);
        AnchorPane.setLeftAnchor(img2, 20d);
        AnchorPane.setTopAnchor(img2, 85d);

        AnchorPane.setLeftAnchor(lbl3, 80d);
        AnchorPane.setTopAnchor(lbl3, 175d);
        AnchorPane.setLeftAnchor(img3, 20d);
        AnchorPane.setTopAnchor(img3, 160d);

        AnchorPane.setLeftAnchor(lbl4, 80d);
        AnchorPane.setTopAnchor(lbl4, 250d);
        AnchorPane.setLeftAnchor(img4, 20d);
        AnchorPane.setTopAnchor(img4, 235d);

        AnchorPane.setLeftAnchor(lbl5, 80d);
        AnchorPane.setTopAnchor(lbl5, 325d);
        AnchorPane.setLeftAnchor(img5, 20d);
        AnchorPane.setTopAnchor(img5, 310d);

        AnchorPane.setLeftAnchor(lbl6, 80d);
        AnchorPane.setTopAnchor(lbl6, 400d);
        AnchorPane.setLeftAnchor(img6, 20d);
        AnchorPane.setTopAnchor(img6, 385d);

        AnchorPane.setLeftAnchor(lbl7, 80d);
        AnchorPane.setTopAnchor(lbl7, 475d);
        AnchorPane.setLeftAnchor(img7, 20d);
        AnchorPane.setTopAnchor(img7, 460d);

        AnchorPane.setLeftAnchor(lbl8, 80d);
        AnchorPane.setTopAnchor(lbl8, 550d);
        AnchorPane.setLeftAnchor(img8, 20d);
        AnchorPane.setTopAnchor(img8, 535d);
        
        AnchorPane.setRightAnchor(lv, 10d);
        AnchorPane.setTopAnchor(lv, 10d);

        AnchorPane.setRightAnchor(tf, 10d);
        AnchorPane.setTopAnchor(tf, 420d);


        Scene scene = new Scene(sp, 500, 500);
        primaryStage.setTitle("Interface utilizando layouts");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) throws Exception {
        launch(args);
    }
}