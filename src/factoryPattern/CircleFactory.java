package factoryPattern;

import java.awt.*;

public class CircleFactory extends shapeFactory {

    @Override
    public shapeInterface createShape() {
        return new Circle();
    }
}