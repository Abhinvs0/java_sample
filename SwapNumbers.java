import java.util.Scanner;
public class SwapNumbers {

    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("first:");
        float first=a.nextFloat();
        System.out.println("second:");
        float second=a.nextFloat();
        System.out.println("--Before swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
        float temporary = first;
        first = second;
        second = temporary;
        System.out.println("--After swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
    }
}
