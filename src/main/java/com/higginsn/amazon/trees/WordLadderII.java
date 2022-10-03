package com.higginsn.amazon.trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/**
 * https://leetcode.com/explore/interview/card/amazon/78/trees-and-graphs/483/
 */
public class WordLadderII {

    // key: word, value: list of words "adjacent" to key
    private Map<String, List<String>> wordGraph = new HashMap<>();
    private List<List<String>> shortestPaths = new ArrayList<>();
    /**
     * Given two words and a dictionary, this method returns all the shortest transformation sequences
     * from the beginWord to the endWord. If no such sequence exists, this method returns an empty list.
     */
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        Set<String> dictionary = new HashSet<>(wordList);
        if (!dictionary.contains(endWord)) {
            return shortestPaths;
        }

        initializeGraph(beginWord, dictionary);

        List<String> currentPath = new ArrayList<>();
        currentPath.add(beginWord);
        findPath(currentPath, endWord);

        return shortestPaths;
    }

    private void findPath(List<String> currentPath, String endWord) {
        String endOfCurrentPath = currentPath.get(currentPath.size() - 1);
        if (endOfCurrentPath.equals(endWord)) {
            List<String> tempPath = new ArrayList<>(currentPath);
            shortestPaths.add(tempPath);
        }

        List<String> edges = wordGraph.getOrDefault(endOfCurrentPath, Collections.emptyList());
        for (String edge : edges) {
            currentPath.add(edge);
            findPath(currentPath, endWord);
            currentPath.remove(currentPath.size() - 1);
        }
    }

    /**
     * Constructs a directed, acyclic graph representing the provided word list. The root node
     * is set to the beginWord. Edges are added to new nodes that represent "neighbors", where a
     * neighbor is defined as a single transformation away from the previous node (e.g. "log" -> "cog").
     */
    private void initializeGraph(String beginWord, Set<String> remainingWords) {
        Queue<String> bfs = new LinkedList<>();
        bfs.add(beginWord);
        remainingWords.remove(beginWord);

        while (!bfs.isEmpty()) {
            // Visited set represents nodes evaluated at a particular tree depth. We do not want to add
            // the same node to multiple depths of the tree. However, multiple nodes in layer n-1 might
            // have an edge to a new node in this set, so it is tracked here rather than the outer loop.
            Set<String> visited = new HashSet<>();
            for (int i = bfs.size() - 1; i >= 0; i--) {
                String node = bfs.poll();
                List<String> neighbors = findNeighbors(node, remainingWords);
                for (String neighbor : neighbors) {
                    if (remainingWords.contains(neighbor)) {
                        // Add edges to previous node
                        List<String> edges = wordGraph.computeIfAbsent(node, x -> new ArrayList<>());
                        edges.add(neighbor);

                        if (!visited.contains(neighbor)) {
                            // Add all new nodes to BFS so their children can be computed
                            bfs.add(neighbor);
                        }
                        visited.add(neighbor);
                    }
                }
            }
            remainingWords.removeAll(visited);
        }
    }

    private List<String> findNeighbors(String node, Set<String> remainingWords) {
        List<String> neighbors = new ArrayList<>();
        char[] listOfChar = node.toCharArray();

        for (int i = 0; i < node.length(); i++) {
            char oldChar = listOfChar[i];

            for (char c = 'a'; c <= 'z'; c++) {
                listOfChar[i] = c;
                if (c == oldChar) {
                    // Skip repeating words to avoid infinite loop
                    continue;
                }

                String newWord = String.valueOf(listOfChar);
                if (remainingWords.contains(newWord)) {
                    neighbors.add(newWord);
                }
            }

            // Reset changed char before moving on to the next index
            listOfChar[i] = oldChar;
        }

        return neighbors;
    }





//    public List<List<String>> findLadder(String beginWord, String endWord, List<String> wordList) {
//        initializeGraph(wordList);
//        List<List<String>> result = new ArrayList<>();
//
//        if (!wordGraph.containsKey(beginWord) || !wordGraph.containsKey(endWord)) {
//            return result;
//        }
//
//        // In order to find the shortest sequence, we should apply BFS to the graph
//        Queue<List<String>> queue = new LinkedList<>();
//        Set<String> visited = new HashSet<>();
//        int depth = 1;
//        boolean solutionFound = false;
//        queue.add(Arrays.asList(beginWord));
//        while ((!queue.isEmpty() && result.isEmpty()) {
//            // temp queue. This is separate b/c we want to distinguish "levels" in the search
//            Queue<List<String>> temp = new LinkedList<>();
//
//            while(!queue.isEmpty()) {
//                List<String> candidate = queue.poll();
//                String node = candidate.get(candidate.size() - 1);
//                if (visited.contains(node)) {
//                    continue;
//                }
//                List<String> edges = wordGraph.get(node);
//                for (String edge : edges) {
//
//                }
//
//            }
//
//            queue = temp;
//        }
//        return result;
//    }
//
//    private void initializeGraph(List<String> wordList) {
//        for (String node : wordList) {
//            List<String> adjacentNodes = new ArrayList<>();
//            for (String word : wordList) {
//                if (isAdjacent(node, word)) {
//                    adjacentNodes.add(word);
//                }
//            }
//            wordGraph.put(node, adjacentNodes);
//        }
//    }
//
//    private boolean isAdjacent(String node, String edge) {
//        if (node.length() != edge.length()) {
//            return false;
//        }
//
//        int numDiff = 0;
//        for (int i = 0; i < node.length(); i++) {
//            for (int j = 0; j < edge.length(); j++) {
//                if (node.charAt(i) != edge.charAt(j)) {
//                    numDiff++;
//                }
//            }
//        }
//        return numDiff == 1;
//    }
}
