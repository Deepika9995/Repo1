public class FindAreaAndPerimeterImplementation extends  FIndAreaAndPerimeter{

    public void initial(){
        //Do nothing
    }

    double calculateSquareArea(double side){
        double squareArea = side * side;
        return squareArea;
    }

    double calculateSquarePerimeter(double side) {
        double squarePerimeter = 4 * side;
        return squarePerimeter;
    }

    double calculateRectangleArea(double length, double breadth){
        double rectangleArea = length * breadth;
        return rectangleArea;
    }

    double calculateRectanglePerimeter(double length, double breadth){
        double rectanglePerimeter = 2 * (length + breadth);
        return rectanglePerimeter;
    }

}
