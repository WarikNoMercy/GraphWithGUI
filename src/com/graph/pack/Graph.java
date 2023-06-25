package com.graph.pack;

import javax.swing.*;
import java.awt.*;

class Vertex{
	private char label;
	
	public Vertex(char label) {
		this.label = label;
	}
	public char getLabel() {
		return label;
	}
}

class Edge{
	
	private Vertex startEdge;
	private Vertex endEdge;
	
	public Edge(Vertex startEdge, Vertex endEdge) {
		this.startEdge  = startEdge;
		this.endEdge = endEdge;
	}
	
	public Edge(char startEdge, char endEdge) {
		Vertex start = new Vertex(startEdge);
		Vertex end = new Vertex(endEdge);
		this.startEdge = start;
		this.endEdge = end;
	}
}

class Graph{

	private Vertex vertexArr[];
	private Edge edgesArr[];
	
	public void addEdges(Edge edgesArr[]) {
		this.edgesArr = edgesArr;
	}
	
	public void addVertexes(Vertex vertexArr[]) {
		this.vertexArr = vertexArr;
	}
	
	public void displayVertex() {
		for (Vertex v : vertexArr) {
			System.out.println(v.getLabel());
		}
	}

}
