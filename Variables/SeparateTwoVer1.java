public class SeparateTwoVer1 {
    int a;
    static int b;
    public static void main(String[] args) {
        int c=300;
        SeparateTwoVer1 t1=new SeparateTwoVer1();
        System.out.println(t1.a+t1.b+c);
        SeparateTwoVer1 t2=new SeparateTwoVer1();
        t2.a=101;
        SeparateTwoVer1.b=11;
        System.out.println(t1.a+t2.a+t1.b);
        b=14;
        System.out.println(t1.b+t2.b+b+SeparateTwoVer1.b);
    }
    
}
