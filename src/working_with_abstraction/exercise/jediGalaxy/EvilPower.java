package working_with_abstraction.exercise.jediGalaxy;

public class EvilPower {
    private int row;
    private int col;

    public EvilPower(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public void move(Field field) {
        while (row >= 0 && col >= 0) {
            if (field.isInBounds(row, col)) {
                field.setValue(row, col, 0);
            }

            row--;
            col--;
        }
    }
}
