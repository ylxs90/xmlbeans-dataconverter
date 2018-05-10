public class ChessPanel {
    public static char leftBorder = '├';
    public static char topBorder = '┬';
    public static char rightBorder = '┤';
    public static char bottomBorder = '┴';
    public static char leftTop = '⌜';
    public static char rightTop = '⌝';
    public static char leftBottom = '⌞';
    public static char rightBotton = '⌟';
    public static char normal = '┼';
    public static int size = 9;
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        for( int x =0; x < size; x++) {
            for(int y = 0; y < size; y++) {
                sb.append(draw(x,y));
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
    public static char draw(int x, int y) {
        if(x == 0) {
            if( y == 0) {
                return leftTop;
            } 
            if(y == size - 1) {
                return rightTop;
            }
            return topBorder;
        }
        if( x == size -1) {
            if( y == 0 ) {
                return leftBottom;
            }
            if( y == size -1 ) {
                return rightBotton;
            }
            return bottomBorder;
        }
        return normal;
    }
}
