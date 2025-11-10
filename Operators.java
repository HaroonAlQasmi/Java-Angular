public class Operators{
    public static void main(String[] args){
        //Lets learn about operators in java
        int answer = 0 , x = 3, y = 5; // here we assigned calues using =
        answer = x + y;
        System.out.println(answer);//here we used + to add two values
        answer = y - x;
        System.out.println(answer);//subtracted using -
        float result = (float) x/y; // answer was changed to result because a declared variable cannot change data type in the same scope
        System.out.println(result);//divided using /
        answer = x * y;
        System.out.println(answer);// we multiplied using *
        result = x % y;
        System.out.println(result);// once a variable has been assigned a data type there is no need to assign it in later lines 
        System.out.println(x == y); // check if they are equal
        System.out.println(x != y); // check if they are NOT equal
        System.out.println(x > y);// check if larger than
        System.out.println(x < y);// check if smaller than
        System.out.println(x > y && x < y);// check if both are true
        System.out.println(x > y || x < y); // check if either is true
    }
}