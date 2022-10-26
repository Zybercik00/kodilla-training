package test;

import com.kodilla.exception.test.ExceptionHandling;
import com.kodilla.exception.test.SecondChallenge;
import java.io.IOException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SecondChallengeTest {

    @Test
    void probablyIWillThrowException() throws Exception {
        SecondChallenge secondChallenge = new SecondChallenge();
        secondChallenge.probablyIWillThrowException(1,2);
        Assertions.assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1,2));

    }






}
