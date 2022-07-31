import java.util.Scanner;

public class function {
    public static void main(String []args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("What is your name?");
    String name = scanner.nextLine(); //입력받은 문자열을 리턴해 주는 명령어
    System.out.println("How old are you?");
    int age = scanner.nextInt();

    System.out.println("Hello"+name);
    System.out.println("you are"+age+"years old");
    }
}
