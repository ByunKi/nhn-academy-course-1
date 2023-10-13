package exercise.unit_3;

public class Exercise1 {

    private Exercise1() {

    }

    public static void main(String[] args) {
        Book book = new Book("sample", "no name");
        System.out.println(book instanceof Book);
    }

    public static class Book {
        private String title;
        private String author;
        private int price;

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        public void printBook() {
            StringBuilder builder = new StringBuilder();
            builder.append("Title: ").append(getTitle()).append("\n");
            builder.append("Author: ").append(getAuthor()).append("\n");
            System.out.println(builder.toString());
        }

        public void printBookWithPrice() {
            StringBuilder builder = new StringBuilder();
            builder.append("Title: ").append(getTitle()).append("\n");
            builder.append("Author: ").append(getAuthor()).append("\n");
            builder.append("Price: ").append(getPrice()).append("\n");
            System.out.println(builder.toString());
        }
    }
}
