

class Card (val first: String, val last: String, val num: Int) {
    val firstName = first
    val lastName = last
    val accountNumber = num
}



    fun cards(args: Array<String, Int>) {
        i = 1
        while (i = 1){
            val cardMap = mutableMapOf()
            print("Enter name of card: ")
            val cardName = readLine()!!
            print("Enter account number on card: ")
            val cardNum = readLine()!!
            print("Enter value of card: ")
            val cardVal = readLine()!!
            val cardMap.put = (cardName, cardValue)
            print("Would you like to add another card? Type 1 for yes and 0 for no")
            val i = readLine()!!
            if (i == 0) {
                return cardSet
            }
        }
    }
