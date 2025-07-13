/*
 * 1
 * 23
 * 456
 * 78910
 * 11121314
 */
public class _04_Floyds_triangle {
    public static void main(String[] args){
        int n = 5, num = 1;
        // int num =1 ;
        for (int i = 1; i <= n; i++) {
            // Print numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}