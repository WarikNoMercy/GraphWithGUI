package com.graph.pack;

import javax.swing.*;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class GraphPanel extends JPanel{
	
	Graph graph;
	Map<Character,int[]> map = new HashMap<>();
	
	public GraphPanel(Graph graph) {
		this.graph = graph;
		int min = 100;  
		int max = 250;  
		//Map<Character,int[]> map = new HashMap<>();
		Vertex vertexArr[] = graph.getVertexArr();
		Edge edgesArr[] = graph.getEdgesArr();
		for (Vertex v : vertexArr) {
			char t = v.getLabel();
			int coords[] = new int[2];
			int coord1 = (int)(Math.random()*(max-min+1)+min);
			int coord2 = (int)(Math.random()*(max-min+50) + min);
			coords[0] = coord1;
			coords[1] = coord2;
			map.put(t, coords);
			//System.out.println(t + ": " + coord + "  " + coord);
		}
	}
	
	public void paintComponent(Graphics g) {
		Edge edgesArr[] = graph.getEdgesArr();
		for(Edge e : edgesArr) {
			Vertex v1 = e.getStartEdge();
			Vertex v2 = e.getEndEdge();
			int c_v1[] = map.get(v1.getLabel());
			int c_v2[] = map.get(v2.getLabel());
			g.setColor(Color.BLUE);
			g.drawLine(c_v1[0],c_v1[1],c_v2[0],c_v2[1]);
			System.out.println(v1.getLabel() + ": " + c_v1[0] +" " +  c_v1[1] + "  " + v2.getLabel() + ": " + c_v2[0] +" " +  c_v2[1]);
		}

		
		//drawLine:(x1,y1,x2,y2)
//		g.setColor(Color.GREEN);
//		g.drawLine(20,50,230,300);
	}
	
}