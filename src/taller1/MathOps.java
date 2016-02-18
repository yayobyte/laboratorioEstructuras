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
public class MathOps {
    private int firstNumber,secondNumber;
    private String mathematicalOperation, message;
    
    public MathOps (int firstNumber, int secondNumber , String mathematicalOperation){
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.mathematicalOperation = mathematicalOperation;
        this.message = "";
    }

    /**
     * @return the firstNumber
     */
    public int getFirstNumber() {
        return firstNumber;
    }

    /**
     * @param firstNumber the firstNumber to set
     */
    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    /**
     * @return the secondNumber
     */
    public int getSecondNumber() {
        return secondNumber;
    }

    /**
     * @param secondNumber the secondNumber to set
     */
    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }
    
    /**
     * @return the mathematicalOperation
     */
    public String getMathematicalOperation() {
        return mathematicalOperation;
    }

    /**
     * @param mathematicalOperation the mathematicalOperation to set
     */
    public void setMathematicalOperation(String mathematicalOperation) {
        this.mathematicalOperation = mathematicalOperation;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }
    
    public void operation(){
        float result;
        switch (this.getMathematicalOperation()){
            case "Suma" :
                result = this.firstNumber + this.secondNumber;
                this.setMessage("La suma da: " + result);
                break;
            case "Resta":
                result = this.firstNumber - this.secondNumber;
                this.setMessage("La resta da: " + result);
                break;
            case "Multiplicacion":
                result = this.firstNumber * this.secondNumber;
                this.setMessage("La multiplicacion da: " + result);
                break;
            case "Division":
                if (this.secondNumber!=0){
                    result = this.firstNumber / this.secondNumber;
                    this.setMessage("La division da: " + result);
                }else{
                    this.setMessage("No se puede dividir por cero");
                }
                break;
            default :
                this.setMessage("Hubo un error");
        }
    }
}
