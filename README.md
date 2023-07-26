# GraphWithGUI
[Название проекта]

## Description

This project implements Graph and displays it in window.

## How to use it

In this piece of code from Main file we can see example of creating graph.
We create array of vertexes and edges, then add them in our graph.
Our vertex class has label which we can set in constuctor.
Edge class takes two vertexes in parameters.

'''
Graph g1 = new Graph();
char [] vertexes = {'1','2','5','4'};
Vertex verArr[] = new Vertex[4];
Edge edgeArr[] = new Edge[4];
int i = 0;
for (char v : vertexes) {
  Vertex v1 = new Vertex(v);
	verArr[i] = v1;
  i++;
}
Edge ed1 = new Edge(verArr[0],verArr[1]);
Edge ed2 = new Edge(verArr[1],verArr[2]);
Edge ed3 = new Edge(verArr[0],verArr[3]);
Edge ed4 = new Edge(verArr[2],verArr[3]);
edgeArr[0] = ed1;
edgeArr[1]= ed2;
edgeArr[2] = ed3;
edgeArr[3]= ed4;
g1.addVertexes(verArr);
g1.addEdges(edgeArr);
'''

## Functions

### Vertex
getLabel : return label of vertex

### Edge
getStartEdge : return start of edge

getEndEdge : return end of edge

### Graph
getVertexArr : return array of vertexes

getEdgesArr : return array of edges

addVertexes : take from parameter array of vertexes, afterward set it in graph

addEdges : take from parameter array of Edges, afterward set it in graph

printVertex : display all vertexes in console

printEdges : display all edges in console

