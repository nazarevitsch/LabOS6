public class Main {

    public static int func1(int a, int b) throws Exception
    {
        int res = 0;
        for(int i = 0; i < 10; i++) {
            System.out.println(1);
            res = func2(a, b);
            if(res > 0)
                return res;
        }
        return res;
    }

    public static int func2(int a, int b) throws Exception {
        int res = 0;
        for(int i = 0; i < 10; i++) {
            Thread.sleep(1);
            if(i>8)
                res = resultOfSum(a, b);
            if(res > 0)
                return res;
        }
        return res;
    }

    public static int resultOfSum(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) throws Exception{
        func1(5, 10);
    }
}
