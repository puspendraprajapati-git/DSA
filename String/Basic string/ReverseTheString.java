public class ReverseTheString {
    public static void reverseTheString(char[] s){
        
        int left =0;
        int right= s.length-1;

        while(left < right){

            char temp= s[right];
            s[right]=s[left];
            s[left]= temp;

            left++;
            right--;

        }

    }

    public static void main(String[] args){

        char s[]="Hello".toCharArray();

        reverseTheString(s);

        System.out.println(s);


    }
}