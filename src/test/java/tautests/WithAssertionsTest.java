package tautests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;

@TestInstance(PER_CLASS)
public class WithAssertionsTest {
    @Test
    public void firstAssertion(){
        assertEquals(1,2);

    }

    @Test
    public void secondAssertion(){
        assertEquals(2,2);
    }

}
