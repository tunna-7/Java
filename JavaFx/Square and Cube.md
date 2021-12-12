### Code:

        import javafx.geometry.Insets;
        import javafx.geometry.Pos;
        import javafx.scene.Scene;
        import javafx.scene.control.Button;
        import javafx.scene.control.TextField;
        import javafx.scene.layout.BorderPane;
        import javafx.scene.layout.HBox;
        import javafx.scene.text.Text;
        import javafx.stage.Stage;
        public class Sqube extends Application {
         public void start(Stage primaryStage) {
         Text tNumber1 = new Text("Enter Number");
         Text tResult = new Text("Result:");
         TextField tfNumber1 = new TextField();
         TextField tfResult = new TextField();
         tfResult.setEditable(false);
         Button btCube = new Button("Cube");
         Button btSquare = new Button("Square");
         HBox calcTop = new HBox(5);
         calcTop.setAlignment(Pos.CENTER);
         calcTop.setPadding(new Insets(5));
         calcTop.getChildren().addAll(tNumber1, tfNumber1, tResult,
        tfResult);
         HBox calcBottom = new HBox(5);
         calcBottom.setAlignment(Pos.CENTER);
         calcBottom.setPadding(new Insets(5));
         calcBottom.getChildren().addAll(btCube, btSquare);
         BorderPane pane = new BorderPane();
         pane.setCenter(calcTop);
         pane.setBottom(calcBottom);
         
         
         btCube.setOnAction(e -> {
         double a = getDoubleFromTextField(tfNumber1);
         tfResult.setText(String.valueOf(a*a*a));
         });
         
         btSquare.setOnAction(e -> {
         double a = getDoubleFromTextField(tfNumber1);
         tfResult.setText(String.valueOf(a*a));
         });
        
        
         Scene scene = new Scene(pane);
         primaryStage.setTitle("Squares & Cubes");
         primaryStage.setScene(scene);
         primaryStage.setResizable(false);
         primaryStage.show();
         }
         private static double getDoubleFromTextField(TextField t) {
         return Double.parseDouble(t.getText());
         }
         public static void main(String[] args) {
         launch(args);
         }
        }
        
### Output:
![image](https://user-images.githubusercontent.com/66274690/145723411-f7779da2-7fb6-4aed-87d3-a1564eac98b9.png)

        
        
