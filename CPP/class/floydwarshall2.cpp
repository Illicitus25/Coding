/*
Input:
4 
0 1 5 -1
-1 0 3 -1
-1 -1 0 2
-1 -1 -1 0
Output:
0 1 4 6
-1 0 3 5

*/
#include <iostream>
#include <climits>
using namespace std;
void warshallShoertestPath(int** graph,int numVertices){
    int** shortestPath = new int*[numVertices];
    for(int i=0;i<numVertices;i++){
        shortestPath[i]=new int[numVertices];
        for(int j=0;j<numVertices;j++){
            shortestPath[i][j]=graph[i][j];
            if(shortestPath[i][j]==-1&&i!=j){
                shortestPath[i][j]=-1;
            }
        }
    }
    for(int k=0;k<numVertices;k++){
        for(int i=0;i<numVertices;i++){
            for(int j=0;j<numVertices;j++){
                if(shortestPath[i][k]!=-1 && shortestPath[k][j]!=-1){
                    int newDistance=shortestPath[i][k]+shortestPath[k][j];
                if(shortestPath[i][k]==-1 || newDistance<shortestPath[i][j])
                    shortestPath[i][j]=newDistance;
                }
            }
        }
    }
    //PRINTING
    for(int i=0;i<numVertices;i++){
        for(int j=0;j<numVertices;j++){
            if(shortestPath[i][j]==-1){
                cout<<"-1";
            }
            else{
                cout<<shortestPath[i][j]<<" ";
            }
        }
        cout<<endl;
    }
    for(int i=0;i<numVertices;i++){
        delete[] shortestPath[i];
    }
    delete[] shortestPath;
}
int main(){
    int numVertices;
    cin>>numVertices;

    int** graph=new int*[numVertices];
    for(int i=0;i<numVertices;i++){
        graph[i]=new int[numVertices];
        for(int j=0;j<numVertices;j++){
            cin>>graph[i][j];
        }
    }
    warshallShoertestPath(graph,numVertices);
    for(int i=0;i<numVertices;i++){
        delete[]graph[i];
    }
    delete[] graph;
    return 0;
}