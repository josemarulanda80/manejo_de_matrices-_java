/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author josem
 */
public class Ejercicio4 {

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
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nFilas; j++) {
                if (i==j) {
                    matriz[i][j]=1;
                    
                }else{
                    matriz[i][j]=0;
                }
            }
            
        }
        
            System.out.println("\n la matrix identidad es:");
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nCol; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
            
        }
    }
    
}
