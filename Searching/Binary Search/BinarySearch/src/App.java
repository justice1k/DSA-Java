import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        // test here

    }

    public static int binarySearch(ArrayList<Book> books, long searchedId) {

        int start = 0;
        int end = books.size() - 1;

        while (start <= end) {
            int middle = (start + end) / 2;

            if (books.get(middle).getId() == searchedId) {
                return middle;
            }

            if (books.get(middle).getId() > searchedId) {
                end = middle - 1;
            }

            if (books.get(middle).getId() < searchedId) {
                start = middle + 1;
            }

        }

        return -1;
    }
}
