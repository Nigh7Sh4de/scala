class Truck(override val speedc : Int) extends Car(speedc) {
    def drive(backwards : Boolean) {
        if (backwards) {
            println("BEEP BEEP")
        }
        else {
            super.drive
        }
    }
}