package factoryPattern;

public class squareFactory extends shapeFactory{

    @Override
    public shapeInterface createShape()
    {
        return new Square();
    }
}
