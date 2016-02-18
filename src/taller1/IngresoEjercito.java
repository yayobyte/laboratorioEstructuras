/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1;

/**
 *
 * @author salak402
 */
public class IngresoEjercito {
    private int age;
    private String name;
    
    public IngresoEjercito (int age, String name){
        this.age = age;
        this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
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
    
    public String validateEntrance () {
        return (this.age >= 18 ? "Bienvenido al ejercito señor(a): " + this.name : "No puede ingresar al ejercito");
    }
}