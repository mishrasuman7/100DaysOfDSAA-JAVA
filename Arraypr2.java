//to find given number is present or not in that array
public class Arraypr2 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int num = 33;
        boolean IsInArray = false;
        for(int i: nums){
            if (num == i){
                IsInArray = true;
                break;
            }}
        if(IsInArray){
            System.out.println("The number is present in the Array!");
        }
        else{
            System.out.println("The number is not present in the Array!");
        }
    }
}