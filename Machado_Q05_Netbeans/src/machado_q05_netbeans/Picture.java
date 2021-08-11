package machado_q05_netbeans;

public class Picture implements Visitable {
    
    private Line[] picture;
    
    public Picture(Line[] lines){
        this.picture = new Line[lines.length];
        System.arraycopy(lines, 0, picture, 0, lines.length);
    }

    public Line[] getPicture(){
        return this.picture;
    }
    
    @Override
    public Object draw(Visitor visitor) {
        return visitor.draw(this);
    }
}
