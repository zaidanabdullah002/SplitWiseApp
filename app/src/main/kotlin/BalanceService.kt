package org.example.app

class BalanceService {
    val balances = mutableListOf<Balance>()
    fun updateBalance(balanceRepo: BalanceRepo){
        val creditList = mutableMapOf<String, Double>()
        val debitorList = mutableMapOf<String, Double>()

        for((user,amount) in balanceRepo.userToNet.entries){
            if(amount== 0.0) continue
            if(amount > 0.0){
                creditList[user] = amount
            }else{
                debitorList[user] = -amount
            }
        }
        // extensible to multiple creditors
        balances.clear()
        debitorList.forEach { (user, amount) ->
            val balance = Balance(user,amount,creditList.keys.first())
            balances.add(balance)
        }
    }
    fun displayAllBalance(): MutableList<Balance> {
        return balances

    }
}