package ATM;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class BillDefTest {
    BillDef def1;
    BillDef def2;
    BillDef def3;

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUp() {
        def1 = new BillDef(100);
        def2 = new BillDef(50);
        def3 = new BillDef(20);

        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void setNext() {
        def1.setNext(def2);
        assertEquals(def1.getNextBill(), def2);
    }

    @Test
    void process() {
        def1.setNext(def2);
        def2.setNext(def3);
        def1.process(970);
        assertEquals("'20' - 1\n" +
                "'50' - 1\n" +
                "'100' - 9\n", outContent.toString());
    }
}
