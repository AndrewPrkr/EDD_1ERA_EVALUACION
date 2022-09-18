/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_19_mcd;

/**
 *
 * @author saeol
 */
public class EVA1_19_MCD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Dividendo/divisor -> residuo
        //Si residuo = 0 divisor es el MCD
        //Si no divisor/residuo
        System.out.println(mcd(180, 48));
    }
    
    public static int mcd(int dividendo, int divisor){
        int residuo = dividendo%divisor;
        if(residuo == 0){
            return divisor;
        }else{
            return mcd(divisor,residuo);
        }
    }
}