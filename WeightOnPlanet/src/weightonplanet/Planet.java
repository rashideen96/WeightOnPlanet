/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weightonplanet;

/**
 *
 * @author USER
 */
public class Planet {

    private String name;
    private double weight;
    private double diameter;
    
    public String getName(){
        return name;
    }
    
    public void setName(String n){
        name = n;
    }
    
    public double getWeight(){
        return weight;
    }
    
    public void setWeight(double w){
        weight = w;
    }
    
    public double getDiameter(){
        return diameter;
    }
    
    public void setDiameter(double d){
        diameter = d;
    }
    
    
}
