package project5;

import javax.swing.JOptionPane;

public class ta05_11 {
	public static void main(String args[]){
		
		
		String diaSetmana = JOptionPane.showInputDialog("dia de la setmana: ");
		
	    switch(diaSetmana){    
	    case "dilluns":    
	    	JOptionPane.showMessageDialog(null, "laboral");
	    	break;
	    case "dimarts": 
	    	JOptionPane.showMessageDialog(null, "laboral");
	    	break;
	    case "dimecres":
	    	JOptionPane.showMessageDialog(null, "laboral");
	    	break;
	    case "dijous":
	    	JOptionPane.showMessageDialog(null, "laboral");
	    	break;
	    case "divendres":
	    	JOptionPane.showMessageDialog(null, "laboral");
	    	break;
	    case "dissabte":
	    	JOptionPane.showMessageDialog(null, "festiu");
	    	break;
	    case "diumenge":
	    	JOptionPane.showMessageDialog(null, "festiu");
	    	break;    	        
	    default:  
	    	JOptionPane.showMessageDialog(null, "No està correctament escrit");	      
	    }    
	    
	}
}
