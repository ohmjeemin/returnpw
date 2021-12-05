package com.rbpw.test

/*
* SALT는 128비트로 고정시킬 것
* */

class User {
    private final var SALT_SIZE = 16
    //private

    fun setUser(id:String, password:ByteArray) {
        var salt = getSalt()

    }
}