package application;

import java.io.IOException;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.jfoenix.controls.JFXDrawer;
import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.transitions.hamburger.HamburgerBackArrowBasicTransition;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class ManagerController1 implements  Initializable {
	
	@FXML
    private JFXDrawer drawer;

    @FXML
    private JFXHamburger hamburger;
    
    @FXML
    private AnchorPane root;
    @FXML
    private Pane pane;

   public static AnchorPane root1;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        root1 = root;
        
        try {
            VBox box = FXMLLoader.load(getClass().getResource("/application/Drawer.fxml"));
            drawer.setSidePane(box);
        } catch (IOException ex) {
            Logger.getLogger(ManagerController1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        HamburgerBackArrowBasicTransition transition = new HamburgerBackArrowBasicTransition(hamburger);
        transition.setRate(-1);
        hamburger.addEventHandler(MouseEvent.MOUSE_PRESSED,(e)->{
            transition.setRate(transition.getRate()*-1);
            transition.play();
            
            if(drawer.isShown())
            {
                drawer.close();
            }else
                drawer.open();
        });
    }
    @FXML
    public TextField text1;
public void generateRandom1 (ActionEvent event){
	Random rand1= new Random();
	int myrand1 =rand1.nextInt(3) +1;
	text1.setText(Integer.toString(myrand1));
	}
@FXML
private TextField text2;
public void generateRandom2 (ActionEvent event){
	Random rand2= new Random();
	int myrand2 =rand2.nextInt(20) +1;
	text2.setText(Integer.toString(myrand2));}
@FXML
private TextField text3;
public void generateRandom3 (ActionEvent event){
	Random rand3= new Random();
	int myrand3 =rand3.nextInt(5) +1;
	text3.setText(Integer.toString(myrand3));}
//********méthode pour quitter********//
	public void exit (ActionEvent quit){
		System.exit(0);
	}
}




























































