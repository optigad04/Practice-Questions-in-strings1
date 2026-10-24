import java.util.Scanner;

public class Main{
    public int countSubstring(String str, String sub){
        int counter = 0;
        int index = 0;

        while (index >= 0){
            index = str.indexOf(sub, index);
            if (index >= 0){
                counter++;
                index += sub.length();
            }
        }
        return counter;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Main obj = new Main();

        System.out.print("Enter the main String: ");
        String str = sc.nextLine();

        System.out.print("Enter the substring: ");
        String sub = sc.nextLine();

        int result = obj.countSubstring(str, sub);

        System.out.println("The substring |" + sub + "| appears " + result + "time(s)");

        sc.close();
    }
}