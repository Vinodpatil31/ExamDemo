public class fibonacci{
    public static void main(String args[])
    {
        int a=0, b=1;
        int c;

        int count = 20;

        System.out.print(a+" "+b);

        for(i=2;i<count;i++)
        {
            c = a+b;
            

            a=b;
            b=c;

            if(i==19)
            break;
            else{
                    System.out.print(" "+c);
            }
        }

        
    }
}