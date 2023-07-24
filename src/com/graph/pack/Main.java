package com.graph.pack;

import java.awt.*;

import javax.swing.*;

public class Main {
	public static void main(String[] args) {
		
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
		g1.printEdges();
		g1.printVertex();
		JFrame frame = new JFrame("Graph");
		frame.setSize(400,400);
		frame.setLocation(0,0);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new GraphPanel(g1));
		frame.setVisible(true);
		//g1.addVertexes(verArr);
		//g1.displayVertex();
	}
}