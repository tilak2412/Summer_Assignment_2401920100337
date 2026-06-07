#include <iostream>
using namespace std;
class LibraryUser{
   public:
   virtual void registerAccount()=0;
   virtual void requestBook()=0;

};
class KidUser : public LibraryUser{
   public:
   int  age;
   string bookType;
   void registerAccount() override{
      if(age<12){
         cout <<"You have successfully registered under a Kids Account" << endl;
         } else{
            cout << "Sorry,Age must be less than 12 to register as a Kid" << endl;
         }
   }
   void requestBook() override{
      if(bookType == "kids"){
         cout << "Book Issued successfully,please return the book within 10 days"  << endl;
      } else{
         cout << "oops,you are allowed to take only kids books" << endl;
      }
   }
};
class AdultUser : public LibraryUser{
   public:
   int age;
   string bookType;
   void registerAccount() override{
      if(age>12){
         cout << "You have successfully registered under an Adult Account " << endl;
      } else{
         cout << "Sorry,Age must be greater than 12 to register as an adult" << endl;
      }
   }
   void requestBook() override{
      if (bookType == "fiction"){
         cout << "Book Issued successfully,please return the book within 7 days" << endl;
      } else{
         cout << "Oops, you are allowed to take only adult Fiction books" << endl;
      }
   }
};
int main(){
   cout << "===== Test case 1: KidUser =====" << endl;
   KidUser kid;
   kid.age=10;
   kid.registerAccount();
   kid.age=18;
   kid.registerAccount();
   kid.bookType ="kids";
   kid.requestBook();
   kid.bookType ="Fiction";
   kid.requestBook();
   cout << "\n===== Test Case2: AdultUser =====" << endl;
   AdultUser adult;
   adult.age=5;
   adult.registerAccount();
   adult.age=23;
   adult.registerAccount();
   adult.bookType="kids";
   adult.requestBook();
   adult.bookType="Fiction";
   adult.requestBook();
   return 0;
}