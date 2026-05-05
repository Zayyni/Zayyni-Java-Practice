enum Result
{
    PASS, FAIL, NR;

//    public static final Result PASS = new Result();
    //    public static final Result FAIL = new Result();
    //    public static final Result NR = new Result();

//    enum Week
//    {
//        MON, TUE, WED;
//    }

    int marks;
    Result(){
        System.out.println("Enum Constructor");
    }

    public void setMarks(int marks)
    {
        this.marks = marks;
    }
    public int getMarks(){
        return marks;
    }

}
public class LaunchEnum2
{
    public static void main(String[] args)
    {

        Result result=Result.PASS;
        result.setMarks(5);
        int marks1=result.getMarks();
        System.out.println(marks1);
        System.out.println(result);

        int marks = Result.FAIL.getMarks();
        System.out.println(marks);
    }
}
