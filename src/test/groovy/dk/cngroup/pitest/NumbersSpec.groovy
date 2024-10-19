package dk.cngroup.pitest

import spock.lang.Specification
import spock.lang.Subject

class NumbersSpec extends Specification {

    @Subject
    Numbers numbers = new Numbers()

    def 'Should evaluate #number as natural: #result '() {
        expect:
        numbers.isNatural(number) == result

        where:
        number | result
        1      | true
        10     | true
        -1     | false
        -10    | false
        0      | true
    }

}