package machado_q05_netbeans;

public class DrawVisitor implements Visitor {
    
    public DrawVisitor() { /* does nothing}*/ }

    @Override
    public Object draw(Point point) {
        System.out.println("point drawn: " + point.toString());
        return point;
    }

    @Override
    public Object draw(Line line) {
        System.out.println("start: " + line.getLine()[0].toString() + "\n" + "stop: " + line.getLine()[1].toString());
        return line;
    }

    @Override
    public Object draw(Picture picture) {
        String ret = "";
        Line[] p = picture.getPicture();
        for (int i = 0; i<p.length; i++){
            ret += "Line " + String.valueOf(i) + ":{start:" + p[i].getLine()[0].toString() + ", stop:" + p[i].getLine()[1].toString() + "}\n";                    
        }
        System.out.println(ret);
        return picture;
    }
    
    
    
}
