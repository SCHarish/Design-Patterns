public class Singleton {

    private static Singleton _instance;

    private Singleton(){ //making the constructor private.

    }

    static Singleton getInstance(){
        synchronized(Singleton.class){
            if(_instance == null){
                synchronized(Singleton.class){//Double lock to prevent creating more than one instance.
                    _instance = new Singleton();
                }
            }
        }
        return _instance;
    }

    public static void main(String args[]){

    }
}
