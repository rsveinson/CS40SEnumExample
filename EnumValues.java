/**
 * Use values() to get the enum values
 */
public class EnumValues
{
    public static void main(String[] args){
        Day[] daysOfWeek = Day.values();
        Day day1 = Day.TUESDAY;
        // String s = "Mnday";
        // Day day = Day.valueOf(s);
        
        Day dee = Day.MONDAY;
        System.out.println(dee);
        CatNames c = CatNames.TOM;
        System.out.println(c);
        
        System.out.println("Days of the week:");
        
        // for (Day d: daysOfWeek)
            // System.out.println(d);
            
        for(Day d: Day.values())
            System.out.println("other " + d);
            
        // more examples using enums in classes
        UsingEnums ue = new UsingEnums();
        System.out.println(ue.getDay());
    }
}
