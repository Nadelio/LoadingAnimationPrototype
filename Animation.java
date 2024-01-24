public class Animation
{
    public static boolean animationComplete;

    public static void loadAnimText()
    {
        animationComplete = false;
        String loadPercent = "";
        String[] spinWheelFrames = {"|", "/", "--", "\\", "|", "/", "--", "\\"};
        int loadPercentNum = 0;
        while(loadPercentNum < 13)
        {
            for(int i = 0; i < spinWheelFrames.length; i++)
            {
                clearScreen();
                System.out.print(loadPercent + spinWheelFrames[i]);
                try{Thread.sleep(50);}catch(Exception e){}
            }
            loadPercent = loadPercent + "=";
            loadPercentNum++;
        }
        loadComplete("|" + loadPercent + "|");
    }

    public static void clearScreen()
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void loadComplete()
    {
        clearScreen();
        System.out.println("Load Complete!");
        animationComplete = true;
    }

    public static void loadComplete(String loadMessage)
    {
        clearScreen();
        System.out.println(loadMessage);
        System.out.println("Load Complete!");
        animationComplete = true;
    }

    public static void loadAnimTextVariant()
    {
        animationComplete = false;
        String[] loadingAnimFrames = {".", "..", "...", ""};
        int loadPercent = 0;

        while(loadPercent < 6)
        {
            for(int i = 0; i < loadingAnimFrames.length; i++)
            {
                clearScreen();
                System.out.print("Loading" + loadingAnimFrames[i]);
                try{Thread.sleep(200);}catch(Exception e){}
            }
            loadPercent++;
        }
        loadComplete();
    }
}
