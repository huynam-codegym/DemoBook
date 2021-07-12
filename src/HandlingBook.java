public class HandlingBook {
 private static Book1 books[];

 public static Book1[] getBooks() {
  return books;
 }

 public static void setBooks(Book1[] books) {
  HandlingBook.books = books;
 }


 public HandlingBook() {
 }

 public int getSumAmount(){
  int sum=0;
  for (Book1 o: books
  ) {
   sum += o.getAmount();
  }
  return sum;
 }

 public int SeachBookBy(String name){
  int count = 0;
  for (Book1 o: books
  ) {
   if (o.getName() == name) count++;
  }
  return count;
 }



 public Book1[] searchBookByPrice(int price){
  Book1[] books1 = new Book1[6];
  int count = 0;
  for (int i = 0; i < books.length; i++) {
   if (books[i].getPrice()<price) {
    books1[count]= books[i];
    count++;
   }
  }
  return books1;
 }
}