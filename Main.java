import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Kā Tevi sauc?");
        String user_name = scan.nextLine();

        System.out.println("Labdien, " + user_name);

        System.out.println("Vai vēlies programmēt un iegūt labu pieredzi IT jomā?");

        String ansver = scan.nextLine();

        if(ansver.contains("Jā")) {
            System.out.println("Pievienojies Riga Coding School");

        } if(ansver.contains("Nezinu")) {

            System.out.println("Vai vēlies pieteikties uz konsultāciju?");

            String ansver_sec = scan.nextLine();

            if(ansver_sec.contains("Jā")) {
                System.out.println("Mēs sazināsimies ar Tevi!");

            }
            else {
                System.out.println("Tā ir lieliska iespēja uzzīnāt visu info sīkāk!");
            }
        }
    }
}