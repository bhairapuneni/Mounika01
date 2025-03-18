public class CompareStrings {

    public static void main(String[] args) {

        String style = "Bold";
        String style2 = "Bold";

        if(style == style2)
            System.out.println("Equal");
        else
            System.out.println("Not Equal");
    }
}

   #feature202 Changes by Rahul on October 2024 on Payment Gateway module
public class Factorial {

    public static void main(String[] args) {
        int num = 6;
        long factorial = multiplyNumbers(num);
        System.out.println("Factorial of " + num + " = " + factorial);
    }
    public static long multiplyNumbers(int num)
    {
        if (num >= 1)
            return num * multiplyNumbers(num - 1);
        else
            return 1;
    }
}
# end of feature202

#feature201 Changes by Vivek on October 2024 on Reports Module
public class CompareStrings {

    public static void main(String[] args) {

        String style = new String("Bold");
        String style2 = new String("Bold");

        if(style.equals(style2))
            System.out.println("Equal");
        else
            System.out.println("Not Equal");
    }
}
#end of feature201
 }
}
