#include<conio.h>
#include<stdio.h>
int A[10][10],visited[10]={0},N;
void DFS(int v);
int connected_components()
{
	int v,count=0;
	printf("\n DFS Order is  \n");
	for(v=0;v<N;v++)
	{
		if(visited[v]==0)
		{
			DFS(v);
			count++;
		}
	}
	return (count);
}
void DFS(int v)
{
	int i;
	visited[v]=1;
	printf("%d",v);
	for(i=0;i<N;i++)
	{
		if(A[v][i]==1 && visited[i]==0)
		DFS(i);
	}
	getch();
}
int main()
{
	int i,j,c;
	clrscr();
	printf("Enter number of Vertices");
	scanf("%d",&N);
	for(i=0;i<N;i++)
	for(j=0;j<N;j++)
	scanf("%d",&A[i][j]);
	c=connected_components();
	printf("\n No of Connected components are %d",c);
	getch();
	return 0;
}