import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception{
        Scanner tb = new Scanner(System.in);
        System.out.println("Vad första tal vara?");
        int tal1 = tb.nextInt();
        System.out.println("Andra tal vad vara?");
        int tal2 = tb.nextInt();
            tb.nextLine();
        System.out.print("Droppa decimaltal ");
        double tal3 = tb.nextDouble();
            tb.nextLine();
        System.out.print("Droppa en till ");
        double tal4 = tb.nextDouble();
            tb.nextLine();
        int produkt = tal1*tal2;
        System.out.println(tal1+"*"+tal2+"="+produkt);
        double kvot = tal3/tal4;
        System.out.println(tal3+"/"+tal4+"="+kvot);
        int modulo = tal1%tal2;
        System.out.println(tal1+"%"+tal2+"="+modulo);
    }
}
