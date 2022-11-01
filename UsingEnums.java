import java.util.Scanner;
/** 
 * ACS-1904 Assignment X Question Y
 * @author 
*/

public class UsingEnums{
    
    private CatNames catName;
    private EnhancedDay day;
    
    public UsingEnums(){
        catName = CatNames.AJAX;
        day = EnhancedDay.MONDAY;
    }
    
    public boolean getDay(){
        return day.isWeekend();
    }
    
    
    
}
