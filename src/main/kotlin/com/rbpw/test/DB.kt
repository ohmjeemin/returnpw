package com.rbpw.test

private class DB {
    val userData = mutableListOf<Array<String>>()

    //유저의 아이디와 해싱한 비밀번호, 솔트를 받아 String 배열에 각각 넣어준 뒤, 해당 배열을 userData에 넣어주는 역할을 한다.
    fun setUser(id:String, hashingPassword:String, salt:String) {
        val temp = arrayOf(id, hashingPassword, salt)
        userData.add(temp)
    }

    //사용자가 로그인 하고자 할 때 입력받은 아이디와 해싱한 패스워드가 userData에 저장된 유저의 정보와 일치할 경우 true 반환
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

    //로그인 할 때 아이디&비밀번호를 입력받고, 이 때 해당 아이디의 솔트를 갖고와서 입력한 비밀번호를 해시 함수에 돌리고,
    //얻어진 다이제스트를 userData에 있는 해당 아이디에 대응되는 비밀번호 다이제스트와 일치여부를 알아보아야 한다.
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