import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Type you CEP: ");
        var cep = input.nextLine();

        CheckCep checkCep = new CheckCep();

        try {
            Address myAddress = checkCep.findAddress(cep);
            System.out.println(myAddress);

            FileMaker maker = new FileMaker();
            maker.makeJson(myAddress);
        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Quiting app");
        }

    }
}