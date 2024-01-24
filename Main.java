public class Main
{
    public static void main(String [] args)
    {
        Animation.loadAnimText();
        try{Thread.sleep(1000);}catch(Exception e){}
        while(true)
        {
            if(Animation.animationComplete)
            {
                Animation.loadAnimTextVariant();
                break;
            }
        }
    }
}