import java.util.Scanner;
public class _01_UserInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Welcome," + name + "!");
    }
    
}
