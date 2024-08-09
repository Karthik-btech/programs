#include<stdio.h>
void printarray(int [],int);
void heapify(int a[],int n,int i)
{
	int largest=i;
	int left=2*i+1;
	int right=2*i+2;
	if(left<n && a[left]<a[largest])
		largest=left;
	if(right<n && a[right]<a[largest])
		largest=right;
	if(largest!=i)
	{
		int temp=a[i];
		a[i]=a[largest];
		a[largest]=temp;
		heapify(a,n,largest);
	}
}
void maxheap(int a[],int n)
{
	int i,temp;
	for(i=n/2-1;i>=0;i--)
		heapify(a,n,i);
}
void deletenode(int a[],int n,int key)
{
	int i,temp,flag=0;
	for(i=0;i<n;i++)
	{
		if(a[i]==key)
		{
			flag=1;
			break;
		}
	}
	if(flag==1)
	{
		a[i]=a[n-1];
		n--;
		for(i=n/2-i;i>=0;i--)
			heapify(a,n,i);
		printarray(a,n);
	}
	else
	printf("\n Element not found");
	getch();
}
void printarray(int arr[],int n)
{
		int i;
		for(i=0;i<n;i++)
		printf("%d ",arr[i]);
}
int main()
{
	int a[20],n,i,key;
	clrscr();
	printf("Enter size of an array\n");
	scanf("%d",&n);
	printf("Enter array elements\n");
	for(i=0;i<n;i++)
		scanf("%d",&a[i]);
	maxheap(a,n);
	printf("After maxheap construction array elements are\n");
	printarray(a,n);
	printf("Enter element to be deleted\n");
	scanf("%d",&key);
	deletenode(a,n,key);
	return 0;
}



