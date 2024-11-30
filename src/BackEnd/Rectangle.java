package BackEnd;

import java.awt.*;
public class Rectangle extends shapes {
    public Rectangle(double length,double width)
    {
        super();
        this.addproperty("width", width);
        this.addproperty("length", length);
    }
    public void setLength(double length) {
        this.addproperty("length", length);
    }
    public double getLength() {
        return this.getproperty("length");
    }
    public void setWidth(double width) {
        this.addproperty("width", width);
    }
    public double getWidth() {
       return this.getproperty("width");
    }
    
    
    @Override
    public void draw(Graphics canvas) {
        Graphics2D g2d = (Graphics2D) canvas;
        int length = (int) getLength();
        int width = (int) getWidth();
        
        g2d.setColor(this.getFillColor());
        g2d.fillRect(this.getposition().x, this.getposition().y, width, length);
        
        g2d.setColor(this.getColor());
        g2d.drawRect(this.getposition().x, this.getposition().y, width, length);
    }
    @Override
    public void move(int newx,int newy)
    {
        this.setPosition(new Point(newx,newy));
    }
    @Override
    public String tostring()
    {
        String ret="3-"+this.getshapename()+"-"+this.getLength()+"-"+this.getWidth()+"-"+this.getColor()+"-"+this.getFillColor()+"-"+this.getposition().x+"-"+this.getposition().y;
        return ret;
    }
    public void resize(double newL,double newW) {
        this.setLength(newL);
        this.setWidth(newW);
    }

    @Override
    public void toshape(String[] S) {
        this.setshapename(S[1]);
        S[4]=S[4].replaceAll("[^0-9,]", "");
        S[5]=S[5].replaceAll("[^0-9,]", "");
        String[] rgb = S[4].split(",");
        int r = Integer.parseInt(rgb[0]);
        int g = Integer.parseInt(rgb[1]);
        int b = Integer.parseInt(rgb[2]);
        if (r >= 0 && r <= 255 && g >= 0 && g <= 255 && b >= 0 && b <= 255) {
            this.setColor(new Color(r, g, b));
        }
         rgb = S[5].split(",");
         r = Integer.parseInt(rgb[0]);
         g = Integer.parseInt(rgb[1]);
         b = Integer.parseInt(rgb[2]);
        if (r >= 0 && r <= 255 && g >= 0 && g <= 255 && b >= 0 && b <= 255) {
            this.setFillColor(new Color(r, g, b));
        }
        this.setPosition(new Point(Integer.parseInt(S[6]),Integer.parseInt(S[7])));
    }
    
}

