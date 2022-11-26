package working_with_abstraction.exercise.jediGalaxy;

public class Field {
    private final long[][] starsField;

    public Field(int rows, int cols) {
        this.starsField = new long[rows][cols];
        fillIn(rows, cols);
    }

    public void fillIn(int rows, int cols) {
        int value = 0;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                starsField[row][col] = value++;
            }
        }
    }

    public boolean isInBounds(int row, int col) {
        return row >= 0 && col >= 0 && row < starsField.length && col < starsField[0].length;
    }

    public long getValue(int row, int col) {
        return this.starsField[row][col];
    }

    public void setValue(int row, int col, int newValue) {
        starsField[row][col] = newValue;
    }

    public int getColLength(){
        return starsField[0].length;
    }
}
