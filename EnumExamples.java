import java.util.Scanner;
/** 
 * ACS-1904 Enum supplementary example
 * Sveinson 
*/
enum Exp{
        ONE, TWO, THREE

    }
    
enum Colour{
    RED("warm"), GREEN("envious"), BLUE("sad");
    
    private String feeling;
    
    private Colour(String f){
        feeling = f;
    }// end constructor
    
    public String getFeeling(){
        return feeling;
    }
    
}// end enum Colour

enum Element{
    H("H", "Hydrogen", 1, 1.008), HE("He", "Helium", 2, 4.0026), 
    LI("Li", "Lithium", 3, 6.94), BE("Be", "Beryllium", 4, 9.0122), B("B", "Boron", 5, 10.81), 
    C("C", "Carbon", 6, 12.011);
    
    private String symbol;
    private  String name;
    private  int atomicNumber;
    private double atomicWeight;
    
    /* Contructor 
     * note the constructor is private
     */
    private Element(String s, String n, int num, double w){
        symbol = s;
        name = n;
        atomicNumber = num;
        atomicWeight = w;
    }// end constructor
    
    /* *** getters *** */
    public String getName(){
        return name;
    }
    
    public int getAtomicNumber(){
        return atomicNumber;
    }
    
    public double getAtomicWeight(){
        return atomicWeight;
    }
    
    @Override
    public String toString(){
     String st;
     st = this. symbol + ", " + this.name + ", " + this.atomicNumber + ", " + this.atomicWeight + "\n";
     return st;
    }
    
}// end enum Element

public class EnumExamples{
    public enum Season{WINTER, SPRING, SUMMER, FALL};
    
    public static void main(String[] args) { 

        Scanner scanner = new Scanner(System.in);
        Colour c = null;
        
        // some errors
        //c = Colour.Purple;
        //c = "Purple";
        //c = Colour.BLEU;
        //c = Colour.BLUE;
        
        // get an array of Colour values
        Colour[] colours = Colour.values();
        System.out.println(colours.length);
        System.out.println(colours[0]);
        
        // travers the enum using .values()
        for(Colour cl : Colour.values())
            System.out.println(cl);
        
        System.out.println(c);
        c = Colour.RED;
        System.out.println("the colour " + c + " makes me feel " + c.getFeeling());
        c = Colour.GREEN;
        System.out.println("the colour " + c + " makes me feel " + c.getFeeling());
        c = Colour.BLUE;
        System.out.println("the colour " + c + " makes me feel " + c.getFeeling()); 
        
        /* *** using the more complex Element enum *** */
        Element e = Element.HE;         // helium
        System.out.println(e);
        
        Element[] elements = Element.values();
        System.out.println(elements.length);
        System.out.println(elements[2]);
        
        for(Element el : Element.values())
            System.out.print(el);
        
        System.out.println("end of program");
    }
}
