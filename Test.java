public class Test {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry");
        System.out.println(Car.getNumCars());
        Car car2 = new Car("Toyota", "Camry");
        System.out.println(Car.getNumCars());

        Math.sum(1, 2);

        Math.sub(5,3);

        Math.mul(5,3);

        Math.div(299, 35);
        
        People person1 = new People("John", 30);

        // Nos arroja un error ya que la variable contador no es visible
        // System.out.println(People.numPeople;); 
    }
}
