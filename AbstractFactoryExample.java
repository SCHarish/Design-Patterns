
//Factory of factories
// Useful to create family of related classes..

interface CarFactory{

}

class IndianCarFactory implements CarFactory{
    Car createSUV(){
        return new SUV();
    }

    Sedan createSedan(){
        return new Sedan();
    }
}

class AmericanCarFactory implements CarFactory{
    Car createSUV(){
        return new SUV();
    }

    Sedan createSedan(){
        return new Sedan();
    }
}

interface Car{

}

class SUV implements Car{

}

class Sedan implements Car{

}


public class AbstractFactoryExample {
    public static void main(String args[]){

    }
}
