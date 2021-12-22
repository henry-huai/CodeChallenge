public class IsHappyNumber {
    public static void main(String[] args){
        System.out.println(isHappy(203));
        System.out.println(isHappy(11));
        System.out.println(isHappy(107));
    }

    public static boolean isHappy(int n){
        if(n == 1){
            return true;
        }
        if(n == 4){
            return false;
        }
        String s = String.valueOf(n);
        char[] digits = s.toCharArray();
        int m = 0;
        for(int i = 0; i < digits.length; i ++){
            m += (digits[i]-'0')*(digits[i]-'0');
        }
        return isHappy(m);
    }
}
