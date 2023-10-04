package net.quentin;

import java.util.Objects;

public class Book {

    private String title;
    private String author;
    private String editor ;
    private int pageNb;

    public Book(String title, String author, String editor, int pageNb) {
        this.pageNb = pageNb;
        this.title = title;
        this.author = author;
        this.editor = editor;
    }

    public int getPageNb() {
        return pageNb;
    }

    public void setPageNb(int pageNB) {
        this.pageNb = pageNB;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", editor='" + editor + '\'' +
                ", pageNb=" + pageNb +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return pageNb == book.pageNb && Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(editor, book.editor);
    }

}
