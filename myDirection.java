public class myDirection {
    enum Direction {
        nord, sud, ouest, est;
    }

    public static void main(String[] args) {
        Direction direction = Direction.nord;
        switch (direction) {
            case nord:
                System.out.println("You are heading north");
                break;
            case est:
                System.out.println("You are heading est");
                break;
            case sud:
                System.out.println("You are heading Sud");
                break;
            case ouest:
                System.out.println("You are heading ouest");
                break;
        }
    }
}
