package multidatasource.sto

import grails.testing.gorm.DataTest
import grails.testing.services.ServiceUnitTest
import spock.lang.Specification

class UserServiceSpec extends Specification implements ServiceUnitTest<UserService>, DataTest {

    def setup() {
        mockDomain(User)
    }

    def cleanup() {
    }

    void "test : save user"() {
        expect:"fix me"
            true
    }
}
