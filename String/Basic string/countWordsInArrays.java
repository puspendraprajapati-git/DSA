public class countWordsInArrays {
    public static void main(String[] args){
        String s="Hello World java";
        
        String[] words= s.split("\\s+");
        System.out.println(words.length);
    }
}
