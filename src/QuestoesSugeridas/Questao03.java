package QuestoesSugeridas;

public class Questao03 {
    public static void main(String[] args) {
        int count = 0;
        int numero = 31;
        double media = 0;
        while(count < 30) {
            if (numero%13 == 5){
                count++;
                System.out.println("o valor "+count+" é "+numero);
                if(count == 19 || count == 26) {
                    media += numero;
                    System.out.println();
                }
            }
            numero++;

        }
        media = media/2;
        System.out.println("A média aritimética é " + media);
    }
}
