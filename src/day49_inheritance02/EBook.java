package day49_inheritance02;

public class EBook extends Book {
private double size;
private int pages;

public double getSize() {
	return size;
}
public void setSize(double size) {
	this.size = size;
}
public int getPages() {
	return pages;
}
public void setPages(int pages) {
	this.pages = pages;
}

public void readEBook(int pageNum) {
	System.out.println("Reading "+ getTitle()+"book by "+getAuthor()+" at page "+pageNum);
}
}
