import java.util.*;
class GraphQuestion{

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

    graph[0].add(new Edge(0,1));
    graph[0].add(new Edge(0,2));

    graph[1].add(new Edge(1,0));
    graph[1].add(new Edge(1,3));

    graph[2].add(new Edge(2,0));
    graph[2].add(new Edge(2,4));

    graph[3].add(new Edge(3,1));
    graph[3].add(new Edge(3,4));
    graph[3].add(new Edge(3,5));

    graph[4].add(new Edge(4,2));
    graph[4].add(new Edge(4,3));
    graph[4].add(new Edge(4,5));

    graph[5].add(new Edge(5,4));
    graph[5].add(new Edge(5,3));
    graph[5].add(new Edge(5,6));
    

    graph[6].add(new Edge(6,5));

}

void bfs(ArrayList<Edge> graph [],int start,boolean vis []){
    Queue<Integer> q=new LinkedList <>();
    q.add(start);
    // boolean vis [] = new boolean [v];

      while(!q.isEmpty()){
            int curr=q.remove();
              
            if(vis[curr]==false){
                System.out.print(curr +" ");
                vis[curr]=true;
                    
                for(int i=0;i<graph[curr].size();i++){
                        Edge e=graph[curr].get(i);
                        q.add(e.dest);
                    }
               }
      }
  
}

void dfs(ArrayList<Edge> graph [],boolean visi [],int curr){
    System.out.print(curr +" ");
    visi[curr]=true;

    for(int i=0;i<graph[curr].size();i++){
        Edge e=graph[curr].get(i);
            if(visi[e.dest]==false){
                dfs(graph,visi,e.dest);
            }
    }
}

void printPath(ArrayList<Edge> graph [],boolean visit [],int curr,int tar,String path){
  
    if(curr==tar){
        System.out.println(path);
        return;
    }

    for(int i=0;i<graph[curr].size();i++){
        Edge e =graph[curr].get(i);
        if(visit[e.dest]==false){
            visit[curr]=true;
            printPath(graph, visit, e.dest, tar, path+e.dest);
            visit[curr]=false;        }
    }


}

boolean checkCircle(ArrayList<Edge> graph [],int curr,boolean visite [],int par){

    visite[curr]=true;
    
    for(int i=0;i<graph[curr].size();i++){
        Edge e=graph[curr].get(i);

        if(visite[e.dest]==true && e.dest !=par){
            return true;
        }
        else if(visite [e.dest]==false){
            if(checkCircle(graph, e.dest, visite, curr)){
                return true;
            }
        }
    }

    return false;

}

void topsortUtil(ArrayList<Edge> graph [],boolean vis [],int curr,Stack<Integer> stack){

    vis[curr]=true;

    for (int i = 0; i < graph[curr].size(); i++) {
        Edge e=graph[curr].get(i);

        if(vis[e.dest]=false){
         topsortUtil(graph, vis, e.dest, stack);
        }
        
    }
    stack.push(curr);


}

void topsort(ArrayList<Edge> graph [],int v){

    Stack <Integer> stack=new Stack<>();
    boolean vis [] =new boolean[v];
    for(int i=0;i<v;i++) {
        if(vis[i]==false){
            topsortUtil(graph, vis, i, stack);
        }
    }

while(!stack.isEmpty()){
    System.out.print(stack.pop ()+ " ");
}

}



    public static void main (String [] args){

int v=7;
// int array[]=new int [];
ArrayList<Edge> graph []=new ArrayList [v];

GraphQuestion q=new GraphQuestion();
q.CreateGraph(graph);

// Print arrayList
for(int i=0;i<graph[4].size();i++){
    Edge e=graph[4].get(i);
    System.out.println("From "+e.src+" To "+e.dest) ;
}

// BFS
System.out.println("BFS travesal : ");
    boolean vis [] = new boolean [v];
    for(int i=0;i<v;i++){
    if(vis[i]==false)
        q.bfs(graph,i,vis);
}

// DFS
System.out.println("\n DFS travesal : ");
    boolean visi [] = new boolean [v];
    for(int i=0;i<v;i++){
    if(visi[i]==false)
        q.dfs(graph,visi,i);
}

// Print all paths
System.out.println("\n  Printing all possible paths : ");
//boolean visit []=new boolean[v];
q.printPath(graph, new boolean [v], 0, 5, "0");

// Check circular graph
System.out.println(q.checkCircle(graph,0,new boolean[v],-1));

// TOP SORTING
q.topsort(graph,v);
    }
}