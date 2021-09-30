package dk.cngroup.pitest

import spock.lang.Specification
import spock.lang.Subject

class NumbersSpec extends Specification {

    @Subject
    Numbers numbers = new Numbers()

    def 'Should return #result given #number'() {
        expect:
        numbers.isNatural(number) == result

        where:
        number | result
        10  | true
        50  | true
        -10 | false
        -50 | false
        //FIXME add boundary case (zero)
    }

}