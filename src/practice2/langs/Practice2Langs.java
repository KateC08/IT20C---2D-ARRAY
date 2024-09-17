/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice2.langs;

/**
 *
 * @author ITLAB1-PC25-STUDENT
 */
public class Practice2Langs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char[][] prac = {
            {'*','*','*','*','*'},
            {'*','*','*','*','*'},
            {'*','*','*','*','*'},
            {'*','*','*','*','*'},
            {'*','*','*','*','*'},
            {'*','*','*','*','*'},
                                                                                                                                                        
        };
        
        for(int i= 0; i <prac.length; i++) {
            
            for(int j=0; j< i; j++) {
                System.out.print(prac[i][j]);
            }
             System.out.println();
        }  
        
    }
    
}
