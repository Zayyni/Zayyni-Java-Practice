enum Week{
    MON,TUE,WED,THU,FRI,SAT,SUN;
}


public class LaunchEnum1 {
    public static void main(String[] args)
    {
        Week week=Week.MON;
        System.out.println(week);
        int index = Week.THU.ordinal(); // it gives the index of the element and starts index from zero
        System.out.println(index);

        Week[] weekArr =Week.values();
        for (Week w : weekArr)
        {
            System.out.println(w.ordinal() + " -> " + w);
        }

    }
}
