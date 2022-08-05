/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author josem
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          // TODO code application logic here
      
        Scanner entrada= new Scanner(System.in);
        int matriz[][],matriz2[][],sum[][],nCol,nFilas;
        nFilas=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de filas"));
        nCol=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de columnas"));
        
     
        
        matriz=new int[nFilas][nCol];
        JOptionPane.showMessageDialog(null,"Ingrese los datos de la matriz1");
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nCol; j++) {
                matriz[i][j]= entrada.nextInt();
            }
        }
        matriz2=new int[nFilas][nCol];
        JOptionPane.showMessageDialog(null,"Ingrese los datos de la matriz2");
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nCol; j++) {
                matriz2[i][j]= entrada.nextInt();
            }
        }
          System.out.println("\n la matrix1 es");
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nCol; j++) {
                System.out.print(matriz[i][j]);
                
            }
            System.out.println("");
            
        }
          System.out.println("\n la matrix2 es");
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nCol; j++) {
                System.out.print(matriz2[i][j]);
                
            }
            System.out.println("");
            
        }
        sum=new int[nFilas][nCol];
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nFilas; j++) {
                sum[i][j]=matriz[i][j]+matriz2[i][j];
            }
            
        }
                  System.out.println("\n la suma es");
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nCol; j++) {
                System.out.print(sum[i][j]);
                
            }
            System.out.println("");
            
        }
    }
    
}
