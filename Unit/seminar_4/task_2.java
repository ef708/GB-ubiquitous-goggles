import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;


class BookServiceTest {
    private BookRepository bookRepository;
    private BookService bookService;
    private InMemoryBookRepository inMemoryBookRepository;

    @BeforeEach
    public void setup() {

        bookRepository = Mockito.spy(InMemoryBookRepository.class);
        bookService = new BookService(bookRepository);

    }

    @Test
    void findBookById() {

        final Book book = bookService.findBookById("1");

        assertThat(book).isNotNull();
        assertThat(book.getId()).isEqualTo(book.getId());
        assertThat(book.getTitle()).isEqualTo(book.getTitle());

    }

    @Test
    void findAllBooks() {

        List<Book> books = bookService.findAllBooks();

        assertThat(books).isNotNull();
        Assertions.assertThat(books).hasSize(2);

    }
}