package com.graph.pack;

import java.awt.*;

import javax.swing.*;

public class Main {
	public static void main(String[] args) {
		Graph g1 = new Graph();
		
		char [] vertexes = {'1','2','5'};
		
		Vertex verArr[]=new Vertex[3];
		Edge edgeArr[]=new Edge[3];
		int i = 0;
		for (char v : vertexes) {
			Vertex v1 = new Vertex(v);
			verArr[i] = v1;
			i++;
		}
		Edge ed1 = new Edge(verArr[0],verArr[1]);
		Edge ed2 = new Edge(verArr[1],verArr[2]);
		Edge ed3 = new Edge(verArr[0],verArr[2]);
		edgeArr[0] = ed1;
		edgeArr[1]= ed2;
		edgeArr[2] = ed3;
		g1.addVertexes(verArr);
		g1.addEdges(edgeArr);
		g1.displayEdges();
		g1.displayVertex();
		JFrame frame = new JFrame("Lines");
		frame.setSize(400,400);
		frame.setLocation(0,0);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new GraphPanel(g1));
		frame.setVisible(true);
		//g1.addVertexes(verArr);
		//g1.displayVertex();
	}
}