/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapp_imagetests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author Ed
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private ImageView simpleImageView;
    private Image oneImage;
    private Image twoImage;
    private FileInputStream inputStream;
    private FileInputStream inputStream1;
    private int toggle = 0;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
        if (toggle == 0) {
            toggle = 1;
            simpleImageView.setImage(twoImage);
        } else {
            toggle = 0;
            simpleImageView.setImage(oneImage);
        }
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            inputStream = new FileInputStream("E:\\_Ed's Sweet Media\\WGU Classes\\WGU C868 - Capstone\\Project\\Resources\\testImage.png");
            inputStream1 = new FileInputStream("E:\\_Ed's Sweet Media\\WGU Classes\\WGU C868 - Capstone\\Project\\Resources\\testImage2.png");
            oneImage = new Image(inputStream);
            twoImage = new Image(inputStream1);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
        simpleImageView.setImage(oneImage);
    }    
    
}
