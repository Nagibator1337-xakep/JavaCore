package unitTesting;

import org.testng.Assert;
import org.testng.annotations.Test;
import lessons.ticket.CalculateTicket;

public class UnitTest {
    @Test
    public void infant_ticketPriceIsZero() {
        // Arrange (given)
        CalculateTicket infant = new CalculateTicket(1000,1);

        // Act (when)
        double price = infant.getPrice();

        // Assert (then)
        Assert.assertEquals(price,0.0);
    }

    @Test
    public void child_ticketPriceIsHalf() {
        CalculateTicket child = new CalculateTicket(1000,6);
        double price = child.getPrice();
        Assert.assertEquals(price,500.0);
    }

    @Test
    public void child_ticketPriceIs80Percent() {
        CalculateTicket senior = new CalculateTicket(1000, 70);
        double price = senior.getPrice();
        Assert.assertEquals(price, 800.0);
    }

    @Test
    public void child_ticketPriceIsFull() {
        CalculateTicket adult = new CalculateTicket(1000, 27);
        double price = adult.getPrice();
        Assert.assertEquals(price, 1000.0);
    }
}
