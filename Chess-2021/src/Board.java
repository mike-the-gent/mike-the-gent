public class Board {

    private char column;
    private int row;

    public void board (char column, int row) {
        this.column = column;
        this.row = row;
    }

    public char getColumn() {
        return column;
    }

    public void setColumn(char column) {
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public boolean onBoard () {

        if (this.row < 0 || this.row > 8 || this.column != 'A' && this.column != 'B' && this.column != 'C' && this.column != 'D' && this.column != 'E' && this.column != 'F' && this.column != 'G' && this.column != 'H') {
            System.out.println("incorrect input");
            return false;
        } else {
            System.out.println(column + "" + row);
        } return true;
    }
}
