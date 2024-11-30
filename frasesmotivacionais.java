import java.util.Random;
import java.util.Scanner;

public class frasesmotivacionais {
    public static void main(String[] args) {

        String[] frases = {
            "Você consegue!",
            "Acredite no seu potencial!",
            "Os erros te tornam mais forte!",
            "Se compare com você do passado, não com os outros.",
            "Impossível é uma palavra que serve só de enfeite no dicionário.",
            "Não acredite em tudo o que vê. Todo mundo está travando uma batalha interna. Não é fácil para ninguém.",
            "Não tenho medo de aceitar que você não é mais o mesmo.",
        };

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int lastIdx = 99999;

        System.out.println("Bem vindo ao Gerador de Frases Motivacionais");

        String perguntar = "s";
        while (perguntar.equalsIgnoreCase("s") || perguntar.equalsIgnoreCase("sim")) {

            int choosedIdx = random.nextInt(frases.length);
            if (choosedIdx == lastIdx && choosedIdx < frases.length) {
                choosedIdx += 1;
            } else {
                choosedIdx -= 1;
            }

            System.out.println(frases[choosedIdx]);

            System.out.println("Deseja ver outra frase? (s/n)");
            perguntar = scanner.nextLine();
            lastIdx = choosedIdx;
        }

        System.out.println("Obrigado por usar o Gerador de Frases Motivacionais");
        scanner.close();
    }
}