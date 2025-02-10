public class While {
    public static void main(String args[]){
        //int i=10;
       /*  while(i>=1)
        {
            i--;
            System.out.println(i);
        }*/
        /*int i=1;
        while(i<=10){
            i++;
            System.out.println(i);
        }*/
        //to print the 1 to 10 even numbers using while loop
       /*  int i=2;
        while(i<10){
            System.out.println(i);
            i=i+2;
        }*/
        int i=1;
        while(i<=100){
            if(i%3==0 && i%5==0){
                System.out.println(i);
            }
            i++;
        }

    }
    
}
