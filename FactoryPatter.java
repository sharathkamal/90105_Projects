//create interface
package factoryPattern;

public interface Shape {

	void draw();
}

//creating circle class
package factoryPattern;

public class Circle implements Shape{

	@Override
	public void draw() {
		System.out.println("Inside Circle::draw() method");
		
	}
}

//creating Rectangle class
package factoryPattern;

public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method");
		
	}
}

//create Square class
package factoryPattern;

public class Square implements Shape{

	@Override
	public void draw() {
		System.out.println("Inside Sqaure::draw() method");
		
	}
}

//create shapefactory class
package factoryPattern;

public class ShapeFactory {

	public Shape getShape(String shapeType) {
		if (shapeType==null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		}
		else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		}
		else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		return null;
	}
}

//create FactoryDemo class
package factoryPattern;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape shape1 = shapeFactory.getShape("CIRCLE");
		shape1.draw();
		
		Shape shape2= shapeFactory.getShape("RECTANGLE");
		shape2.draw();
		
		Shape shape3= shapeFactory.getShape("CIRCLE");
		shape3.draw();

	}
}