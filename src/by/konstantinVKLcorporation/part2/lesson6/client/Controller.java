package by.konstantinVKLcorporation.part2.lesson6.client;


import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;


public class Controller {
    @FXML
    private TextField inputField;

    @FXML
    private ListView listView;

    @FXML
    private TextArea area;

    @FXML
    private Label nameWindow;

    @FXML
    private Button sendButton;

    private Network network;

    public void setNetwork(Network network) {
        this.network = network;
    }


    @FXML
    public void initialize() {
        listView.setItems(FXCollections.observableArrayList(by.konstantinVKLcorporation.part2.lesson6.client.Client.USERS_TEST_DATA));//by.konstantinVKLcorporation.part2.lesson6.client.Client.USERS_TEST_DATA
        sendButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Controller.this.sendMessage();
            }
        });
        inputField.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Controller.this.sendMessage();
            }
        });
    }


    private void sendMessage() { //метод для отправки сообщения на экран
        String message = inputField.getText();
        inputField.clear();

        try {
            network.getOut().writeUTF(message);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Ошибка при отправке сообщения");
        }
    }

    public void appendMessage(String message) { //метод для добавления сообщения
        area.appendText(message);
        area.appendText(System.lineSeparator());
    }

}
