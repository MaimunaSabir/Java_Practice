import java.util.*;
class circularGraph{
        class Edge{

    int src;
    int dest;
    //int wt

Edge(int s,int d){
    this.src=s;
    this.dest=d;
   // this.wt=w;
}

}
void CreateGraph(ArrayList<Edge> graph []){

    for(int i=0;i<graph.length;i++){
        graph[i]=new ArrayList<>();
    }

    graph[0].add(new Edge(0,2));

    graph[1].add(new Edge(1,0));

    graph[2].add(new Edge(2,3));

    graph[3].add(new Edge(3,0));
}

boolean directedGraph (ArrayList<Edge> graph [],int curr,boolean vis [],boolean rec []){
    vis[curr]=true;
    rec[curr]=true;

for(int i=0;i<graph[curr].size();i++){
    Edge e=graph[curr].get(i);

    if(rec[e.dest]){
        return true;
    }
    else if(vis[e.dest]==false){
        if(directedGraph(graph, e.dest, vis, rec)){
            return true;
        }
    
}
    }

    rec[curr]=false;
    return false;

} 



    public static void main (String [] args){
    
 int v=4;
// int array[]=new int [];
ArrayList<Edge> graph []=new ArrayList[v];

circularGraph q=new circularGraph();
q.CreateGraph(graph);

boolean vis []= new boolean [v];
boolean rec []= new boolean [v];
for (int i = 0; i < v; i++) {
    if (vis[i]==false) {

        boolean cycle=q.directedGraph(graph,i,vis,rec);
       System.out.println(cycle);
       break;


   
    }


    }
}
}



