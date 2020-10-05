class Demo{
    Demo()
    {
        System.out.println("First constructor call..");
    }
    Demo(int i, int j)
    {
       this();
       int sum = i + j;
       System.out.println("sum ="+ sum);

    }

}

class Test extends Demo{

    Test()
    {
        this(4,8);
        System.out.println("Base class constructor call...");
    }
    Test(int i, int j)
    {
       super(3,2); 
       int mul = i * j;
       System.out.println("mul ="+ mul);
    }

}

class Question41{

    public static void main(String args[]){
    Test t = new Test();

    }
}