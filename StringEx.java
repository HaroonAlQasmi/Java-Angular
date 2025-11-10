public class StringEx{
    public static void main(String[] args){
        String greeting = "Hallo";
        System.out.println(greeting);
        String greeted = "End User";
        System.out.println(greeted);
        String greet = greeting +" "+ greeted;
        System.out.println(greet);
        System.out.println(greet.toUpperCase());
        System.out.println(greet.toLowerCase());
        System.out.println(greet.concat(greeting));
    }
}