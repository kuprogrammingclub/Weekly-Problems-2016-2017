#include "stdio.h"
#define MAXWORDLEN 255

int valid(char c);
void weightWord(char* word);

int main(void)
{
	char word [MAXWORDLEN];
	int stillGoing = 1;
	while ( stillGoing )
	{
	printf("\nGive me a word:   ");
	fgets(word, MAXWORDLEN, stdin);
	weightWord(word);
	printf("\nAnother?  (y/n):   ");
	stillGoing = ( 'n' != getchar() );
	getchar();
	}
}

int valid(char c)
{
	return ( ( c > 64 ) && ( c < 91 ) ||
		 ( c > 96 ) && ( c < 123 )
	       );
}

void weightWord(char* word)
{
	char* c = word;
	int LCThresh = 97;	// ascii value lowercase alpha
	int UCThresh = 65;	// ascii value uppercase alpha
	int value = 0;
	while ( '\0' != (*c)  )
	{
	if ( valid ( *c ) )
	{
	value += ( ( *c ) - LCThresh  < 0 ) ?
		 ( *c + 1 - UCThresh )      : // uppercase letter
		 ( *c + 1 - LCThresh );       // lowercase letter
	}
	c++;
	}
	printf("\nThat word is worth %d\n", value);
}
