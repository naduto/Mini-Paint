package BackEnd;

import java.awt.*;

public class Triangle extends shapes {

    private int[] xPoints;
    private int[] yPoints;

    public Triangle(int[] xPoints, int[] yPoints) {
        super();
        this.xPoints = xPoints;
        this.yPoints = yPoints;
    }
    @Override
    public String tostring()
    {
        String ret="2-"+this.getshapename()+"-"+this.getColor()+"-"+this.getFillColor()+"-"+this.xPoints[0]+"-"+this.xPoints[1]+"-"+this.xPoints[2]+"-"+this.yPoints[0]+"-"+this.yPoints[1]+"-"+this.yPoints[2];
        return ret;
    }
    @Override
    public void move(int newx, int newy) {
        int xmove = (newx - this.xPoints[0]);
        int ymove = (newy - this.yPoints[0]);

        this.xPoints[0] = newx;
        this.yPoints[0] = newy;

        this.xPoints[1] += xmove;
        this.yPoints[1] += ymove;

        this.xPoints[2] += xmove;
        this.yPoints[2] += ymove;
    }

    @Override
    public void draw(Graphics canvas) {
        Graphics2D g2d = (Graphics2D) canvas;

        g2d.setColor(this.getColor());
        g2d.drawPolygon(this.xPoints, this.yPoints, 3);

        g2d.setColor(this.getFillColor());
        g2d.fillPolygon(xPoints, yPoints, 3);

    }

    public void resize(double scalefactor) {
        int cx = (this.xPoints[0] + this.xPoints[1] + this.xPoints[2]) / 3;
        int cy = (this.yPoints[0] + this.yPoints[1] + this.yPoints[2]) / 3;
        this.xPoints[0] = (int) (cx + (this.xPoints[0] - cx) * scalefactor);
        this.yPoints[0] = (int) (cy + (this.yPoints[0] - cy) * scalefactor);
        this.xPoints[1] = (int) (cx + (this.xPoints[1] - cx) * scalefactor);
        this.yPoints[1] = (int) (cy + (this.yPoints[1] - cy) * scalefactor);
        this.xPoints[2] = (int) (cx + (this.xPoints[2] - cx) * scalefactor);
        this.yPoints[2] = (int) (cy + (this.yPoints[2] - cy) * scalefactor);
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
