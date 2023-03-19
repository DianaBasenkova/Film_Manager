public class FilmsRepository {
    FilmsArchive[] films = new FilmsArchive[0];
    private int maxLimit;

    public FilmsRepository() {
        this.maxLimit = 5;
    }

    public FilmsRepository(int maxLimit) {
        this.maxLimit = maxLimit;
    }

    public void addFilms(FilmsArchive film) {
        FilmsArchive[] tmp = new FilmsArchive[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public FilmsArchive[] getFilms() {
        return films;
    }

    public FilmsArchive[] findLast() {
        int resultLength;// переменная, в которую сохраняем желаемый размер создаваемого массива
        if (films.length < maxLimit) {
            resultLength = films.length;
        } else {
            resultLength = maxLimit;
        }
        FilmsArchive[] tmp = new FilmsArchive[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;
    }
}