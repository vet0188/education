package pkg_1;

public class ClassD {

    public String[] subjects = {"physics", "chemistry", "biology", "mathematics", "computer"};
    private String text;
    public void grade (double mark)
    {

        if (mark >= 0 && mark <= 100)
        {
            if (mark >= 90 && mark <= 100)
            {
                text = "your grade - A";
            }
            else if (mark >= 80 && mark < 90)
            {
                text = ("your grade - B");
            }
            else if (mark >= 70 && mark < 80)
            {
                text = ("your grade - C");
            }
            else if (mark >= 60 && mark < 70)
            {
                text = ("your grade - D");
            }
            else if (mark >= 40 && mark < 60)
            {
                text = ("your grade - E");
            }
            else
            { text = ("your grade - D");}
        }
        else
        {text = ("Invalid value");}
        //return text;
    }

    public void subject (double[] subjMark)
    {


        for (int i = 0; i < subjMark.length; i++)
        {
            grade(subjMark[i]);
            System.out.print(text);
            System.out.println(" on " + subjects[i]);

        }
    }

}
