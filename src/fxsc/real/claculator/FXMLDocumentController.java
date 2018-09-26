/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxsc.real.claculator;

import java.io.IOException;
import static java.lang.Double.parseDouble;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

/**
 *
 * @author George
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    public Label label;
    public Button btn1;
    public Button btn2;
    public Button btn3;
    public Button btn4;
    public Button btn5;
    public Button btn6;
    public Button btn7;
    public Button btn8;
    public Button btn9;
    public Button btn0;
    public Button btnpoint;
    public Button btnadd;
    public Button btnminus;
    public Button btntimes;
    public Button btndevide;
    public TextField field;
    public Button btnOperations;
    
    @FXML
    public Double fno;
    public Double sno;
    public String number = "";
    public int operation;
    public Double ansure ;
    public String sighn = " ";
    public String cow = "";
  // Session["f1"] = fno;
    
    public void handleButtonOperationDetails(ActionEvent event) {
   try{
      // Parent root1 = FXMLLoader.load(getClass().getResource("FXML.fxml"));
      FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML.fxml"));
       Parent root1  = (Parent) loader.load();
       
       FXMLController cont = loader.getController();
       String value = "THE FIRST NUMBER:   "+ fno+ "\n"+"THE SECOND NUMBER IS:   "+sno + "\n THE OPERATION PERFOMED IS:   "+sighn+ "\n" + "THE ANSURE IS :   "+ansure;
       cont.myFunction(value);
       
    Stage stag = new Stage();
    
    stag.setTitle("NEW WINDOW.");
    stag.setScene(new Scene(root1));
    stag.show();
    ((Node)(event.getSource())).getScene().getWindow().hide();
   }
   catch( Exception ex){
       System.out.println(ex);
   }
  
  
    }
    public void handleButton1(ActionEvent event){
         String no = btn1.getText();
         number = number+no;
         label.setText(number);
         field.setText(number);
          label.setVisible(false); 
    }
    public void handleButton2(ActionEvent event){
         // String fno = 
          String no = btn2.getText();
            //label.setText(no);
             number = number+no;
         label.setText(number);
          field.setText(number);
          label.setVisible(false);
    }
    public void handleButton3(ActionEvent event){
          label.setVisible(false); 
          String no = btn3.getText();
            //label.setText(no);
              number = number+no;
         label.setText(number);
          field.setText(number);
    }
    public void handleButton4(ActionEvent event){
         label.setVisible(false); 
          String no = btn4.getText();
           // label.setText(no);
             number = number+no;
         label.setText(number);
          field.setText(number);
    }
    public void handleButton5(ActionEvent event){
         // String fno = 
          label.setVisible(false); 
          String no = btn5.getText();
           // label.setText(no);
             number = number+no;
         label.setText(number);
          field.setText(number);
    }
    public void handleButton6(ActionEvent event){
         // String fno =
          label.setVisible(false); 
          String no = btn6.getText();
            //label.setText(no);
              number = number+no;
         label.setText(number);
          field.setText(number);
    }
    public void handleButton7(ActionEvent event){
         label.setVisible(false);  
          String no = btn7.getText();
            //label.setText(no);
              number = number+no;
         label.setText(number);
          field.setText(number);
    }
    public void handleButton8(ActionEvent event){
          label.setVisible(false); 
          String no = btn8.getText();
            //label.setText(no);
              number = number+no;
               field.setText(number);
         label.setText(number);
    }
    public void handleButton9(ActionEvent event){
          label.setVisible(false);  
          String no = btn9.getText();
            //label.setText(no);
              number = number+no;
         label.setText(number);
          field.setText(number);
    }
    public void handleButton0(ActionEvent event){
          label.setVisible(false); 
          String no = btn0.getText();
            //label.setText(no);
              number = number+no;
         label.setText(number);
          field.setText(number);
    }
    public void handleButtonpoint(ActionEvent event){
         // String fno =
          label.setVisible(false); 
          String no = btnpoint.getText();
            //label.setText(no);
              number = number+no;
         label.setText(number);
          field.setText(number);
    }
     public void handleAdd(ActionEvent event){
         try{
          label.setVisible(false); 
         operation = 1;
         sighn = "+";      
         fno = parseDouble(number);  
        number = " ";
        cow = " +  _Addition_";
     System.out.println(fno);
         }
          catch(Exception e){
              System.out.println(e);
              field.setText(" SYNTAX ERROR");
              number = " ";
              fno = 0.0;
          }
    }
      public void handleMinus(ActionEvent event){
          try{
                sighn = "-"; 
           label.setVisible(false); 
          operation = 2;
      fno = parseDouble(number);  
      number = " ";
      cow = "- _Subtraction_";
     System.out.println(fno);
          }
          catch(Exception e){
              System.out.println(e);
               field.setText(" SYNTAX ERROR");
              number = " ";
              fno = 0.0;
          }
    }
       public void handleTimes(ActionEvent event){
           try{
            label.setVisible(false); 
              sighn = "*"; 
           operation = 3;
      fno = parseDouble(number);  
      number = " ";
      cow = "* _Multiplication_";
     System.out.println(fno);
           }
            catch(Exception e){
              System.out.println(e);
               field.setText(" SYNTAX ERROR");
              number = " ";
              fno = 0.0;
          }
    }
        public void handleDevide(ActionEvent event){
            try{
                  sighn = "/"; 
             label.setVisible(false); 
            operation = 4;
      fno = parseDouble(number);  
      number = " ";
      cow = "/ _Division_";
     System.out.println(fno);
            }
             catch(Exception e){
              System.out.println(e);
               field.setText(" SYNTAX ERROR");
              number = " ";
              fno = 0.0;
          }
    }
      public void handleEquals(ActionEvent event){
           label.setVisible(false); 
          sno = parseDouble(number);
          System.out.println(sno);
          switch(operation){
              case 1:
                  ansure = fno+sno;
                  field.clear();
                  field.setText(String.format("%.2f",ansure));
                  break;
                  
              case 2:
                  ansure = fno-sno;
                  field.clear();
                  //field.setText(""+ansure);
                  field.setText(String.format("%.2f",ansure));
                  break;
              case 3:
                  ansure = fno*sno;
                  field.clear();
                 // field.setText(""+ansure);
                  field.setText(String.format("%.2f",ansure));
                  break;
              case 4:
                  ansure = fno/sno;
                  field.clear();
                 // field.setText(""+ansure);
                  field.setText(String.format("%.2f",ansure));
                  break;
              default:
                  field.setText("UNKNOWN OPERATION");
          }
          
      }
       public void handleClear(ActionEvent event){
           field.clear();
           number = " ";
           fno = 0.0;
           sno = 0.0;
           
       }
        public void handleExit(ActionEvent event){
           System.exit(1);
       }
       
        public void handleOperaionDetails(){
            if(fno!= null && sno != null && sighn != null) {
           field.setText(" "+ fno  + sighn + sno + "="+ ansure);
            }
            else{
             field.setText("no operation.");
            }
        }
      public Double getFno(){
       return fno;
      } 
        public Double getSno(){
       return sno;
      } 
          public Double getAns(){
       return ansure;
      } 
         
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
