import java.util.Random;

public class EnumSingleton {
    
    public static void main(String args[]){
        SingletonObj obj = SingletonObj.INSTANCE;
       
        obj.testMethod1();
        // if(obj.equals(obj1)){
        //     System.out.println("both are equal");
        // }
    }
}



