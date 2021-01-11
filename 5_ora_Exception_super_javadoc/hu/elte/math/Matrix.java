package hu.elte.math;

public class Matrix {

    private final int[][] elements;
    private final int height;
    private final int width;

    public Matrix(int height, int width) {
      if(height < 1 || width <1){
        throw new IllegalArgumentException("Nem lehet 1 -nél kisebb sem a magasság sem a szélesség. Megadott szélesség: " + width + " Megadott magasság: " + height);
      }
      this.elements = new int[height][width];
      this.width = width;
      this.height = height;
    }

    public void add(Matrix other) {
        if(height != other.getHeight() || width != other.getWidth()){
        throw new IllegalArgumentException("Nem ugyanaz a sor és az oszlop értéke a 2 mátrixnál");
        }
        for(int i =0; i<elements.length; ++i){
          for(int j =0; j<elements[i].length; ++j){
            elements[i][j] += other.getElement(i,j);
          }
        }
    }

    public int getElement(int row, int column) {
        return elements[row][column];
    }

    public void setElement(int element, int row, int column) {
        elements[row][column] = element;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                sb.append(elements[i][j]);
                if (j < width - 1) {
                    sb.append(' ');
                }
            }
            if (i < height - 1) {
                sb.append(" | ");
            }
        }
        return sb.toString();
    }

}