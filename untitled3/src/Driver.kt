package AutoBase
open class Driver(val number_of_car:String, var voyage_now:Int):Voyage(){
    private var suspended = false
    private var repair_request: Boolean=false
    open fun RepairRequest(){
        if(!repair_request){
            println("Заявка на ремонт принята")
        repair_request=true
            }
        else{
            println("Заявка на ремонт уже создана")
        }
    }
    fun VoyageIsOver(){
        println("Рейс был выполнен")
    }
    open fun SuspendFromWork(){
        suspended=true
    }


}