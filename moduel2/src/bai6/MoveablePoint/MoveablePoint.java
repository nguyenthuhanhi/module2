package bai6.MoveablePoint;

public class MoveablePoint extends Point{
    private float xSpeed=0.0f;
    private float ySpeed=0.0f;

    public MoveablePoint() {
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public float[] getSpeed(){
        float arr[]={this.xSpeed,this.ySpeed};
        return arr;
    }

    public void move(){
        setX(getX()+xSpeed);
        setY(getY()+ySpeed);
    }

    @Override
    public String toString() {
        return super.toString()+" XSpeed:"+xSpeed+"\t YSpeed:"+ySpeed;
    }

    public static void main(String[] args) {
        Point point= new Point(4.5f,3);
        MoveablePoint movalbePoint= new MoveablePoint(3,4,8,9);
        System.out.println("point: "+ point);
        System.out.println("movalbePoint: "+movalbePoint);
        movalbePoint.move();
        System.out.println("Sau khi move:");
        System.out.println("point sau move:"+ point);
        System.out.println("MovalbePoint sau move: "+movalbePoint);
    }
}
