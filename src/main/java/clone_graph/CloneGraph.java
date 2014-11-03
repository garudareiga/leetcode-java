package clone_graph;

/**
 * 
 * @author raychen
 * 
 * Problem:
 * Clone an undirected graph. Each node in the graph contains a label and a 
 * list of its neighbors.
 *  
 * OJ's undirected graph serialization:
 * Nodes are labeled uniquely.
 *  
 * We use # as a separator for each node, and , as a separator for node label 
 * and each neighbor of the node.
 * 
 * As an example, consider the serialized graph {0,1,2#1,2#2,2}.
 *  
 * The graph has a total of three nodes, and therefore contains three parts as 
 * separated by #.
 * 
 * First node is labeled as 0. Connect node 0 to both nodes 1 and 2.
 * Second node is labeled as 1. Connect node 1 to node 2.
 * Third node is labeled as 2. Connect node 2 to node 2 (itself), thus forming 
 * a self-cycle.
 * 
 * Visually, the graph looks like the following:

       1
      / \
     /   \
    0 --- 2
         / \
         \_/
 */

import java.util.*;

public class CloneGraph {  
    /**
     * Definition for undirected graph.
     */
    class UndirectedGraphNode {
        int label;
        ArrayList<UndirectedGraphNode> neighbors;
        UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
    };
        
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        //return cloneGraphBFS(node);
        return cloneGraphDFS(node);
    }
    
    public UndirectedGraphNode cloneGraphBFS(UndirectedGraphNode node) {
        if (node == null) return node;
        
        HashMap<UndirectedGraphNode, UndirectedGraphNode> hm = new 
                HashMap<UndirectedGraphNode, UndirectedGraphNode>();
                
        UndirectedGraphNode rNode, newNode, newNeighbor;
        
        rNode = new UndirectedGraphNode(node.label);
        hm.put(node,  rNode);
                
        Queue<UndirectedGraphNode> q = new LinkedList<UndirectedGraphNode>();
        q.add(node);
        while (!q.isEmpty()) {
            node = q.poll();
            newNode = hm.get(node);
            for (UndirectedGraphNode neighbor : node.neighbors) {
                if (hm.containsKey(neighbor)) {
                    // neighbor already visited
                    newNeighbor = hm.get(neighbor);
                } else {
                    // neighbor first time visited
                    q.add(neighbor);
                    newNeighbor = new UndirectedGraphNode(neighbor.label);
                    hm.put(neighbor, newNeighbor);
                }
                newNode.neighbors.add(newNeighbor);
            }
        }
        return rNode;
    }
    
    public UndirectedGraphNode cloneGraphDFS(UndirectedGraphNode node) {
        if (node == null) return node;
        
        HashMap<UndirectedGraphNode, UndirectedGraphNode> hm = new 
                HashMap<UndirectedGraphNode, UndirectedGraphNode>();
        
        UndirectedGraphNode newNode = new UndirectedGraphNode(node.label);
        hm.put(node, newNode);
        
        clone_graph_dfs(node, newNode, hm);
        return newNode;
    }
    
    private void clone_graph_dfs(UndirectedGraphNode node, UndirectedGraphNode newNode,
            HashMap<UndirectedGraphNode, UndirectedGraphNode> hm) {
        for (UndirectedGraphNode neighbor : node.neighbors) {
            if (hm.containsKey(neighbor)) {
                newNode.neighbors.add(hm.get(neighbor));
            } else {
                UndirectedGraphNode newNeighbor = new UndirectedGraphNode(neighbor.label);
                newNode.neighbors.add(newNeighbor);
                hm.put(neighbor, newNeighbor);
                clone_graph_dfs(neighbor, newNeighbor, hm);
            }
        }
    }
}
