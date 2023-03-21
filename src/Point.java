public class Point {
    private int x;
    private int y;
    private String label;

    public Point(String label, int x, int y){
        this.x = x;
        this.y = y;
        this.label = label;
    }

    public String toString(){
        return "Point " + label + " is at x = " + x + ", y = " + y;
    }

    public boolean equals(Object p){
        if(!(p instanceof Point)){
            return false;
        }
        Point newP = (Point) p;
        return (this.x == newP.x) && (this.y == newP.y);
    }

}
