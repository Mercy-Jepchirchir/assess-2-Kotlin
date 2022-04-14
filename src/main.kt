fun main(){
 /*   Create a classCurrentAccount with the following attributes:account
    number, account name, balance. It has the following functions:
    a.deposit(amount: Double) - Increments the balance bythe
            amount deposited
            b.withdraw(amount: Double) - Decrements the balanceby the
            amount withdrawn
            c.details() - Prints out the account number and balanceand
    name in this format: “Account number x with balance y is
    operated by z*/
    var mercy= currentAccount(6000.0,"Nancy",600)
     mercy.deposit(500.0)
    mercy.withdraw(300.0)
    mercy.details("Mercy","1123567KWR",800.0)
    println(takeChar("Jepchirchir"))

    var vegetable=Product("kales", 5.0,500,"groceries")
    var towel=Product("Towel",2.0,30,"hygiene")
    var otherproduct=Product("table",40.0,300,"others")

    categoriesList(vegetable)
    categoriesList(towel)
    categoriesList(otherproduct)

}
open class currentAccount(var account:Double,var name:String,var balance:Int){

    fun deposit(amount:Double){
        account+=amount
        account++
        println(account)


    }
    open fun withdraw(amount:Double){
        account-=balance
        println(amount)

    }
    fun details(name:String,accountNumber:String,balance:Double){
        /*var name= "mercy Jepchirchir"
        var accountNumber="123456nyt"
         var balance= 800.0*/
        println("account number $accountNumber with balance $balance is operated by $name")
    }
}

class savingAccount(var accountNumber:String,var accountName :String,var balance:Int,var withdrawal:Int){
       fun withdraw(){

       }

}
data class Product(var name:String,var weight:Double,var price:Int,var category:String)
      fun categoriesList(product: Product){
          var groceriesList= mutableListOf<Product>()
          var hygieneList= mutableListOf<Product>()
          var otherList= mutableListOf<Product>()
          when(product.category){
                  "grocery" -> groceriesList.add(product)
                    "hygiene" -> hygieneList.add(product)
                     else -> otherList.add(product)

                 }
                 println(groceriesList)
                 println(hygieneList)
                  println(otherList)
              }

fun takeChar(word:String):String {
    var makechar=" "
    for (characters in word){
        if (word.indexOf(characters)%2==0){
            makechar+=characters
        }
    }
    return makechar
}