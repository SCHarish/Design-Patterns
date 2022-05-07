import java.util.*;
public enum SingletonObj{
    INSTANCE;
    int val;

    void testMethod1(){
        System.out.println("Test method");
    }

    int getRandomNumber(){
        Random obj = new Random();
        return obj.nextInt(100);
    }

}
