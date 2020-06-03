package QuestoesSugeridas;

public class Questao04 {
    public static void main(String[] args) {
        int ano = 1970;
        int dias = 0;

        while(ano <= 2019) {
            if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
                dias += 365;
                System.out.println(ano + " é bissexto");
            } else {
                dias += 366;
                System.out.println(ano + " não é bissexto");
            }
            ano++;
        }
        System.out.println("Neste intervalo passaram-se "+dias+" dias.");
    }
}
