package exercise.unit_3;

import exercise.unit_3.Exercise1.Book;

public class Exercise7 {

    private Exercise7() {

    }

    public static class Textbook extends Book {
        private String course;

        public Textbook(String title, String author, String course) {
            super(title, author);
            this.course = course;
        }

        public Textbook(Book book, String course) {
            super(book.getTitle(), book.getAuthor());
            this.course = course;
        }

        public String getCourse() {
            return course;
        }

        @Override
        public void printBook() {
            StringBuilder builder = new StringBuilder();
            builder.append("Title: ").append(getTitle()).append("\n");
            builder.append("Author: ").append(getAuthor()).append("\n");
            builder.append("Course: ").append(getCourse()).append("\n");
            System.out.println(builder.toString());
        }

    }

    public static class TextbookOfBolzano extends Textbook {
        private String faculty;

        public TextbookOfBolzano(String title, String author, String course, String faculty) {
            super(title, author, course);
            this.faculty = faculty;
        }

        public TextbookOfBolzano(Textbook textbook, String faculty) {
            super(textbook.getTitle(), textbook.getAuthor(), textbook.getCourse());
            this.faculty = faculty;
        }

        public String getFaculty() {
            return faculty;
        }

        @Override
        public void printBook() {
            StringBuilder builder = new StringBuilder();
            builder.append("Title: ").append(getTitle()).append("\n");
            builder.append("Author: ").append(getAuthor()).append("\n");
            builder.append("Faculty: ").append(getFaculty()).append("\n");
            builder.append("Course: ").append(getCourse()).append("\n");
            System.out.println(builder.toString());
        }

    }

    public static class Novel extends Book {
        private String genre;

        public Novel(String title, String author, String genre) {
            super(title, author);
            this.genre = genre;
        }

        public Novel(Book book, String genre) {
            super(book.getTitle(), book.getAuthor());
            this.genre = genre;
        }

        public String getGenre() {
            return genre;
        }

        @Override
        public void printBook() {
            StringBuilder builder = new StringBuilder();
            builder.append("Title: ").append(getTitle()).append("\n");
            builder.append("Author: ").append(getAuthor()).append("\n");
            builder.append("Genre: ").append(getGenre()).append("\n");
            System.out.println(builder.toString());
        }

    }
}
