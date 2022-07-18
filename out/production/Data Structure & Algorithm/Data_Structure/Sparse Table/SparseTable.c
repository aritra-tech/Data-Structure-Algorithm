#include<stdio.h> 
  
int main() 
{ 
    
    int sparseTable[100][100],rows,columns; 
    printf("Enter number of rows and columns of sparse Table:\n");
    scanf("%d%d",&rows,&columns);
    printf("Enter the elemnts of a spare Table:\n ");
    for(int i=0; i<rows;i++)
    {
        for(int j=0; j<columns;j++)
        {
           printf("Element[%d][%d]:",i,j);
           scanf("%d",&sparseTable[i][j]);
        }
    }    
    
    
  
    int size = 0; 
    for (int i = 0; i < 4; i++) 
    {
        for (int j = 0; j < 5; j++)
        {
            if (sparseTable[i][j] != 0) 
            {
                size++; 
            }
        }
    }    
 
    int resultant_Table[size][3]; 
  
    
    int k = 0; 
    for (int i = 0; i < rows; i++) 
    {
        for (int j = 0; j < columns; j++) 
        {
            if (sparseTable[i][j] != 0) 
            { 
                resultant_Table[k][0] = i; 
                resultant_Table[k][1] = j; 
                resultant_Table[k][2] = sparseTable[i][j]; 
                k++; 
            } 
        }
    }
  
  printf("---------------Original sparse Table:----------------\n");
      for(int i=0; i<rows;i++)
    {
        for(int j=0; j<columns;j++)
        {
           printf(" %d |",sparseTable[i][j]);
        }
        printf("\n");
    }    
    
    printf("-------------------Result:--------------\n ");
 printf(" Row  |  Column  | Element   |\n\n");  
    for (int i=0; i<size; i++) 
    { 
        for (int j=0; j<3; j++) 
        {
            printf("   %d     ", resultant_Table[i][j]); 
        }
  
        printf("\n"); 
    } 
    
    printf("\n\n --------------Code Written by-'VIKAS KUMAR'---------------------\n\n");
    return 0; 
} 

