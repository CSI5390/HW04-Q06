package machado_q05_netbeans;

public class Line implements Visitable {
    
    private Point[] line;
    
    public Line(Point start, Point stop){
        this.line = new Point[2];
        this.line[0] = start;
        this.line[1] = stop;
    }

    public Point[] getLine(){
        return line;
    }
    
    @Override
    public Object draw(Visitor visitor) {
        return visitor.draw(this);
    }    
    
}
