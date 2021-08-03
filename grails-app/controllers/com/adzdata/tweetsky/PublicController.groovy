package com.adzdata.tweetsky

import groovy.util.slurpersupport.GPathResult

import java.util.concurrent.Future

class PublicController {
    def twitterService

    def index() {

        render view: 'index'
    }



    def testinghttp(){

        println "params>>"+params




    }
}
