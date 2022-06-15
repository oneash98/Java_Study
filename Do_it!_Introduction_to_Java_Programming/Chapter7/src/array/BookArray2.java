package array;

public class BookArray2 {
    public static void main(String[] args) {
        Book[] library = new Book[5];

        library[0] = new Book("태백산맥", "조정래");
        library[1] = new Book("데미안", "헤르만 헤세");

        for(int i = 0; i < 2; i++) {
            library[i].showBookInfo();
        }

        for(int i = 0; i < library.length; i++) {
            System.out.println(library[i]);
        }
    }
    
}
