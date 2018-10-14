object HelloWorld {
    def main(args: Array[String]) {
        val car = new Car(5)
        var truck = new Truck(2)
        car.drive()
        truck.drive()
        truck.drive(true)
    }
}
