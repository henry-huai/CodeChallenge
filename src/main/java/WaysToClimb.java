public class WaysToClimb {
    public static void main(String[] args) {
        System.out.println(waysToClimb(1));
        System.out.println(waysToClimb(2));
        System.out.println(waysToClimb(5));

    }

    static int waysToClimb(int n){
        if(n == 0)
            return 1;
        else if(n == 1)
            return 1;
        else{
            return waysToClimb(n - 1) + waysToClimb(n - 2);
        }

    }
}
