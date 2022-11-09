public class listtraining {
    public static void main(String[] args) {

        Equipe marseille = new Equipe("Olympique de Marseille ", "Drogba", 27);
        System.out.println("je supporte " + marseille.club + " Mon joueur preferé est " + marseille.favorite_player
                + ". Il a marqué " + marseille.numberOfGoal + " Buts ");

    }
}

class Equipe {
    String club;
    String favorite_player;
    int numberOfGoal;

    Equipe(String club, String favorite_player,
            int numberOfGoal) {
        this.club = club;
        this.favorite_player = favorite_player;
        this.numberOfGoal = numberOfGoal;

    }

}
