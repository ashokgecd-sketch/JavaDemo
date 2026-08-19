import javafx.application.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.scene.text.*;
import javafx.stage.*;

public class Practical54 extends Application {
    public void start(Stage s) {
        HBox root = new HBox(25);
        String[] n = { "Projects — 20%", "Quizzes — 10%", "Midterm — 30%", "Final — 40%" };
        int[] v = { 20, 10, 30, 40 };
        Color[] c = { Color.RED, Color.BLUE, Color.GREEN, Color.ORANGE };
        for (int i = 0; i < 4; i++) {
            Rectangle b = new Rectangle(70, v[i] * 5, c[i]);
            VBox x = new VBox(8, new Pane(b), new Text(n[i]));
            x.setStyle("-fx-alignment:bottom-center;");
            root.getChildren().add(x);
        }
        root.setStyle("-fx-padding:30;-fx-alignment:bottom-center;");
        s.setScene(new Scene(root, 500, 300));
        s.show();
    }
}
