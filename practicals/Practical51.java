import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.util.*;

public class Practical51 extends Application {
    public void start(Stage s) {
        VBox box = new VBox(15);
        box.setStyle("-fx-alignment:center;");
        Random r = new Random();
        for (int i = 1; i <= 5; i++) {
            Text t = new Text("Text " + i);
            t.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
            t.setFill(Color.color(r.nextDouble(), r.nextDouble(), r.nextDouble(), .3 + r.nextDouble() * .7));
            box.getChildren().add(t);
        }
        s.setScene(new Scene(box, 400, 300));
        s.show();
    }

    public static void main(String[] a) {
        launch(a);
    }
}
