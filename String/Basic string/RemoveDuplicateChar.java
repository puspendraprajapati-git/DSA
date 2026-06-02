public class RemoveDuplicateChar {
    public static void main(String[] args){

        String str="success";
        StringBuilder s=new StringBuilder(str);

        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    s.deleteCharAt(j);
                    j--;
                }
            }
        }
        String result= s.toString();
        System.out.println(result);


    }
}
