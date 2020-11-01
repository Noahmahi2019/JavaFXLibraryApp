package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;

public class Controller {
        public PasswordField passwordField;
        @FXML
        public void SignUp() {
            if (passwordField.getText().isEmpty() || passwordField.getText().isBlank()) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setContentText("Please enter your password.");
                alert.setHeaderText(null);
                alert.show();
            }
            else {
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setContentText("Account  successfully created ");
                alert.setHeaderText(null);
                alert.show();
            }
        }
    }
