package Ex03;

public class Third {
    public static void main(String[] args) {
    int age = 25;
boolean isCitizen = false;

if (age >= 18) {
    System.out.println("You are old enough to vote.");
    if (isCitizen) {
        System.out.println("You are also a citizen. You can vote!");
    } else {
        System.out.println("However, you are not a citizen, so you cannot vote.");
    }
} else {
    System.out.println("You are not old enough to vote.");
}
}
}
