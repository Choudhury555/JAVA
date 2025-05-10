package OOPS_BASIC;

public class Square {
    private int side;

    Square(int side){
        this.side=side;
    }

    public int calculateArea(){
        if(side < 0){
            return -1;
        }
        return side*side;
    }
    public int calculatePerimeter(){
        if(side < 0){
            return -1;
        }
        return 4*side;
    }
}
