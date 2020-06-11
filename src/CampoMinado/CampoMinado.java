package CampoMinado;

public class CampoMinado {

    public static void main(String[] args) {
        Tabuleiro board = new Tabuleiro();
        Jogar(board);
        int[] jogada = new int[2];
    }


    public static void Jogar(Tabuleiro board){
        int rodada = 0;
        boolean ganhou = false;
        boolean terminar = false;
        do{
            rodada++;
            System.out.println("Rodada "+rodada);
            board.exibe();
            terminar = board.setPosicao();

            if(!terminar){
                board.abrirVizinhas();
                terminar = board.ganhou();
            }

        }while(!terminar);

        if(!board.ganhou()){
            System.out.println("Havia uma mina ! Você perdeu!");
            board.exibeMinas();
        } else {
            System.out.println("Parabéns, você deixou os 8 campos de minas livres em "+rodada+" rodadas");
            board.exibeMinas();
        }
    }
}
