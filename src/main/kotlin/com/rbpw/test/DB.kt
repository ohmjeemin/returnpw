package com.rbpw.test

private class DB {
    val userData = mutableListOf<Array<String>>()

    //유저 생성
    fun setUser(id:String, hashingPassword:String, salt:String) {
        val temp = arrayOf<String>("id", "hashingPassword", salt)
        userData.add(temp)
    }

    //들어온 id와 비밀번호가 일치하는지 체크
    fun check(id:String, hashingPassword:String):Boolean {
        for(i in 0 until userData.size) {
            if(id.equals(userData.get(i)[0])) {
                if(hashingPassword.equals(userData.get(i)[1])) {
                    return true
                }
            }
        }
        return false
    }

    //해당 id의 salt 값 찾기
    fun getSalt(id:String): String {
        var err = ""
        for(i in 0 until userData.size) {
            if(id.equals(userData.get(i)[0])) {
                return userData.get(i)[2]
            }
        }
        return err
    }
    
}