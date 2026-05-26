public class Palindrome2 {

    public static boolean isPalindromeCheck(String str){
        int left =0 ;
        int right= str.length()-1;

        while (left<right) {
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            
                left++;
                right--;
        }
            return true;

    }
    


    public static void main(String[] args){
        String str= "MadaM";

        if(isPalindromeCheck(str)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}
