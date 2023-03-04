/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import Project.Card;

/**
 *
 * @author Admin
 */
public class UnoCard extends Card{
    
private Color color;
     private Value value;
    
    public UnoCard(Color color, Value value){
        this.color = color;
        this.value = value;
    }
    
    enum Color{
        Red, Blue, Green, Yellow, Wild;
        
        private static final Color[] colors = Color.values();
        public static Color getColor(int i){
            return Color.colors[i];
        }
    }
    enum Value{
        Zero, One, Two, Three, Four, Five, Six, Seven, Eight, Nine, DrawTwo, Skip, Reverse, Wild, Wild_Four;
        
        private static final Value[] values = Value.values();
        public static Value getValue(int i){
            return Value.values[i];
        }
    }
    
    public Color getColor(){
        return this.color;
    }
    
    public Value getValue(){
        return this.value;
    }
    
    public String toString(){
        return "color of card is: " + this.color +" value of card is: " + this.value;
    }

}
