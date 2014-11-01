package clone_graph;

/**
 * 
 * @author raychen
 * 
 *  Problem:
 *  Clone an undirected graph. Each node in the graph contains a label and a list of its neighbors.
 *  
 *  OJ's undirected graph serialization:
 *  Nodes are labeled uniquely.
 *  
 *  We use # as a separator for each node, and , as a separator for node label and each neighbor of the node.
 *  As an example, consider the serialized graph {0,1,2#1,2#2,2}.
 *  
 *  The graph has a total of three nodes, and therefore contains three parts as separated by #.
 *  First node is labeled as 0. Connect node 0 to both nodes 1 and 2.
 *  Second node is labeled as 1. Connect node 1 to node 2.
 *  Third node is labeled as 2. Connect node 2 to node 2 (itself), thus forming a self-cycle.
 *  Visually, the graph looks like the following:

       1
      / \
     /   \
    0 --- 2
         / \
         \_/
 */

import java.util.*;

public class CloneGraph {
    HashMap<UndirectedGraphNode, UndirectedGraphNode> prevToCurr = 
            new HashMap<UndirectedGraphNode, UndirectedGraphNode>();
    
    /**
     * Definition for undirected graph.
     */
    class UndirectedGraphNode {
        int label;
        ArrayList<UndirectedGraphNode> neighbors;
        UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
    };
        
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if (node == null)
            return null;
        
        LinkedList<UndirectedGraphNode> nodeLinkedList = new LinkedList<UndirectedGraphNode>();
        nodeLinkedList.addLast(node);
        
        HashSet<UndirectedGraphNode> visited = new HashSet<UndirectedGraphNode>();
        while (!nodeLinkedList.isEmpty()) {
            UndirectedGraphNode prev = nodeLinkedList.pollFirst();
            if (visited.contains(prev)) {
                continue;
            }
            
            visited.add(prev);
            
            UndirectedGraphNode curr = createOrGetNode(prev);
            for (UndirectedGraphNode prevNext : prev.neighbors) {
                UndirectedGraphNode currNext = createOrGetNode(prevNext);
                curr.neighbors.add(currNext);
                nodeLinkedList.addLast(prevNext);
            }
        }
        
        return prevToCurr.get(node);
    }
    
    UndirectedGraphNode createOrGetNode(UndirectedGraphNode prev) {
        if (prevToCurr.containsKey(prev)) {
            return prevToCurr.get(prev);
        } else {
            UndirectedGraphNode curr = new UndirectedGraphNode(prev.label);
            prevToCurr.put(prev, curr);
            return curr;
        }
    }
}
