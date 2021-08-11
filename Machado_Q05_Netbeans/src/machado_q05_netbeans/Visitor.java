package machado_q05_netbeans;

public interface Visitor {
    
    public Object draw(Point point);
    public Object draw(Line line);
    public Object draw(Picture picture);
    
}