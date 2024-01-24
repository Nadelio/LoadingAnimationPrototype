public class Animation
{
    public static void loadAnimText()
    {
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
        clearScreen();
        System.out.println("|" + loadPercent + "|");
        System.out.println("Load Complete!");
    }

    public static void clearScreen()
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
