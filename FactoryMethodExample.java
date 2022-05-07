interface Vehicle{ //As per head first book..this is the product interace

}

class Car implements Vehicle{ //As per the book..this is the concrete product..

}

class Bike implements Vehicle{

}

class Truck implements Vehicle{

}

abstract class VehicleFactory{ //abstract Factory class..as per head first book it is the Creator
    abstract Vehicle createVehicle(); // This is the factory method that abstracts the object instatiation business logic.
    //It hides the way the object is created..
}

//Using polymorphism here... and overriding the 
class CarFactory extends VehicleFactory{ // concrete Factory creates concrete products..as per head first book. it is the concrete Creator.
    Vehicle createVehicle(){
        return new Car();
    }
}

class TruckFactory extends VehicleFactory{ // concrete Factory..as per head first book. it is the concrete Creator.
    Truck createVehicle(){
        return new Truck();
    }
}



public class FactoryMethodExample {
    public static void main(String args[]){

    }
}
