public class Variables {
    int a=100;//non-static variable or instance variable
    static int b=200;//static variable or class level var
    public static void main(String[] args) {
        int c=300;//local variable
       // System.out.println(a);//CompileTime Error
        System.out.println(b);
        System.out.println(c);
    }
    
}
