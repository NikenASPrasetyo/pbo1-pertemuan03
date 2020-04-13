package operator;

public class OperatorEquality {
    public static void main(String[] args) {
        int i = 4;
        int j = 6;
        System.out.println(i==4);   //true
        System.out.println(i==6);   //false
        System.out.println(i==j);   //false
        System.out.println(i>j);    //false
        System.out.println(i<j);    //true
        System.out.println(4>6);    //false
        System.out.println(4<6);    //true
        System.out.println(i!=4);   //false
        System.out.println(j!=7);   //true
    }

}
