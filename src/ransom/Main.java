/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ransom;

/**
 *

 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        WordCheck wc = new WordCheck(6, 4, "give me one grand today night", "give one grand today");
        System.out.println(wc.result());
        WordCheck wc2 = new WordCheck(6, 5, "two times three is not four", "two times two is four");
        System.out.println(wc2.result());
    }
    
    
    
}
