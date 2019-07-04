package ua.itea;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ps.sony.Pro;

/**
 * @author Kalchenko Serhii
 *
 */
public class App extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage stage) {
        Pro p = new Pro();
        System.out.println(p.getHeroName());
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/ua/itea/MyScene.fxml"));
		Parent root;
		try {
			root = loader.load();
            MyController controller = loader.getController();            
            
			stage.setTitle("HomeWork4BySergeyK");
			stage.setScene(new Scene(root));
	        stage.show();
	        
	        controller.setLblDota(p.getHeroName());
	        
	        InputStream in = this.getClass().getClassLoader().getResourceAsStream("text/textImg1.txt");
	        BufferedReader input = new BufferedReader(new InputStreamReader(in));
	        String line;
	        StringBuilder result = new StringBuilder();
	        while ((line = input.readLine()) != null) {
	        	 	result.append(line);
	        }
	        controller.setTxtAreaImg1(result.toString());

	        File f2 = new File("textImg2.txt");
	        if (f2.exists()) {
		        String res2 = new String(Files.readAllBytes(f2.toPath()));
		        controller.setTxtAreaImg2(res2);
	        }
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
