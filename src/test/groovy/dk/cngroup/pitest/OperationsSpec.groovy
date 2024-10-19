package dk.cngroup.pitest

import spock.lang.Specification
import spock.lang.Subject

class OperationsSpec extends Specification {

    @Subject
    Operations operations = new Operations()

    def "Should return #result given #operand1 + #operand2"() {
        expect:
        operations.add(operand1, operand2) == result

        where:
        operand1 | operand2 | result
        10       | 0        | 10
        -6       | 0        | -6
        1        | -8       | -7
        0        | 10       | 10
    }

    def "Should return #result given #operand1 - #operand2"() {
        expect:
        operations.subtract(operand1, operand2) == result

        where:
        operand1 | operand2 | result
        10       | 0        | 10
        -6       | 0        | -6
        1        | -8       | 9
        0        | 10       | -10
    }
}