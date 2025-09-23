public class Main {
    public static void main(String[] args) {
        Fighter player1 = new Fighter();
        Fighter player2 = new Fighter("Riley", 100, 30);
        Battle battle1 = new Battle(player1, player2);
        battle1.printRoundUpdate();
        battle1.swapFighters();
        battle1.takeTurn();

        battle1.printRoundUpdate();
        battle1.swapFighters();
        battle1.takeTurn();

        battle1.printRoundUpdate();
        battle1.swapFighters();
        battle1.takeTurn();
    }
}
