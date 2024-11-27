import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите адрес почты");
        String s = sc.nextLine();
        if(s.matches("\\w+@\\w+[.]\\w+")){
            System.out.println("Допустимый адрес почты");
        }else{
            System.out.println("Недопустимый адрес почты");
        }
        System.out.println("Введите пароль, он должен содержать хотя бы одну прописную букву, хотя бы одну заглавную букву, \nдолжен бать длинной не менее 8 символов, и не должен содержать спец символов кроме _");
        String p = sc.nextLine();
        if(p.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])[A-Za-z0-9_]{8,}$")){
            System.out.println("Допустимый пароль");
        }else{
            System.out.println("Недопустимый пароль");
        }
    }
}