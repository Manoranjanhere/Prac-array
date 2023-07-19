#include <stdio.h> 
struct car{
char name;  int seats;  float price;
}; //end structure car

int main()
{
struct car myCar; //define struct variable
myCar.name = "Renault";
myCar.price = 500000;
myCar.seats = 2;
printf("%s %f %d \n", myCar.name,
myCar.price, myCar.seats);
} //end main
