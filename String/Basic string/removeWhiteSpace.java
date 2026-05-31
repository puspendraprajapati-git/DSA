public class removeWhiteSpace {
    public static void main(String[] args){
        String s="hello     world";

        String result=s.replaceAll("\\s+","");
        System.out.println(result);
    }
}
