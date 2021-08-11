package machado_q05_netbeans;

public class Point implements Visitable {
    
    private double[] point;
    
    public Point(double x, double y){
        this.point = new double[2];
        this.point[0] = x;
        this.point[1] = y;
    }
    
    public double[] getPoint(){
        return this.point;
    }
    
    @Override
    public String toString(){
        return "{x:" + String.valueOf(this.point[0]) + ", y: " + String.valueOf(this.point[1]) + "}"; 
    }

    @Override
    public Object draw(Visitor visitor) {
        return visitor.draw(this); 
    }
    
}
