package org.grails.demo

import grails.rest.Resource

@Resource(readOnly = false, formats = ['json'])
class Address {
    String city
    static constraints = {
        city nullable: false
    }
}
