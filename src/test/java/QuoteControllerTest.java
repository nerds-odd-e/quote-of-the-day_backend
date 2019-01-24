import com.odde.qotd.Quote;
import com.odde.qotd.QuoteController;
import com.odde.qotd.QuoteRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class QuoteControllerTest {
    @Test
    public void get_random_quote_if_quote_for_today_not_exist(){
        QuoteRepository repo = mock(QuoteRepository.class);
        Quote randomQuote = new Quote();
        when(repo.getRandom()).thenReturn(randomQuote);
        QuoteController controller = new QuoteController(repo);

        Quote quote = controller.getQuoteOfTheDay();

        assertEquals(randomQuote, quote);
    }

}
