package application;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DrawerController implements Initializable {
	@FXML
	private JFXButton menu;
	@FXML
	private JFXButton support;
	@FXML
	private JFXButton client;
	@FXML
	private JFXButton commercial;
	@FXML
	private JFXButton manager;
	@FXML
	private JFXButton analyste;
	@FXML
	void actmenu(ActionEvent event)
	{
		try{
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/application/Menu.fxml"));
			Parent root1=(Parent) fxmlLoader.load();
			Stage stage =new Stage();
			stage.setTitle("menu");
			stage.setScene(new Scene(root1));
			stage.show();
		}
		catch (Exception e){
			System.out.println("cant load new window");
			
			}
		
	}
	@FXML
	void actsupport(ActionEvent event)
	{
		try{
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/application/Support.fxml"));
			Parent root1=(Parent) fxmlLoader.load();
			Stage stage =new Stage();
			stage.setTitle("support");
			stage.setScene(new Scene(root1));
			stage.show();
		}
		catch (Exception e){
			System.out.println("cant load new window");
			
			}
		
	}
	@FXML
	void actclient(ActionEvent event)
	{
		try{
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/application/client.fxml"));
			Parent root1=(Parent) fxmlLoader.load();
			Stage stage =new Stage();
			stage.setTitle("client");
			stage.setScene(new Scene(root1));
			stage.show();
		}
		catch (Exception e){
			System.out.println("cant load new window");
			
			}
		
	}
	@FXML
	void actcommerciaux(ActionEvent event)
	{
		try{
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/application/FXMLCommercial.fxml"));
			Parent root1=(Parent) fxmlLoader.load();
			Stage stage =new Stage();
			stage.setTitle("commerciaux");
			stage.setScene(new Scene(root1));
			stage.show();
		}
		catch (Exception e){
			System.out.println("cant load new window");
			
			}
		
	}
	@FXML
	void actmanager(ActionEvent event)
	{
		try{
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/application/FXMLManager.fxml"));
			Parent root1=(Parent) fxmlLoader.load();
			Stage stage =new Stage();
			stage.setTitle("manager");
			stage.setScene(new Scene(root1));
			stage.show();
		}
		catch (Exception e){
			System.out.println("cant load new window");
			
			}
		
	}
	@FXML
	void actanalyste(ActionEvent event)
	{
		try{
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/application/FXMLAnnalyste.fxml"));
			Parent root1=(Parent) fxmlLoader.load();
			Stage stage =new Stage();
			stage.setTitle("analyste");
			stage.setScene(new Scene(root1));
			stage.show();
		}
		catch (Exception e){
			System.out.println("cant load new window");
			
			}
		
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
	
}
