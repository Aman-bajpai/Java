package Recursion;

public class Stream {
    public static void main(String[] args) {
        SkipApple("baccadh");

    }
    static void Skip(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        if(ch == 'a'){
            Skip(p,up.substring(1));
        }else{
            Skip(p + ch,up.substring(1));
        }
    }

    static String SkipApple(String up){
        if (up.isEmpty()){
            return "";
        }

        if(up.startsWith("apple")){
            return SkipApple(up.substring(1));
        }else{
            return SkipApple(up.substring(1));
        }
    }
}
