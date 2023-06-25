package com.graph.pack;

public class Main {
	public static void main(String[] args) {
		Graph g1 = new Graph();
		
		char [] vertexes = {'1','2','5','3'};
		
		Vertex verArr[]=new Vertex[4];
		int i = 0;
		for (char v : vertexes) {
			Vertex v1 = new Vertex(v);
			verArr[i] = v1;
			i++;
		}

		g1.addVertexes(verArr);
		g1.displayVertex();
	}
}