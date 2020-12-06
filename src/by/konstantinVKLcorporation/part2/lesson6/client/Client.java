package by.konstantinVKLcorporation.part2.lesson6.client;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

import java.util.List;

/**
 * Создать окно для клиентской части чата: большое текстовое поле для отображения переписки
 * в центре окна. Однострочное текстовое поле для ввода сообщений и кнопка для отсылки
 * сообщений на нижней панели. Сообщение должно отсылаться либо по нажатию кнопки на
 * форме, либо по нажатию кнопки Enter. При «отсылке» сообщение перекидывается из нижнего
 * поля в центральное.
 */

public class Client extends Application {

    public static final List<String> USERS_TEST_DATA = List.of("User1", "User2", "User3");

    @Override
    public void start(Stage primaryStage) throws Exception {//создание пользовательского окна
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Client.class.getResource("sample.fxml"));

        Parent root = loader.load();

        primaryStage.setTitle("FirstCHAT");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();

        Network network = new Network();
        if (!network.connect()) {//вызов метода для соединения из класса Network,
            //если он возвращает false вызывается метод showErrorMessage
            showErrorMessage("Проблемы с соединением", "", "Ошибка подключения к серверу");
        }

        Controller viewController = loader.getController();
        viewController.setNetwork(network);

        network.waitMessage(viewController);

        primaryStage.setOnCloseRequest(windowEvent -> network.close());//закрытие потока


    }

    public static void showErrorMessage(String title, String message, String errorMessage) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(message);
        alert.setContentText(errorMessage);
        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
