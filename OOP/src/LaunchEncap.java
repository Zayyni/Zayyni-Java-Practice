class Book{
    private int pageNum;

    //setter
    void setPageNum(int pageNum){
        if(pageNum < 0)
                    System.out.println("Invalid Page Number");
        else {
            this.pageNum = pageNum;
        }
    }
    //getter
    int getPageNum(){
        return pageNum;
    }

    void display(){
        System.out.println("Java and Inheritance is present in Page Number: " + pageNum);
    }
}
public class LaunchEncap {
    public static void main(String[] args) {
        Book book= new Book();
        book.setPageNum(3);
        System.out.println(book.getPageNum());
        book.display();

    }
}
