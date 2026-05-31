public class FindFrequencyOfVowelsAndConsonant {

    public static void main(String[] args){
        // int count=0;
        int maxVowel=0;
        int maxConsonant=0;
        String vowel= "aeiou";
        String s= "success";

        for(int i=0;i<s.length();i++){
            int count=0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                }
            }
            if(vowel.contains(String.valueOf(s.charAt(i)))){
                maxVowel= Math.max(maxVowel, count);
            }
            else{
                maxConsonant=Math.max(maxConsonant,count);
            }
        }
        
        System.out.println(maxVowel+maxConsonant);
    }
}