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
        // FIXME improve range of test parameters (non-zero 2nd param)
    }

    // FIXME test subtraction
}