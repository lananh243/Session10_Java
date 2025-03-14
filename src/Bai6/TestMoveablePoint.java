package Bai6;

public class TestMoveablePoint {
    public static void main(String[] args) {
        Point point = new Point(1,3);
        System.out.print("Điểm trước khi di chuyển : ");
        System.out.println("x: " + point.getX() + ", y: " + point.getY());

        MoveablePoint moveablePoint = new MoveablePoint(1, 3, 4,5);
        System.out.println("Điểm sau khi di chuyển : "+moveablePoint);

        moveablePoint.move();
        System.out.println("Sau khi di chuyển : "+moveablePoint);

        moveablePoint.setX(3);
        moveablePoint.setY(4);
        moveablePoint.setxSpeed(5);
        moveablePoint.setySpeed(2);
        System.out.println("Sau khi cập nhật giá trị mới: " + moveablePoint);

        moveablePoint.move();
        System.out.println("Sau khi di chuyển lần hai: " + moveablePoint);
    }
}
