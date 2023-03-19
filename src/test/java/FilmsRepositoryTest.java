import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmsRepositoryTest {
    FilmsRepository repo = new FilmsRepository();

    FilmsArchive film1 = new FilmsArchive(1, "film1", "comedy");
    FilmsArchive film2 = new FilmsArchive(2, "film2", "fantasy");
    FilmsArchive film3 = new FilmsArchive(3, "film3", "drama");
    FilmsArchive film4 = new FilmsArchive(4, "film4", "cartoon");
    FilmsArchive film5 = new FilmsArchive(5, "film5", "comedy");
    FilmsArchive film6 = new FilmsArchive(6, "film6", "adventure");
    FilmsArchive film7 = new FilmsArchive(7, "film7", "western");

    @Test
    public void addFilms() {

        repo.addFilms(film1);
        repo.addFilms(film2);
        repo.addFilms(film3);
        repo.addFilms(film4);
        repo.addFilms(film5);
        repo.addFilms(film6);
        repo.addFilms(film7);
        FilmsArchive[] expected = {film1, film2, film3, film4, film5, film6, film7};
        FilmsArchive[] actual = repo.getFilms();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void findLastFive() {

        repo.addFilms(film1);
        repo.addFilms(film2);
        repo.addFilms(film3);
        repo.addFilms(film4);
        repo.addFilms(film5);
        repo.addFilms(film6);
        repo.addFilms(film7);
        FilmsArchive[] expected = {film7, film6, film5, film4, film3};
        FilmsArchive[] actual = repo.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

        @Test
        public void checkingLimit(){
            FilmsRepository repo = new FilmsRepository(7);
            repo.addFilms(film1);
            FilmsArchive[] expected = {film1};
            FilmsArchive[] actual = repo.findLast();

            Assertions.assertArrayEquals(expected, actual);


        }
    }



