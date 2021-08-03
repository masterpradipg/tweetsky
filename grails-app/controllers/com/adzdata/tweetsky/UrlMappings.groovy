package com.adzdata.tweetsky

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(controller: 'public')
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
