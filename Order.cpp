#include <stdio.h>

// Computation of the total price without reduction

float priceComputing(float ApplePrice, float OrangePrice, char TheOrder[], int OrderList){
    float total = 0;
    
	for(int i = 0; i < OrderList; i++ )   
      if (TheOrder[i] == 'a')
        total += ApplePrice;
      else if (TheOrder[i] == 'o') 
	          total += OrangePrice;
	    else printf("Unkowen order ! The order have to be 'a' or 'o' !");
	return total;
  }

// Computation of the total price with reduction

float priceComputingReduction(float ApplePrice, float OrangePrice, char TheOrder[], int OrderList, int AppleReduction, int OrangeReduction){
    float total;
    int apple = 0, orange = 0;
    
	for(int i = 0; i < OrderList; i++ )   
      if (TheOrder[i] == 'a')
		  ++apple;    
      else if (TheOrder[i] == 'o')
		      ++orange;   
	       else printf("Unkowen order ! The order have to be 'a' or 'o' !");
	
	apple -= (int)(apple/AppleReduction);
	orange -= (int)(orange/OrangeReduction);
	
	total = apple*ApplePrice;
	total += orange*OrangePrice;
	
	return total;
  }
  
// The main program which catch data and display results

int  main(){
  char order[100], choice = 'y', tata;
  int number = 0;
  
  while (choice == 'y'){
   	printf("%s", "\n\nGive first your order, please [(a)pple)/(o)range)] : ");
    scanf("%c", order+number); 

    number++;
    printf("%s", "\nWould you want to continue (y/n): ");
    scanf("%c", &tata);
    scanf("%c", &choice);
    scanf("%c", &tata);
  }
  
  printf("%s", "\n\nYour order is : ");
  for (int i = 0; i < number; i++)	
    printf("%c ", order[i]);	
    
  //The price without reduction
  printf("\n\nThe total price without reduction is : %.2f", priceComputing(0.60, 1.25, order, number));
    
  // The price with reduction
  printf("\n\nThe total price with reduction is : %.2f", priceComputingReduction(0.60, 1.25, order, number, 2, 3));
 
  return 0;
}

