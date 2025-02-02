import com.lt.practice.abstration.service.CircleShapeService;
import com.lt.practice.abstration.service.SquareShapeService;

public class ShapeAbstraction {


    public static void main(String[] args) {

        CircleShapeService circleShapeService = new CircleShapeService();
        circleShapeService.draw();
        circleShapeService.display();

        SquareShapeService squareShapeService = new SquareShapeService();
        squareShapeService.draw();
        squareShapeService.display();


    }

}
