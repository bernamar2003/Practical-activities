public class fifth {
    public static void main(String[] args){
        int day = 24;
String dayType;
switch (day) {
    case 1:
        dayType = "Monday";
        break;
    case 2:
        dayType = "Tuesday";
        break;
    case 3:
        dayType = "Wednesday";
        break;
    default:
        dayType = "Weekday";
        break;
}
System.out.println(dayType); // Output: Weekday
    }

}