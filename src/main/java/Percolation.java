/******************************************************************************
 *  Name:    Kevin Wayne
 *  Dependencies: StdIn.java StdRandom.java WeightedQuickUnionUF.java
 *  Description:  Modeling Percolation.
 ******************************************************************************/

import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Percolation {

    /**
     * Constructor for a percolation
     * The 2D n x n array of sites is represented with n^2 + 2 objects,
     * which includes two special virtual sites for TOP and BOTTOM.
     * @param n the length of each side of the square grid of sites
     */
    public Percolation(int n) {
        // TODO: create n-by-n grid, with all sites blocked
    }

    /**
     * Opens the site at the indicated row and col.
     * The files use 1-indexing so adjustments are made to find the
     * corresponding object number for the union-find.
     * @param row the row number (1-indexing) for the site to open
     * @param col the col number (1-indexing) for the site to open
     */
    public void open(int row, int col) {
        // TODO: open site (row, col) if it is not open already
    }

    public boolean isOpen(int row, int col) {
        // TODO: is site (row, col) open?
        return false;
    }

    public boolean isFull(int row, int col) {
        // TODO: is site (row, col) full?
        return false;
    }

    public int numberOfOpenSites() {
        // TODO: number of open sites
        return 0;
    }

    public boolean percolates() {
        // TODO: does the system percolate?
        return false;
    }

    public static void main(String[] args) {
        // TODO: test client (optional)
    }
}
