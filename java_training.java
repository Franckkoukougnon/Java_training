public class java_training {
    public static void main(String[] args) {

        Book monLivre = new Book("Art de coder", "Franck Aimé", 225);
        System.out.println("jai acheté un livre " + monLivre.title + " l'auteur est " + monLivre.author);
    }
}

class Book {
    String title;
    String author;
    int numberOfPages;
    String publisher;

    Book(String title, String author, int numberOfPages) {
        this(title, author, numberOfPages, author);
    }

    // Constructeur principale de la classe Book

    Book(String title, String author, int numberOfPages, String publisher) {
        // Initialise l'attribut title avec la valuer de l'argument title

        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.publisher = publisher;
    }

}