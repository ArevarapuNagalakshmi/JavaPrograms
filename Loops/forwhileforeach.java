public class forwhileforeach {
    public static void main(String[] args) {
        String enames[];
        enames=new String[4];
        enames[0]="Hari";
        enames[1]="Rari";
        enames[2]="Mahi";
        enames[3]="Mani";
       /*  for(int i=0;i<=3;i++){
            System.out.println(enames[i]);
        }*/
        /*int i=0;
        while(i<=3){
            System.out.println(enames[i]);
            i++;
        }*/
        for(String ename:enames){
            System.out.println(ename);
        }
       
    }
    
}
