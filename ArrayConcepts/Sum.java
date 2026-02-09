package ArrayConcepts;

public class Sum {
    public static void main(String[] args) {
        int a[] = { 3,6,9,12,15,};
        int sum = 0;
        for (int i = 0; i< a.length; i++){
            sum = sum + a[i];
        }
            System.out.println("sum of the values:" + sum);
        
    }
    
}
