public class IsHeteromecic {
    public static void main(String[] args){
        System.out.println(isHeteromecic(0));
        System.out.println(isHeteromecic(2));
        System.out.println(isHeteromecic(7));
        System.out.println(isHeteromecic(110));
        System.out.println(isHeteromecic(136));
        System.out.println(isHeteromecic(156));
    }
    public static boolean isHeteromecic(int n){
        int root = (int)Math.sqrt(n);
        return root*(root+1) == n;
    }
}
