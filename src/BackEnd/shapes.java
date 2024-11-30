
package BackEnd;
import Interfaces.Shape;
import java.util.*;
import java.awt.*;
public abstract class shapes implements Shape{
    private Point position;
    private Color color;
    private Color fillcolor;
    private Map<String,Double>properties;
    private String shapename;
    public shapes()
    {
        this.position=new Point(100,100);
        this.color=Color.BLACK;
        this.fillcolor=Color.BLACK;
        this.properties=new HashMap<>();
    }
    public abstract void toshape(String []S);
    public abstract String tostring();
    public void setshapename(String s)
    {
        this.shapename=s;
    }
    public String getshapename()
    {
        return this.shapename;
    }
    public void addproperty(String s,Double k)
    {
        properties.put(s, k);
    }
    public double getproperty(String S)
    {
        return this.properties.getOrDefault(S, 0.0);
    }
    @Override
    public Point getposition()
    {
        return this.position;
    }

    @Override
    public void setPosition(Point Position) {
        this.position=Position;
    }
     
    @Override
    public void setProPerties(Map<String,Double>properties)
    {
        this.properties=properties;
    }
    @Override
    public abstract void move(int x,int y);
    @Override
    public Map<String,Double> getproperties(){
        return this.properties;
    }
    @Override
     public void setColor(Color color)
     {
         this.color=color;
     }
     
     @Override
     public Color getColor ()
     {
         return this.color;
     }
    
     @Override
    public void setFillColor(Color color){
        this.fillcolor=color;
    }
    
    @Override
    public Color getFillColor(){
        return this.fillcolor;
    }
     
     @Override
     public abstract void draw (Graphics canvas);
     
     
}

