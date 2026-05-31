public class FrequencyOfChar {
    public static void main(String[] args){
        String s="success";

        for(int i=0;i<s.length();i++){
            int count=0;
            char ch=s.charAt(i);
            for(int j=0;j<s.length();j++){
                if(ch==s.charAt(j)){
                    count++;
                }
            }

            boolean alreadyVisited= false;

            for(int k=0;k<i;k++){
                if(ch==s.charAt(k)){
                    alreadyVisited=true;
                    break;
                }
            }

            if(!alreadyVisited){
                System.out.println(ch+":"+ count);
            }


        }


    }
}
