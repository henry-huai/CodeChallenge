
public class AlmostPalindrome {
    public static void main(String[] args) {

        System.out.println(almostPalindrome("abcdcbg"));
        System.out.println(almostPalindrome("abccia"));
        System.out.println(almostPalindrome("abcdaaa"));
    }

    static boolean almostPalindrome(String str){
        int l = str.length();
        int count = 0;

        if(l%2 == 1){
            int middle = l/2 + 1;
            for(int i = 0; i < (middle -1); i ++){
                if(str.charAt(i) != str.charAt(l-i-1)){
                    count ++;
                }
            }
        }else{
            int middle = l/2;
            for(int i = 0; i < middle; i ++) {
                if (str.charAt(i) != str.charAt(l-i-1)) {
                    count++;
                }
            }
        }

        if(count == 1){
            return true;
        }
        else{
            return false;
        }
    }
}
