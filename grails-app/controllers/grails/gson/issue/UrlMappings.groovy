package grails.gson.issue

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/persons"(resources:'person')
        "/addresses"(resources:'address')

        "/"(view: 'index')
        "500"(view: '/application/serverError')
        "404"(view: '/application/notFound')
    }
}