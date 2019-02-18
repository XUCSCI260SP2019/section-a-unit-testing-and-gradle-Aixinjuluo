package edu.xavier.csci;
class Calculator{

    public int Add(int ... SumTo){
        System.out.println("argument length: " + SumTo.length);
        int sum = 0;
        for(int x: SumTo){
            sum += x;
        }
        return sum;
    }
    public static void main( String[] args ) {
        Calculator ex = new Calculator();

        int sum2 = ex.Add(2, 4);
        System.out.println("sum2 = " + sum2);

        int sum3 = ex.Add(1, 3, 5);
        System.out.println("sum3 = " + sum3);

        int sum4 = ex.Add(1, 3, 5, 7);
        System.out.println("sum4 = " + sum4);
    }
}
