import com.tekdays.TekEvent

class BootStrap {

    def init = { servletContext ->
        def event1 = new TekEvent(
                name: 'GUG',
                city: 'Madrid',
                organizer: 'Joe',
                venue: 'TBD',
                startDate: new Date('3/15/2015'),
                endDate: new Date(('3/15/2015')),
                description: '''This is a small Groovy user group meeting'''
        )
        if (!event1.save()) {
            event1.errors.allErrors.each { error ->
                println "An error occured with event1: ${error}"
            }
        }

        def event2 = new TekEvent(
                name: 'Greach',
                city: 'Madrid',
                organizer: 'John',
                venue: 'TBD',
                startDate: new Date('4/11/2015'),
                endDate: new Date('4/12/2015'),
                description: '''Biggest spanish conference for Groovy & Grails related topics'''
        )
        if (!event2.save()) {
            event2.errors.allErrors.each { error ->
                println "An error occured with event2: ${error}"
            }
        }
    }

    def destroy = {
    }
}
