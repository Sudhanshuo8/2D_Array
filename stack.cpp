#include <iostream>
using namespace std;

int stack[5];
static int count;

   int isfull()
   {
        if(count==5)
       {
         return 0;
       }
         return 1;
   }

   void push(int element)
   {
     int res=isfull();
         if(res==0)
           {
             cout<<"\n stack is full "<<endl;
           }
         else
           {
             stack[count]=element;
             cout<<"\n pushed element is :"<<stack[count];
              count++;
           }
   }

   int isempty()
   {
      if(count==0)
       {
         return 0;
       }
         return 1;
   }


   void pop()
   {
     int res=isempty();
        if(res==0)
         {
           cout<<"\n stack is empty "<<endl;
         }
        else
         {
		count--;
         cout<<"\n popped element is :"<<stack[count];
          }
   }



int main()
{
	push(20);
	push(50);
	push(60);
	push(80);
	push(90);
	push(10);
        push(30);
       cout<<"Removing the elements";
    
	pop();
	pop();
	pop();
	pop();
	pop();
	pop();
return 0;
}
        
