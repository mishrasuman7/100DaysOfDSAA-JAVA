public class Arraypr6 {
    public static void main(String[] args) {
        int[] arr={44,55,-466,777,888888};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i:arr)
            if (i>max)
                max = i;
        System.out.print("The Maximum number in the Array is "+max + " ");
        for (int i:arr)
            if (i<min)
                min = i;
        System.out.println("and Minimum number is "+min);
    }
}