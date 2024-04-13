fun newAccount(){
    println("First name: ")
    val fname = readLine()!!
    println("Last name: ")
    val lname = readLine()!!
    println("Middle name: ")
    val mname = readLine()!!
    println("Age")
    val age = readLine()!!
    

}

fun logIn(){


}

fun main(){
    println("Welcome to the Digital Wallet!")
    print("Get Started: \n1. Create An Account\n2. Sign In")
    val choice = readLine()!!
	when (choice) {
		"1" -> newAccount()
		"2" -> logIn()
		else -> "Invalid number."
    }

}