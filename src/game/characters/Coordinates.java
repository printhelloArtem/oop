package game.characters;

public class Coordinates {
    private int x;
    private int y;

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double calculateDistance(Coordinates other) {  //метод расчета дист , реализован в классе координаты
        int xDiff = this.x - other.getX();
        int yDiff = this.y - other.getY();
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }
}