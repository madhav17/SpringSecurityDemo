package org.example

import grails.plugin.springsecurity.annotation.Secured

class UserController {

    @Secured(["ROLE_USER"])
    def index() {

        render "Lag gayi Spring Security"
    }

    @Secured(["ROLE_USER"])
    def userPage() {

        render "User Page"
    }

    @Secured(["ROLE_ADMIN"])
    def adminPage() {

        render "Admin Page"
    }
}
