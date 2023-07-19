import java.util.*;
class oops {
    int real;
        int img;
    public oops(int r,int i){
        real =r;
        img=i;
        }    public static oops product(oops a, oops b){
            return new oops(((a.real*b.real)-(a.img*b.img)),((a.real*b.img)+(a.img*b.real)));
        }
public void printcomplex(){
    System.out.println(real+" "+img+"i");
}
}
class solution{
    public static void main(String args[]){
        oops c =new oops(4,5);
        oops d =new oops(9,5);
        oops e = oops.product(c,d);
        e.printcomplex();
    }
}