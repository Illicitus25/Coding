class p{
    var name: String
    var age: Int
    p(x: String,y: Int){
        this.name=x
        this.name=y
    }
    fun displayInfo(){
        println("Name: $name, Age: $age")
    }
}
fun main() {
    var obj = p("Hello",10)
    obj.displayInfo()
}