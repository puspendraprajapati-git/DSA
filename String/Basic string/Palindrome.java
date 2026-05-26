public class Palindrome {

    public static boolean palindromeCheck(String str){

        String reversed="";

        for(int i=str.length()-1;i>=0;i--){
            reversed= reversed +str.charAt(i);
        }

        if(str.equals(reversed)){
            return true;
        }
        else{
            return false;
        }
    }


    public static void main(String[] args){
        String str="A man, a plan, a canal: Panama";

        if(palindromeCheck(str)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }


       

    }
}
