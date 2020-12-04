package by.konstantinVKLcorporation.part2.lesson6.client;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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

    private final ObservableList<String> wordList = FXCollections.observableArrayList("Иванов", "Петров");

    @FXML
    public void initialize() {
        listView.setItems(FXCollections.observableArrayList(wordList));
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

    @FXML
    public void addWordToList() {
        String word = inputField.getText();
        if (word.isBlank()) {
            System.out.println("Пустота");
            return;
        }
        area.appendText(word);
        area.appendText(System.lineSeparator());
        area.isEditable();
        inputField.clear();
    }

    private void sendMessage(){ //метод для отправки сообщения на экран
        String message = inputField.getText();
        appendMessage (message);
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
