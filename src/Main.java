
import javafx.application.Application;
        import javafx.event.EventHandler;
        import javafx.scene.Scene;
        import javafx.scene.control.Button;
        import javafx.scene.input.MouseEvent;
        import javafx.scene.layout.ColumnConstraints;
        import javafx.scene.layout.GridPane;
        import javafx.scene.layout.RowConstraints;
        import javafx.stage.Stage;

import java.awt.*;
import java.util.*;

public class Main extends Application {

    public static final int WINDOW_WIDTH = 596;
    public static final int WINDOW_HIGHT = 596;
    public static final int X_CELLS = 4;
    public static final int Y_CELLS = 4;
   ArrayList<String> array = new ArrayList<>();

    public Button[][] buttons = new Button[X_CELLS][Y_CELLS];

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane root = new GridPane();
        Scene scene = new Scene(root, WINDOW_WIDTH, WINDOW_HIGHT);



        array.add( 0,"Принести на пару кофе");
        array.add( 1,"Поднять руку и отказаться выходить к доске");
        array.add( 2,"Покачаться на слуле");
        array.add( 3,"Опоздать на пару");
        array.add(4, "Несмешно пошутить");
        array.add( 5,"Сказать очевидную вещь");
        array.add( 6,"Смешно пошутить");
        array.add( 7,"Задать тупой вопрос препу");
        array.add(8, "Позалипать в телефон");
        array.add( 9,"Выйти к доске");
        array.add( 10,"Доебать Данилу Хайдукова");
        array.add( 11,"Задать тупой вопрос соседу");
        array.add( 12,"Поспорить с одногруппником");
        array.add( 13,"Выйти из кабинета во время пары");
        array.add( 14,"Ответить на вопрос, заданный препу");
        array.add( 15,"Поспорить препом");
        Collections.shuffle(array);

        for (int x = 0; x < X_CELLS; x++)
            for (int y = 0; y < Y_CELLS; y++) {
                Button button = new Button();
                Label label = new Label(array.get(4*(x)+(y+1) - 1));
                button.setStyle("-fx-border-color: black");
                button.setMaxWidth(Double.MAX_VALUE);
                button.setMaxHeight(Double.MAX_VALUE);
                root.getColumnConstraints().add(new ColumnConstraints(152));
                root.getRowConstraints().add(new RowConstraints(152));

                root.add(new Button(), x, y);
                buttons[x][y] = button;



            }

        for (int x = 0; x < X_CELLS; x++)
            for (int y = 0; y < Y_CELLS; y++) {
                Button button = buttons[x][y];
                button.setText(array.get(4*(x)+(y+1) - 1));
                //System.out.println(array.get(t));
                //System.out.println(t);

                button.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        button.setStyle("-fx-background-color: firebrick; -fx-border-color: black");
                    }
                });
            }


        primaryStage.setScene(scene);
        primaryStage.setTitle("BINGO");
        primaryStage.setResizable(false);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}