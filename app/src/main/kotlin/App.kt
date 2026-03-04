package org.example.app

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val userService = UserService()
    val expenseService = ExpenseService()
    val balanceService = BalanceService()
    val balanceRepo = BalanceRepo()

    val sb = SplitService(userService,expenseService,balanceService,balanceRepo)
    val u1 = sb.registerUser("A", "Ann");
    val u2 = sb.registerUser("B", "Ben");

//    val e1 = Expense(1,listOf(u1,u2),listOf(1000.0,0.0))
//    sb.recordExpense(e1);

    val u3 = sb.registerUser("C", "Cam");

    val e2 = Expense(2,listOf(u1,u2,u3),listOf(0.0,600.0,0.0));
    val e3 = Expense(3,listOf(u1,u3),listOf(100.0,0.0))

    sb.recordExpense(e2)
    sb.recordExpense(e3)
    sb.listBalances();
}
