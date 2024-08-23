#include<stdio.h>
#include<conio.h>
int ad[20][20],visit[20],dfn[20],low[20],ap[20],parent[20];
int num=0,n,i;
void intialise();
int small(int,int);
void findap();
void DFS(int);
void main()
{
	int edges,u,v,i,j;
	printf("Enter number of vertices\n");
	scanf("%d",&n);
	printf("Enter number of edges");
	scanf("%d",&edges);
	for(i=0;i<edges;i++)
	{
		printf("Enter edges(u,v):");
		scanf("%d%d",&u,&v);
		ad[u][v]=1;
		ad[v][u]=1;
	}
	printf("\n The Adjancy Matrix is:\n");
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			printf("%d",ad[i][j]);
		}
		printf("\n");
	}
	intialise();
	findap();
	getch();
}
void intialise()
{
	int i;
	for(i=0;i<n;i++)
	{
		visit[i]=0;
		dfn[i]=0;
		low[i]=0;
		parent[i]=-1;
		ap[i]=0;
	}
}
int small(int a,int b)
{
	return a,b?a:b;
}
void DFS(int u)
{
	int v;
	int children=0;
	visit[u]=1;
	dfn[u]=low[u]=++num;
	for(v=0;v<n;v++)
	{
		if(ad[u][v]==1)
		{
			if(visit[v]==0)
			{
				children++;
				parent[v]=u;
				DFS(v);
				low[u]=small(low[u],low[v]);
				if(parent[u]==-1&&children>1)
					ap[u]=1;
				if(parent[u]!=-1&&low[v]>=dfn[u])
					ap[u]=1;
			}
				else if(v!=parent[u])
					small(low[u],dfn[v]);
		}
	}
}
void findap()
{
	int i;
	for(i=0;i<n;i++)
	{
		if(visit[i]==0)
			DFS(i);
	}
	printf("Articulation points in the graph are:\n");
	for(i=0;i<n;i++)
	{
		if(ap[i]==1)
			printf("%c",i+65);
	}
}


