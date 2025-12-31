import java.util.*;
        import java.util.stream.*;
public class RemoveCharacter {


    public static String removeCharacter(String str, char ch){
        if(str == null || str.isEmpty()){
            return str;
        }

        String result = str.chars()
                .filter(c -> c != ch)
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
        return result;

    }
    public static void main(String[] args) {
        System.out.println("Hello World");
        String str = "java interview";
        char ch = 'a';
        String result = removeCharacter(str,ch);
        System.out.println("Original string:"+ str);
        System.out.println("String after removing "+ch+ " : "+result);

    }
}