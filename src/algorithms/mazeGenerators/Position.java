package algorithms.mazeGenerators;

public class Position {
    int rowidx;
    int colidx;
    int val;

    public Position(int rowidx, int colidx) {
        this.rowidx = rowidx;
        this.colidx = colidx;
        this.val = 1;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public int getRowIndex() {
        return rowidx;
    }

    public int getColumnIndex() {
        return colidx;
    }

    @Override
    public String toString(){
        return String.format("{%d,%d}",rowidx,colidx);
    }
}
