package working_with_abstraction.exercise.jediGalaxy;

public class Jedi {

    private int row;
    private int col;

    public Jedi(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int move(Field field){
        int starsCollected = 0;
        while (row >= 0 && col < field.getColLength()) {
            if (field.isInBounds(row, col)) {
                starsCollected += field.getValue(row, col);
            }

            col++;
            row--;
        }

        return starsCollected;
    }
}
