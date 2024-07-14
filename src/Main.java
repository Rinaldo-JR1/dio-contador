import java.lang.invoke.WrongMethodTypeException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);

        }catch (WrongMethodTypeException exception) {
            System.out.println(exception.getMessage());
        }

    }
    static void contar(int parametroUm, int parametroDois ) throws WrongMethodTypeException {
        if(parametroUm > parametroDois) {
            throw new WrongMethodTypeException("O segundo parâmetro deve ser maior que o primeiro");
        }
        int contagem = parametroDois - parametroUm;

        for (int i = 0; i <= contagem; i++) {
            System.out.println(parametroUm + i);
        }
    }
}