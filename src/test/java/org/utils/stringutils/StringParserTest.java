package org.utils.stringutils;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.utils.exceptions.InvalidStringInputException;

import java.util.ArrayList;

//test name: methodUnderTest_inputGiven_expectedOutput
// assertEqual(expected, actual)
class StringParserTest {

    @Test
    void splitString_oneSeperator_returnsFourStrings() throws InvalidStringInputException {
        StringParser sp = new StringParser();
        String testSting = "Hellow mina is Ulala";
        ArrayList<String> stringParts = sp.splitString(testSting, " ");
        assertEquals(4, stringParts.size());
    }

    @Test
    void splitString_nullInput_expectExceptions() {
        StringParser sp = new StringParser();
        String testSting = null;
        //exception need to in terms of class hence the class name, 2nd param need to be runnable by its own/function
        assertThrows(InvalidStringInputException.class, () -> sp.splitString(testSting, " "));
    }
}