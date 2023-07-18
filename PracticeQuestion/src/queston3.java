
public class queston3 {
    public static void main(String[] args) {
       
        //given
        
        String bookOne = "Game of Thrones";   
        String bookTwo = "Harry Potter and The Philosopher's Stone";
        String bookThree = "Invisible Man";
        
        
        double book1 = 200;
        double book2 = 250;
        double book3 = 300;
        
        // qn no a
        
        // for book one jan to july
        
        double bookPriceOne = book1 + (book1+book1*0.05)+ (book1+book1*0.10) +(book1+book1*0.15) + (book1+book1*0.20) + (book1+book1*0.25) + (book1+book1*0.30);
        
        // for book two feb to july
        
        double bookPriceTwo = book2 + (book2+book2*0.05)+ (book2+book2*0.10) + (book2+book2*0.15) +(book2+book2*0.20) + (book2+book2*0.25);
        
        // for book three feb to july
        
        double bookPriceThree = book3 + (book3+book3*0.05)+ (book3+book3*0.10) + (book3+book3*0.15) +(book3+book3*0.20) + (book3+book3*0.25);
        
        //add
        
        double totalA = bookPriceOne + bookPriceTwo + bookPriceThree;
        
        //qn no a answer;
        
        System.out.println("Sita need to pay Rs "+totalA+" if she will return all the books in july.");
        
        
        // qn no b
        
        // for book one jan to march
        
        double bookPrice1 = book1 + (book1+book1*0.05)+ (book1+book1*0.10);
        
        // for book two feb to july
        
        double bookPrice2 = book2 + (book2+book2*0.05)+ (book2+book2*0.10) + (book2+book2*0.15) +(book2+book2*0.20) + (book2+book2*0.25);
        
        // for book three feb to aug
        
        double bookPrice3 = book3 + (book3+book3*0.05)+ (book3+book3*0.10) + (book3+book3*0.15) +(book3+book3*0.20) + (book3+book3*0.25) + (book3+book3*0.30);
        
        //add
        
        double totalB = bookPrice1 + bookPrice2 + bookPrice3;
        
        //qn no b answer;
        
        System.out.println("Sita need to pay Rs "+totalB+" if she will return all the books.");
        
        // qno no c
        
        // for book one jan to dec
        
        double bookPrice11 = book1 + (book1+book1*0.05)+ (book1+book1*0.10)+ (book1+book1*0.15) +(book1+book1*0.20) + (book1+book1*0.25) + (book1+book1*0.30)+
                (book1+book1*0.35)+ (book1+book1*0.40) +(book1+book1*0.45) + (book1+book1*0.50) + (book1+book1*0.55);
        
        // for book two jan to dec
        
        double bookPrice22 = book2 + (book2+book2*0.05)+ (book2+book2*0.10)+ (book2+book2*0.15) +(book2+book2*0.20) + (book2+book2*0.25) + (book2+book2*0.30)+
                (book2+book2*0.35)+ (book2+book2*0.40) +(book2+book2*0.45) + (book2+book2*0.50) + (book2+book2*0.55);
        
        // for book three jan to dec
        
        double bookPrice33 = book3 + (book3+book3*0.05)+ (book3+book3*0.10)+ (book3+book3*0.15) +(book3+book3*0.20) + (book3+book3*0.25) + (book3+book3*0.30)+
                (book3+book3*0.35)+ (book3+book3*0.40) +(book3+book3*0.45) + (book3+book3*0.50) + (book3+book3*0.55);
        
        //add
        
        double totalC = bookPrice11 + bookPrice22 + bookPrice33;
        
        //qn no b answer;
        
        System.out.println("Sita need to pay Rs "+totalC+" if she will return all the books in dec.");
        
        
        
        
       
        
        
        
        
        
        
        
    
}
}