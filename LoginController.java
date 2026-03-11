package Test;
import javafx.fxml.FXML;
import javafx.scene.control.*;
public class LoginController {
    @FXML
    private TextField emailField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Label messageLabel;

    @FXML
    private void handleLogin() {

        String email = emailField.getText();
        String password = passwordField.getText();

        if(email.equals("s68122250095@ssru.ac.th") && password.equals("6767")) {
            messageLabel.setText("Login successful!");
        } else {
            messageLabel.setText("Invalid email or password");
        }
    }
}
