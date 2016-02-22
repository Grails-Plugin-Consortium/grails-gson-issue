import org.grails.demo.Address
import org.grails.demo.Person

class BootStrap {

    def init = { servletContext ->

        new Person(name: 'Graeme')
                .addToAddresses(new Address(city: 'Grailsville'))
                .addToAddresses(new Address(city: 'Groovyland'))
        .save(failOnError: true)

    }
    def destroy = {
    }
}
