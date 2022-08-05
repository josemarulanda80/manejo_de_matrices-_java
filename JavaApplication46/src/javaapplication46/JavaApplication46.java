/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication46;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author josem
 */
public class JavaApplication46 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada= new Scanner(System.in);
        int matriz[][],nCol,nFilas;
        nFilas=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de filas"));
        nCol=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de columnas"));
        
        matriz=new int[nFilas][nCol];
        JOptionPane.showMessageDialog(null,"Ingrese los datos de la matriz");
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nCol; j++) {
                matriz[i][j]= entrada.nextInt();
            }
        }
        System.out.println("\n la matrix es");
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nCol; j++) {
                System.out.print(matriz[i][j]);
                
            }
            System.out.println("");
            
        }
       
    }
    
}
