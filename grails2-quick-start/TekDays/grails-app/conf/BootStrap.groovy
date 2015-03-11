import com.tekdays.TekEvent
import com.tekdays.TekUser

class BootStrap {

    def init = { servletContext ->
        // Creating users
        new TekUser(
                fullName: 'John',
                userName: 'john',
                password: 'pass',
                email: 'john@ex.com',
                website: 'john.ex.com',
                bio: '''Long time Groovy lover'''
        ).save()

        new TekUser(
                fullName: 'Bill',
                userName: 'bill',
                password: 'pass',
                email: 'bill@ex.com',
                website: 'bill.ex.com',
                bio: '''Long time Grails lover'''
        ).save()

        // Creating events
        def event1 = new TekEvent(
                name: 'GUG',
                city: 'Madrid',
                organizer: TekUser.findByFullName('John'),
                venue: 'TBD',
                startDate: new Date('3/15/2015'),
                endDate: new Date(('3/15/2015')),
                description: '''This is a small Groovy user group meeting'''
        )
        event1.addToVolunteers(new TekUser(
                fullName: 'Jane',
                userName: 'jane',
                password: 'pass',
                email: 'jane@ex.com',
                website: 'jane.ex.com',
                bio: 'Just a girl'
        ))
        event1.addToVolunteers(new TekUser(
                fullName: 'Jill',
                userName: 'jill',
                password: 'pass',
                email: 'jill@ex.com',
                website: 'jill.ex.com',
                bio: 'Another girl'
        ))
        event1.addToResponders('ben@ex.com')
        event1.addToResponders('joel@ex.com')
        event1.addToResponders('karl@ex.com')

        if (!event1.save()) {
            event1.errors.allErrors.each { error ->
                println "An error occured with event1: ${error}"
            }
        }

        def event2 = new TekEvent(
                name: 'Greach',
                city: 'Madrid',
                organizer: TekUser.findByFullName('Bill'),
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
