import Strings._

class Car(val speedc : Int) {
    var speed = speedc
    
    def drive() {
        println("Vrom!".grow('o', speed))
    }
}