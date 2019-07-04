package ua.itea;

import javafx.fxml.*;
import javafx.scene.control.*;

/**
 * @author Kalchenko Serhii
 */
public class MyController{

	@FXML
	private Label lbl1;
	
	@FXML
	private Label lblDota;
	
	@FXML
	private TextArea txtAreaImg1;

	@FXML
	private TextArea txtAreaImg2;
	
	/* Установить тест в lbl1
	 * @param text устанавливаемій текст
	 */
	public void setLblDota(String txtValue) {
		lblDota.setText(txtValue);
	}	

	public void setTxtAreaImg1(String txtValue) {
		txtAreaImg1.setText(txtValue);
	}

	public void setTxtAreaImg2(String txtValue) {
		txtAreaImg2.setText(txtValue);
	}
}
