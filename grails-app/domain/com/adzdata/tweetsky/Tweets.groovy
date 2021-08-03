package com.adzdata.tweetsky

class Tweets {

    String tweets
    Integer sortnumber
//thhis one
    static  belongsTo = [thread:Thread]
    static constraints = {
    }
}
