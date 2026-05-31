public class lengthOfString {
    public static void main(String[] args){
        String s="hello";
        int count=0;
        for(char ch: s.toCharArray()){
            count++;
        }
        System.out.println(count);
    }
    
}
