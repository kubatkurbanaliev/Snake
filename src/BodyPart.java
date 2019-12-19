import java.awt.*;

public class BodyPart {

    private int xCoor, yCoor, width, height;

    public BodyPart(int xCoor, int yCoor, int tileSize){
        this.xCoor = xCoor;
        this.yCoor = yCoor;
        width = tileSize;
        height = tileSize;
    }

    public void tick(){

    }

    public void draw(Graphics graphics){
        graphics.setColor(Color.YELLOW);
        graphics.fillRect(xCoor * width, yCoor * height, width, height);
    }

    public int getxCoor() {
        return xCoor;
    }

    public int getyCoor() {
        return yCoor;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
