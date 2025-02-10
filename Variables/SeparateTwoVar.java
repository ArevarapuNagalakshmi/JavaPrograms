public class SeparateTwoVar {
    int a=100;
    int b=200;
    static int c=300;
    public static void main(String[] args) {
        SeparateTwoVar t1=new SeparateTwoVar();
        SeparateTwoVar t2=new SeparateTwoVar();
        System.out.println(t1.a+t2.b+c);
        t2.a=11;
        System.out.println(t1.a+t2.b);
        System.out.println(t2.a+t2.b);
    }
    
}
