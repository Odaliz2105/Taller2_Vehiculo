import hilo.HiloVentana;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        HiloVentana hiloVentana = new HiloVentana();
        hiloVentana.start();
    }

    public static void main(String[] args) {
        launch(args);
    }
}