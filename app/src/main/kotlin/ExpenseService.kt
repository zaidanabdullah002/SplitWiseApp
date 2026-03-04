package org.example.app

class ExpenseService {
    fun createExpense(expense: Expense, balanceRepo: BalanceRepo) {
        //logic for expense

        val amountList = expense.amountList
        val memberList = expense.membersList
        val perShare = amountList.average()
        println("pershare : $perShare")
        for(i in 0..<amountList.size) {
            balanceRepo.userToNet[memberList[i].userId] = (-perShare + amountList[i]) +
                    balanceRepo.userToNet.getOrDefault(memberList[i].userId,0.0)
        }

    }
}