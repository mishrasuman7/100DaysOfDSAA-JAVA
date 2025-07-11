import java.util.Scanner;

public class _02_ifelif {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        if(age < 13){
            System.out.println("You are a child!");
        }
        else if (age < 20){
            System.out.println("You are a teenager!");
        }
        else if (age < 55){
            System.out.println("You are an Adult!");
        }
        else{
            System.out.println("You are a Senior Citizen!");
        }
    }
}