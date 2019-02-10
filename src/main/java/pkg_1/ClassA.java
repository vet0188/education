package pkg_1;

public class ClassA {

    public ClassA()
    {
        System.out.println("Put some service message here");
    }

    public void hello(){
        System.out.println("Hello!");
    }
    public int sum(int [] args){
        int sumresult = 0;
        for (int i =0; i<args.length; i++)
            sumresult += args[i];
        return sumresult;
    }
    public double sub(double a, double b){

        double subresult=a-b;
        return subresult;
    }
    public double sqr(double a){

        double sqrresult= Math.pow(a, 2);
        return sqrresult;
    }
    public int mult(int [] mult){
        int multresult=1;
        for (int i = 0; i < mult.length; i++)
            multresult = mult[i]*multresult;
        return multresult;

    }
}
