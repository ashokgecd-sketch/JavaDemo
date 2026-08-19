import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class Practical53 extends Application {
    public void start(Stage s) {
        TextField roll = new TextField(), name = new TextField(), age = new TextField(), email = new TextField();
        GridPane g = new GridPane();
        g.setHgap(8);
        g.setVgap(8);
        String[] labels = { "Roll No", "Name", "Age", "Email" };
        TextField[] fields = { roll, name, age, email };
        for (int i = 0; i < 4; i++) {
            g.addRow(i, new Label(labels[i]), fields[i]);
        }
        Button submit = new Button("Submit");
        g.add(submit, 1, 4);
        submit.setOnAction(e -> {
            try {
                Integer.parseInt(roll.getText());
                Integer.parseInt(age.getText());
                if (!email.getText().matches(".*@.*\\..*"))
                    throw new IllegalArgumentException("Invalid email");
                new Alert(Alert.AlertType.INFORMATION, "Registered: " + name.getText()).showAndWait();
            } catch (Exception x) {
                new Alert(Alert.AlertType.ERROR, "Enter integer roll number/age and valid email.").showAndWait();
            }
        });
        s.setScene(new Scene(g, 350, 220));
        s.show();
    }
}
