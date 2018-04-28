/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer2;

import javax.swing.JOptionPane;

/**
 *
 * @author saulr
 */
public class Ejer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int d;
       d=Integer.parseInt( JOptionPane.showInputDialog("ingrese cantida de nuumeros a evaluar"));
        int n[]=new int[d];
        int tem;
        for (int i = 0; i <n.length; i++) {
            n[i]=Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero "+(i+1)));
        }
        for (int i = 0; i <n.length-1; i++) {
            
            for (int j = 0; j <n.length-1; j++) {
                if(n[j+1]<n[j]){
                tem=n[j+1];
                n[j+1]=n[j];
                n[j]=tem;
                }
            }
        }
        
        for (int i = 0; i <n.length; i++) {
            JOptionPane.showMessageDialog(null, "valor"+i+" numero"+n[i]);
        }
    }
    
}
