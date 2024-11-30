package BackEnd;

public class Square extends Rectangle {
    public Square(double length)
    {
        super(length,length);
    }
    public void setsideLength(double length)
    {
        this.setLength(length);
        this.setWidth(length);
    }
    public double getsideLength()
    {
        return this.getLength();
    }
    
}

