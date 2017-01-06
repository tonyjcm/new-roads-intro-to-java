public class Card{
  
  String rank; 
  
  String color;
  
 
 String suit;
  
  public Card(){
    
    rank = "A";
    color = "black";
    suit = "club";
    
  }
  
  public String toString(){
    
    
    return rank + " " + color + " " + suit;
    
    
  }
  
  
}