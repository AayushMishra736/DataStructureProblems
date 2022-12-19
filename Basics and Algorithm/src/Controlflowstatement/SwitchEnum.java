package Controlflowstatement;

public class SwitchEnum {
	public enum Day {SUN,MON,TUE,WED,THU,FRI,SAT}
	public static void main(String[] args) {
	
    Day[] DayNow = Day.values();
    
    for(Day Now:DayNow) {
    switch(Now) {
    case SUN:
    	System.out.println("Sunday");
    break;
    case MON:
       System.out.println("Monday");
    break;
    case TUE:
       System.out.println("Tuesday");
    break;
    case WED:
       System.out.println("Wednesday");
    break;
    case THU:
       System.out.println("Thursday");
    break;
    case FRI:
       System.out.println("Friday");
    break;
    case SAT:
        System.out.println("Saturday");
    default:
    	System.out.println("Select valid day");
    
    }
        } 
	}

}
