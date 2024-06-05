public class SolutionFour {
    public static void main(String[] args) {
        System.out.println(findWarnedPrisoner(5, 2, 1)); 
        System.out.println(findWarnedPrisoner(5, 2, 2)); 
    }

    public static int findWarnedPrisoner(int n, int m, int s) {
       
        int position = (s + m - 1) % n;
        if (position == 0) {
            return n; 
        } else {
            return position;
        }
    }
}