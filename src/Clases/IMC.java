/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author LAB1_PC34
 */
public class IMC {
    private double _altura;
    private double _peso;
    private double _imc;
    
    public IMC(double altura, double peso){
        this._altura = altura;
        this._peso = peso;
    }
    
    public double calcular(){
        this._imc = (this._peso / Math.pow(this._altura, 2));
        return this._imc;
    }
    
    public String clasificacion(){
        if(Double.isNaN(this._imc)){
            return "Invoque a la funcion \"calcular\" antes de pedir clasificación";
        }
        if(this._imc < 18){
            return "Peso Bajo";
        }else if(this._imc >= 18 && this._imc < 25){
            return "Normal";
        }else if(this._imc >= 25 && this._imc < 27){
            return "Sobrepeso";
        }else if(this._imc >= 27 && this._imc < 30){
            return "Obesidad Grado I";
        }
        else if(this._imc >= 30 && this._imc < 40){
            return "Obesidad Grado II";
        }else{
            return "Obesidad Grado III";
        }        
    }
    
}
