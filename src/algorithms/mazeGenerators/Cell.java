package algorithms.mazeGenerators;

public class Cell {
    int rowidx;
    int colidx;
    int val;

    public Cell(int rowidx, int colidx) {
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

    public int getRowidx() {
        return rowidx;
    }

    public int getColidx() {
        return colidx;
    }
}
