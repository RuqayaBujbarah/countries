fun main(){
    val countries = mutableMapOf("country" to "capital")
    var country = ""
    var capital = ""
    for(i in 1..3){
        print("Enter a country: ")
        country = readLine().toString()
        print("Enter a capital: ")
        capital = readLine().toString()
        countries[country]=capital
    }
    for (item in countries){
        println(item.key + ": " + item.value)
    }
}