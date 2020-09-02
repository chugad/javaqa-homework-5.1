import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    /* registered */

    @org.junit.jupiter.api.Test
    void shouldCalculateRegisteredAndBoarderLineUp() {
        BonusService service = new BonusService();
        long amount = 16640_00;
        boolean registered = true;
        long expected = 499;

        long actual = service.calculate(amount,registered);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateRegisteredAndBoarderLineDown() {
        BonusService service = new BonusService();
        long amount = 33_34;
        boolean registered = true;
        long expected = 1;

        long actual = service.calculate(amount,registered);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateRegisteredAndZero() {
        BonusService service = new BonusService();
        long amount = 0;
        boolean registered = true;
        long expected = 0;

        long actual = service.calculate(amount,registered);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateRegisteredAndUnderLimit() {
        BonusService service = new BonusService();
        long amount = 1000000_99;
        boolean registered = true;
        long expected = 500;

        long actual = service.calculate(amount,registered);

        assertEquals(expected, actual);
    }

    /* not registered */

    @org.junit.jupiter.api.Test
    void shouldCalculateNotRegisteredAndBoarderLineUp() {
        BonusService service = new BonusService();
        long amount = 49900_99;
        boolean registered = false;
        long expected = 499;

        long actual = service.calculate(amount,registered);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateNotRegisteredAndBoarderLineDown() {
        BonusService service = new BonusService();
        long amount = 100_99;
        boolean registered = false;
        long expected = 1;

        long actual = service.calculate(amount,registered);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateNotRegisteredAndZero() {
        BonusService service = new BonusService();
        long amount = 0;
        boolean registered = false;
        long expected = 0;

        long actual = service.calculate(amount,registered);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateNotRegisteredAndUnderLimit() {
        BonusService service = new BonusService();
        long amount = 50000_99;
        boolean registered = false;
        long expected = 500;

        long actual = service.calculate(amount,registered);

        assertEquals(expected, actual);
    }


}