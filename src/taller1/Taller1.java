/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1;
import javax.swing.*;

/**
 *
 * @author salak402
 */
public class Taller1 {

    /**
     * @param args the command line arguments
     */
    public static final String[] options = { "Ingreso Ejercito", "Verificar Par o Impar", "Compra", "Operacion Matematica", "Salir" };
    
    public static void main(String[] args) {
        // TODO code application logic here
        int age;
        String option;
        JFrame frame = new JFrame("Input Dialog Example 3");
        //option = Integer.parseInt(JOptionPane.showInputDialog(null,"Seleccione la opción deseada","Digite el primer numero",JOptionPane.INFORMATION_MESSAGE));
        option = (String) JOptionPane.showInputDialog(frame, 
            "¿Qué opción quiere ejecutar?",
            "Seleccione",
            JOptionPane.QUESTION_MESSAGE, 
            null, 
            options, 
            options[0]);
        String name;
        while (option!= "Salir"){
            switch (option){
                case "Ingreso Ejercito" : 
                    name = JOptionPane.showInputDialog(null,null,"Digite su nombre");
                    age = Integer.parseInt(JOptionPane.showInputDialog(null,null,"Digite su edad"));
                    IngresoEjercito ejercito = new IngresoEjercito (age,name);
                    JOptionPane.showMessageDialog(null, ejercito.validateEntrance());
                    break;
                case  "Verificar Par o Impar" :
                    Integer.parseInt(JOptionPane.showInputDialog(null,null,"Numero par o inpar"));
                    break;
                case "Compra" :
                    Integer.parseInt(JOptionPane.showInputDialog(null,null,"Puede comprar"));
                    break;
                case "Operacion Matematica":
                    Integer.parseInt(JOptionPane.showInputDialog(null,null,"Operacion matematica"));
                    break;
            }
            option = (String) JOptionPane.showInputDialog(frame, 
                "¿Qué opción quiere ejecutar?",
                "Seleccione",
                JOptionPane.QUESTION_MESSAGE, 
                null, 
                options, 
                options[0]);
            
        }
        JOptionPane.showMessageDialog(frame, "Gracias por usar nuestros servicios");
        Runtime.getRuntime().exit(0);
        
       
    }
    
}