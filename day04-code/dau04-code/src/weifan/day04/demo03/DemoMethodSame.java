package weifan.day04.demo03;

public class DemoMethodSame {
    public static void main(String[] args) {
        System.out.println(isSame(2,5));
    }

    public static boolean isSame(int a,int b){
        if( a==b ){
            return true;
        }
        else return false;
    }
}
