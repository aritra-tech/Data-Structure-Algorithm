#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
#include <ctype.h>

char stack[100000];
int top=-1;

int priority(char ch)
{
    if(ch=='+' || ch=='-')              return 1;
    if(ch=='*' || ch=='/' || ch=='%')   return 2;
    return 0;
}

void push(char ch)
{
    stack[++top] = ch;
}

char pop()
{
    return top==-1 ? -1 : stack[top--];
}

int main() 
{
    char str[100],ch;
    scanf("%s",str);
    int i = -1;
    while(str[++i])
    {
        if(isalnum(str[i]))     printf("%c",str[i]);
        else if(str[i] == '(')  push(str[i]);
        else if(str[i] == ')')
        {
            while((ch=pop())!='(')    printf("%c",ch);
        }
        else
        {
            while(priority(stack[top]) >= priority(str[i]))     printf("%c",pop());
            push(str[i]);
        }
    }
    while(top != -1)    printf("%c",pop());
    return 0;
}