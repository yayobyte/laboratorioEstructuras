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
    public static final String[] mathOps = { "Suma", "Resta", "Multiplicacion", "Division" };
    
    public static void main(String[] args) {
        // TODO code application logic here
        int age,number,purchaseValue,firstNumber,secondNumber;
        String option,name,lastName,mathematicalOperation;
        JoinTheArmy army;
        VerifyNumber evenNumber;
        Purchase buy;
        MathOps math;
        JFrame frame = new JFrame("Input Dialog Example 3");
        //option = Integer.parseInt(JOptionPane.showInputDialog(null,"Seleccione la opción deseada","Digite el primer numero",JOptionPane.INFORMATION_MESSAGE));
        option = (String) JOptionPane.showInputDialog(frame, 
            "¿Qué opción quiere ejecutar?",
            "Seleccione",
            JOptionPane.QUESTION_MESSAGE, 
            null, 
            options, 
            options[0]);
        while (option!= "Salir"){
            switch (option){
                case "Ingreso Ejercito" : 
                    name = JOptionPane.showInputDialog(null,null,"Digite su nombre");
                    age = Integer.parseInt(JOptionPane.showInputDialog(null,null,"Digite su edad"));
                    army = new JoinTheArmy (age,name);
                    JOptionPane.showMessageDialog(null, army.validateEntrance());
                    break;
                case  "Verificar Par o Impar" :
                    number = Integer.parseInt(JOptionPane.showInputDialog(null,null,"ingrese el numero"));
                    evenNumber = new VerifyNumber (number);
                    JOptionPane.showMessageDialog(null, evenNumber.sendMessage());
                    break;
                case "Compra" :
                    name = JOptionPane.showInputDialog(null,null,"Digite su nombre");
                    lastName = JOptionPane.showInputDialog(null,null,"Digite su apellido");
                    purchaseValue = Integer.parseInt(JOptionPane.showInputDialog(null,null,"Valor de la compra"));
                    buy = new Purchase (name, lastName, purchaseValue);
                    JOptionPane.showMessageDialog(null, buy.showMessage());
                    break;
                case "Operacion Matematica":
                    firstNumber = Integer.parseInt(JOptionPane.showInputDialog(null,null,"ingrese el primer numero"));
                    secondNumber = Integer.parseInt(JOptionPane.showInputDialog(null,null,"ingrese el segundo numero"));
                    mathematicalOperation = (String) JOptionPane.showInputDialog(frame, 
                        "¿Qué operacion quiere ejecutar?",
                        "Seleccione",
                        JOptionPane.QUESTION_MESSAGE, 
                        null, 
                        mathOps, 
                        mathOps[0]);
                    math = new MathOps(firstNumber, secondNumber, mathematicalOperation);
                    math.operation();
                    JOptionPane.showMessageDialog(null, math.getMessage());
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