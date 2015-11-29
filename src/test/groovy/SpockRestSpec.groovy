import spock.lang.Specification
import wslite.rest.RESTClient
import wslite.rest.Response

class SpockRestSpec extends Specification{

    def "Should return a person"(){
        given: "we request it from the server"
            RESTClient client = new RESTClient('http://localhost:8080/')
        when:  "userid 0"
            Response resp = client.get([path: "/people/0"])

        then: "we should have a successful response"
            resp.statusCode == 200

        and: "the person matches our expectations"

    }
}