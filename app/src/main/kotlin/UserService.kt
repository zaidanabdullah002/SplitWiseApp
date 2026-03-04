package org.example.app

class UserService {
    val users = arrayListOf<User>()
    fun addUser(id:String, name:String): User {
        val u = User(id,name)
        users.add(u)
        return u
    }
}