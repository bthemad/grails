package com.tekdays

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(TekEvent)
class TekEventSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test toString"() {
        given: "a tekEvent with a name and a city"
            def tekEvent = new TekEvent(name: 'GUG', city: 'Madrid', organizer: [fullName: 'Joe'] as TekUser)
        when: "call toString"
            def s = tekEvent.toString()
        then: "the toString will combine them"
             s == 'GUG, Madrid'
    }
}
