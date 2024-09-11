/*input= number of nodes,number of edges and weights.
ex-
Input:
4
3
0 1 2
1 2 3
2 3 4
Output:
original:
0 2 i i
2 0 3 i
i 3 0 4
i i 4 0
shortest path:
0 2 5 9
2 0 3 7
5 3 0 4 
9 7 4 0  
*/
#include <iostream>
using namespace std;
const int INF=999;
const int MAX_SIZE=100;

void floydwarshal(int graph[][MAX_SIZE],int v){
    int dist[MAX_SIZE][MAX_SIZE];
    for(int i=0;i<v;i++){
        for(int j=0;j<v;j++){
            dist[i][j]=graph[i][j];
        }
    }
    for(int k=0;k<v;k++){
        for(int i=0;i<v;i++){
            for(int j=0;j<v;j++){
                if(dist[i][k]!=INF && dist[k][j]!=INF && dist[i][k]+dist[k][j]<dist[i][j]){
                    dist[i][j]=dist[i][k]+dist[k][j];
                }
            }
        }
    }
    //PRINTING SHORTEST PATH MATRIX
    for(int i=0;i<v;i++){
        for(int j=0;j<v;j++){
            if(dist[i][j]==INF){
                cout<<"INF";
            }
            else{
                cout<<dist[i][j]<<" ";
            }
        }
        cout<<endl;
    }
}
int main(){
    int v;
    cin>>v;
    int e;
    cin>>e;
    int graph[MAX_SIZE][MAX_SIZE];
    for(int i=0;i<v;i++){
        for(int j=0;j<v;j++){
            if(i==j){
                graph[i][j]=0;
            }
            else{
                graph[i][j]=INF;
            }
        }
    }
    int start,end,value;
    for(int i=0;i<e;i++){
        cin>>start>>end>>value;
        graph[start][end]=value;
        graph[end][start]=value;
    }
    cout<<"Original Matrix:"<<endl;
    for(int i=0;i<v;i++){
        for(int j=0;j<v;j++){
            if(graph[i][j]==INF){
                cout<<"INF";
            }
            else{
                cout<<graph[i][j]<<" ";
            }
        }
        cout<<endl;
    }
    cout<<endl;
    cout<<"Shortest path matrix:"<<endl;
    floydwarshal(graph,v);
    return 0;
}