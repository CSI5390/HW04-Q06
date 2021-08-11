package machado_q05_netbeans;

public class Machado_Q05_Netbeans {

    public static void main(String[] args) {
        
        DrawVisitor d = new DrawVisitor();
        
        // points for line 1
        Point l1p1 = new Point(2.4, 3.6);
        Point l1p2 = new Point(4.5, 6.7);
        
        // points for line 2
        Point l2p1 = new Point(94.3, 290.9);
        Point l2p2 = new Point(34.3, 39.2);
        
        // line 1
        Line l1 = new Line(l1p1, l1p2);
        
        // line 2
        Line l2 = new Line(l2p1, l2p2);
        
        // picture
        Line[] lines = new Line[2];
        lines[0] = l1;
        lines[1] = l2;
        Picture p = new Picture(lines);
        
        // print points for line 1
        System.out.println("Points for line 1:");
        l1p1.draw(d);
        l1p2.draw(d);
        System.out.println();
        
        // print line 1
        System.out.println("Line 1:");
        l1.draw(d);
        System.out.println();

        // print points for line 2
        System.out.println("Points for line 2:");
        l2p1.draw(d);
        l2p2.draw(d);
        System.out.println();
        
        // print line 1
        System.out.println("Line 2:");
        l2.draw(d);
        System.out.println();
        
        // print picture
        System.out.println("Picture: ");
        p.draw(d);
        
    }
    
}
