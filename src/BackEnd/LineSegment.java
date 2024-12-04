package BackEnd;

import java.awt.*;

public class LineSegment extends shapes {

    private Point endpoint;
    private double angle;

    public LineSegment(Point st, Point end, double angle1) {
        super();
        this.setPosition(st);

        this.angle = angle1;

        this.endpoint = end;

    }

    public void setEndPoint(Point end) {
        this.endpoint = end;
    }

    public Point getEndPoint() {
        return this.endpoint;
    }

    @Override
    public void draw(Graphics canvas) {
        Graphics g2d = (Graphics) canvas;

        g2d.setColor(this.getColor());
        g2d.drawLine(this.getposition().x, this.getposition().y, this.getEndPoint().x, this.getEndPoint().y);
    }

    @Override
    public void move(int newx, int newy) {
        int dx = newx - this.getposition().x;
        int dy = newy - this.getposition().y;
        this.setPosition(new Point(newx, newy));
        this.setEndPoint(new Point(this.getEndPoint().x + dx, this.getEndPoint().y + dy));
    }
    @Override
    public String tostring() {
        String ret ="4-"+this.getshapename() + "-" + this.getColor() + "-" + this.getFillColor() + "-" + this.angle+"-"+this.getposition().x + "-" + this.getposition().y + "-" + this.getEndPoint().x + "-" + this.getEndPoint().y;
        return ret;
    }

    public void resize(double length) {
        int dx = (int) (length * Math.cos(this.angle));
        int dy = (int) (length * Math.sin(this.angle));
        int x2 = this.getposition().x + dx;
        int y2 = this.getposition().y + dy;
        this.endpoint = new Point(x2, y2);
    }

    @Override
    public void toshape(String[] S) {
        this.setshapename(S[1]);
        S[2]=S[2].replaceAll("[^0-9,]", "");
        S[3]=S[3].replaceAll("[^0-9,]", "");
        String[] rgb = S[2].split(",");
        int r = Integer.parseInt(rgb[0]);
        int g = Integer.parseInt(rgb[1]);
        int b = Integer.parseInt(rgb[2]);
        if (r >= 0 && r <= 255 && g >= 0 && g <= 255 && b >= 0 && b <= 255) {
            this.setColor(new Color(r, g, b));
        }
         rgb = S[3].split(",");
         r = Integer.parseInt(rgb[0]);
         g = Integer.parseInt(rgb[1]);
         b = Integer.parseInt(rgb[2]);
        if (r >= 0 && r <= 255 && g >= 0 && g <= 255 && b >= 0 && b <= 255) {
            this.setFillColor(new Color(r, g, b));
        }
          
    }
}
