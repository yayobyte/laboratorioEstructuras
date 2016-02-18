/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1;

/**
 *
 * @author Yayo
 */
public class VerifyNumber {
    private int number;
    
    public VerifyNumber (int number) {
        this.number = number;
    }

    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }
    
    public boolean isEven (){
        return ((this.number % 2) == 0);
    }
    
    public String sendMessage (){
        return (this.isEven() ? "El numero es par" : "El numero es impar");
    }
    
}
