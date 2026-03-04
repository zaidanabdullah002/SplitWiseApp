package org.example.app

class SplitService(
    val userService: UserService,
    val expenseService: ExpenseService,
    val balanceService: BalanceService,
    val balanceRepo: BalanceRepo
) {

    fun registerUser(string: String, string2: String) : User{
        return userService.addUser(string,string2)
    }

    fun recordExpense(e1: Expense) {
        expenseService.createExpense(e1,balanceRepo)
        balanceService.updateBalance(balanceRepo)
    }

    fun listBalances() {
        val list = balanceService.displayAllBalance()
        val retList = mutableListOf<String>()
        for (balance in list) {
            retList.add(balance.debitor + " owes " + balance.creditor + " " + balance.debitorAmount)
        }
        println(retList)
    }


}