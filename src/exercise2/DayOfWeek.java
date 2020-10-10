package exercise2 ;
import java.util.Scanner;
public class DayOfWeek {
  public static void main (String[]args) {
  Scanner input = new Scanner(System.in);
  int DayN = input.nextInt();
  // Day of week:
  if(DayNumber == 1) {
    System.out.println("Day of week: Montag");
  }
  else if (DayNumber == 2) {
    System.out.println("Day of week: Dienstag");
  }
  else if (DayNumber == 3) {
    System.out.println("Day of week: Mittwoch");
  }
  else if (DayNumber == 4) {
    System.out.println("Day of week: Donnerstag");
  }
  else if (DayNumber == 5) {
    System.out.println("Day of week: Freitag");
  }
  else if (DayNumber == 6) {
    System.out.println("Day of week: Samstag");
  }
  else if (DayNumber == 7) {
    System.out.println("Day of week: Sonntag");
  }
  else {
    System.out.println("Day of week: kein Chance");
  }
  }
}