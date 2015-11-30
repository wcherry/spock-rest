import org.sss.spock.rest.RestTrait
import spock.lang.Specification

class SpockRestSpec extends Specification implements RestTrait{
    def "Should return a person"(){
        given: "we request it from the server"
        url = 'http://localhost:8080/'

        when:  "userid 0"
        def resp = get([path: "/people/0"])

        then: "we should have a successful response"
        resp.statusCode == 200

        and: "the person matches our expectations"

    }
}