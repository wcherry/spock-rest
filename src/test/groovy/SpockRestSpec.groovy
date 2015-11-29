import spock.lang.Specification

class SpockRestSpec extends Specification{

    def "Should return a person"(){
        given: "userid 0"

        when:  "we request it from the server"

        then: "we should have a successful response"

        and: "the person matches our expectations"

    }
}