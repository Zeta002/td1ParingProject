package net.quentin;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryUI {
    private ArrayList<Library> theLibraries;


    public void showChoices(){
        System.out.println("select choice : ");
        System.out.println("1. create Library");
        System.out.println("2. create Book");
        System.out.println("3. show Book in library");
        System.out.println("4. remove duplicate in library");
    }

    public void showInterface() {

        Scanner theScan = new Scanner(System.in);

        while(true) {

            showChoices();
            String input = theScan.nextLine();

            if(input.equals("1")) { // create library
                System.out.println("Enter a name");
                String name = theScan.nextLine();

                System.out.println("Enter an address");
                String address = theScan.nextLine();


                System.out.println("Enter a max books");
                int max = Integer.parseInt(theScan.nextLine());

                ArrayList<Book> bookArrayList = new ArrayList<>();

                Library library = new Library(name, address, max, bookArrayList);
                theLibraries.add(library);
                System.out.println("Library successfully created.");
            }
            else if(input.equals("2")) {
                //        public Library(String name, String address, int max, ArrayList<Book> bookList) {
                System.out.println("Enter a title");
                String title= theScan.nextLine();

                System.out.println("Enter a authour");
                String author = theScan.nextLine();


                System.out.println("Enter a editor");
                String editor = theScan.nextLine();

                System.out.println("Enter a max pages");
                int max = Integer.parseInt(theScan.nextLine());

                Book book = new Book(title, author, editor, max);

                System.out.println("Enter a library to add the book");
                showLibraries();

                int indexLibrary= Integer.parseInt(theScan.nextLine());

                theLibraries.get(indexLibrary).addBook(book);

                System.out.println("Book succesfully created and added to library.");
            }
            else if(input.equals("3")) {
                //         public Library(String name, String address, int max, ArrayList<Book> bookList) {
                System.out.println("Enter a name of a librery :");




            }
            Library library = theLibraries.get(Integer.parseInt(input));

        }

    }

    public void showLibraries(){
        System.out.println("select choice : ");
        for(int i = 0; i < theLibraries.size(); ++i){
            System.out.println(i + " " + theLibraries.get(i).getName());
        }
    }
}
