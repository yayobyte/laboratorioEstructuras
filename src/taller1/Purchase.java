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
public class Purchase {
    private String name;
    private String lastName;
    private int purchase;
    
    public Purchase (String name, String lastName, int purchase){
        this.name = name;
        this.lastName = lastName;
        this.purchase = purchase;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the purchase
     */
    public int getPurchase() {
        return purchase;
    }

    /**
     * @param purchase the purchase to set
     */
    public void setPurchase(int purchase) {
        this.purchase = purchase;
    }
    
    private int calculateDiscount (){
        if (this.purchase>200000){
            return (int) (this.purchase * 0.3);
        }else{
            return (int) (this.purchase * 0.05);
        }
    }
    
    private int calculateValueAfterDiscount (){
        return this.purchase - calculateDiscount();
    }
    
    public String showMessage (){
        return "Señor " + this.name + " " + this.lastName + 
                "\nEl valor de la compra es: " + this.purchase +
                "\nCon el descuento: " + this.calculateDiscount() +
                "\nLe queda en: "+ this.calculateValueAfterDiscount();
    }
}
