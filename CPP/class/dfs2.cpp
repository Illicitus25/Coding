/*
Input:
4 6 i.e. vertices, edges
0 1
0 2 
0 3
2 0
2 1
1 3
2 3i.e. source and destination
Output:
2 0 1 3
2 0 3
2 1 3
*/
#include <iostream>
using namespace std;
class graph{
    int v;
    int** adj;

    void printAllPathsUtil(int,int,bool[],int[],int&);
    public:
    graph(int v);
    void addEdge(int u,int v);
    void printAllPaths(int s,int d);
};
graph::graph(int v){
    this->v=v;
    adj=new int*[v];
    for(int i=0;i<v;i++){
        adj[i]=new int[v];
        for(int j=0;j<v;j++){
            adj[i][j]=0;
        }
    }
}
void graph::addEdge(int u,int v){
    adj[u][v]=1;
}
void graph::printAllPaths(int s,int d){
    bool* visited =new bool[v];
    int* path=new int[v];
    int path_index=0;
    for(int i=0;i<v;i++){
        visited[i]=false;
    }
    printAllPathsUtil(s,d,visited,path,path_index);
}
void graph::printAllPathsUtil(int u,int d,bool visited[],int path[],int& path_index){
    visited[u]=true;
    path[path_index]=u;
    path_index++;
    if(u==d){
        for(int i=0;i<path_index;i++){
            cout<<path[i]<<" ";
        }
         cout<<endl;
    }
    else{
        for(int i=0;i<v;i++){
            if(adj[u][i]&& !visited[i]){
                printAllPathsUtil(i,d,visited,path,path_index);
            }
        }
    }
    path_index--;
    visited[u]=false;
}
int main(){
    int v,e;
    cin>>v>>e;
    graph g(v);
    for(int i=0;i<e;i++){
        int u,V;
        cin>>u>>V;
        g.addEdge(u,V);
    }
    int s,d;
    cin>>s>>d;
    cout<<"Ouput:"<<endl;
    g.printAllPaths(s,d);
    return 0;
}