#include <iostream>
using namespace std;
#define MAX_VERTICES 100
class graph{
    public:
    bool visited[MAX_VERTICES];
    int adj[MAX_VERTICES][MAX_VERTICES];
    void addEdge(int v,int w);
    void dfs(int v);
};
void graph::addEdge(int v,int w){
    adj[v][w]=1;
}
void graph::dfs(int v){
    visited[v]=true;
    cout<<v<<" ";
    for(int i=0;i<MAX_VERTICES;i++){
        if(adj[v][i]==1 && !visited[i]){
            dfs(i);
        }
    }
}
int main(){
    int n,e;
    cin>>n>>e;
    graph g;
    int v,w;
    for(int i=0;i<e;i++){
        cin>>v>>w;
        g.addEdge(v,w);
    }
    int startVertex;
    cin>>startVertex;
    g.dfs(startVertex);
    return 0;
}