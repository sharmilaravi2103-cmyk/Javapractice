public class Secondlargest {
    public static void main(String[] args) {

        int[] a = {14,21,11,23,27,1};

        int max = a[0];

        
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }

        int secondMax = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] > secondMax && a[i] < max) {
                secondMax = a[i];
            }
        }

        System.out.println("Second Maximum: " + secondMax);
    }
}
