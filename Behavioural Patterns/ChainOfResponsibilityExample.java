

public class ChainOfResponsibilityExample {
    public static void main(String args[]){
        System.out.println("Hello");
        ChainOfResponsibilityExample mainObj = new ChainOfResponsibilityExample();

    }


    abstract class BaseHandler{
        protected int level;
        void handle(int level){
            if(){
                this.process();
            } else{
                this.nextHandler.handle(level);
            }
        }

        abstract void process();
    }

    class ConcreteHandler1 extends BaseHandler{
        private BaseHandler nextHandler;

        ConcreteHandler1(int level){
            this.level = level;
        }

        void setNextHandler(BaseHandler handler){
            this.nextHandler = handler;
        }

        void process(){

        }
    }

    class ConcreteHandler2 extends BaseHandler{

        private BaseHandler nextHandler;

        ConcreteHandler2(int level){
            this.level = level;
        }

        void setNextHandler(BaseHandler handler){
            this.nextHandler = handler;
        }

        void process(){

        }
    }
}
