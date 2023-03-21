public class ThreeDPoint extends Point{
    private int z;
    public ThreeDPoint(String label, int x, int y,int z){
        super(label, x, y);
        this.z = z;
    }

    public String toString(){
        return super.toString() + ", z = " + z;
    }

    public boolean equals(Object p){
        if(!(p instanceof ThreeDPoint)){
            return false;
        }
        ThreeDPoint newP = (ThreeDPoint) p;
        return super.equals(p) && this.z == newP.z;
    }
}
