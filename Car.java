/* **************
 * Enumerated class: Cars
 * 
 * Author:  your name
 * 
 */
public enum Car{
    CAYANNE("Cayanne", 90000, 200), MACAN("Macan", 60000, 190), 
    PANAMERA("Panamera", 100000, 200), BOXSTER("Boxster", 80000, 210);
    
    private String friendlyName;
    private double cost;
    private int topSpeed;
    
    // constructor
    private Car(String n, double c, int ts){
        friendlyName = n;
        cost = c;
        topSpeed = ts;
    }// end constructor
    
    // ** getters **
    public double getCost(){
        return cost;
    }// end get cost
    
    public int getTopSpeed(){
        return topSpeed;
    }// end get speed
    
    public String getFriendlyName(){
        return friendlyName;
    }// end get name
    
    // ** toString **
    @Override
    public String toString(){
        String st = this.friendlyName + ": " + " Price: " + cost + " Topspeed: " + topSpeed;
        return st;
    }// end toString
    
}// end cars