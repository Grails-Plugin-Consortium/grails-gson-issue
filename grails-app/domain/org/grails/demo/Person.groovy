package org.grails.demo


import grails.rest.*

@Resource(readOnly = false, formats = ['json'])
class Person {
    String name
    static hasMany = [addresses: Address]
    static constraints = {
        name nullable: false
    }
}