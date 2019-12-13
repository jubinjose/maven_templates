package net.jubin.template;
public class SimpleMath {

    private int myVal;

    public static void main(String[] args) {
        System.out.println("Simple Hello");
    }

    public int getMyVal(){
        return myVal;
    }

    public void setMyVal(int value){
        myVal = value;
    }

    public void square(){
        myVal = (int)Math.pow(myVal, 2);
    }

    public void triple(){
        myVal = (int)Math.pow(myVal, 3);
    }

}