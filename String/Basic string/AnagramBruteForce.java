public class AnagramBruteForce {
    public static void main(String[] args){
        String s1="silente";
        String s2="listenf";

        

        StringBuilder str=new StringBuilder(s2);

        if(s1.length()==s2.length()){

        for(int i=0;i<s1.length();i++){
            boolean found=false;
            for(int j=0;j<str.length();j++){
                if(s1.charAt(i)==str.charAt(j)){
                    str.deleteCharAt(j);
                    found=true;
                    break;
                }
            }
            if(!found){
                System.out.println("Not anagram");
            }
        }

    }
    else{
        System.out.println("Length is not equal");
        }

    }
}
