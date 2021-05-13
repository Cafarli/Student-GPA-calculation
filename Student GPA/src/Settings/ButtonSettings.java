package Settings;

import javax.swing.*;


public class ButtonSettings {
    
    public static void BoxSelectedItem(JComboBox boxname,JTextField gradefield){
       if(boxname.getSelectedItem().equals("A+")){
        gradefield.setText("4.3(A+)");
    } 
       if(boxname.getSelectedItem().equals("A")){
        gradefield.setText("4.0(A)");
    } 
       if(boxname.getSelectedItem().equals("A-")){
        gradefield.setText("3.7(A-)");
    } 
       if(boxname.getSelectedItem().equals("B+")){
        gradefield.setText("3.3(B+)");
    } 
       if(boxname.getSelectedItem().equals("B")){
        gradefield.setText("3.0(B)");
    } 
       if(boxname.getSelectedItem().equals("B-")){
        gradefield.setText("2.7(B-)");
    } 
       if(boxname.getSelectedItem().equals("C+")){
        gradefield.setText("2.3(C+)");
    } 
       if(boxname.getSelectedItem().equals("C")){
        gradefield.setText("2.0(C)");
    } 
       if(boxname.getSelectedItem().equals("C-")){
        gradefield.setText("1.7(C-)");
    } 
       if(boxname.getSelectedItem().equals("D+")){
        gradefield.setText("1.3(D+)");
    } 
       if(boxname.getSelectedItem().equals("D")){
        gradefield.setText("1.0(D)");
    } 
       if(boxname.getSelectedItem().equals("D-")){
        gradefield.setText("0.7(D-)");
    } 
       if(boxname.getSelectedItem().equals("F")){
        gradefield.setText("0.0(F)");
    } 
    }
    
    public static void ResetAllButton(JComboBox box,JTextField field){
        field.setText("");
        box.setSelectedItem("A+");
    }
    
    
}
