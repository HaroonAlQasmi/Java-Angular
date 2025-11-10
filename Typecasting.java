public class Typecasting{
    public static void main(String[] args){
        float maxHealth = 500;
        float currentHealth = 354;
        float healthPercentage = currentHealth/maxHealth * 100;
        int healthShown = (int) healthPercentage;
        System.out.println("Current health is: "+ healthShown);
    }
}