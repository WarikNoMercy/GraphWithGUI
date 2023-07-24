package com.graph.pack;

import javax.swing.*;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class GraphPanel extends JPanel{
	
	Graph graph;
	Map<Character,int[]> label_coords = new HashMap<>();
	
	public GraphPanel(Graph graph) {
		this.graph = graph;
		int min = 50;  
		int max = 250;  
		Vertex vertexArr[] = graph.getVertexArr();
		Edge edgesArr[] = graph.getEdgesArr();
		
		for (Vertex v : vertexArr) {
			char t = v.getLabel();
			int coords[] = new int[2];
			int coord1 = (int)(Math.random()*(max-min+1)+min);
			int coord2 = (int)(Math.random()*(max-min+100) + min);
			coords[0] = coord1;
			coords[1] = coord2;
			label_coords.put(t, coords);
		}
		
	}
	
	public void paintComponent(Graphics g) {
		Edge edgesArr[] = graph.getEdgesArr();
		Graphics2D g2 = (Graphics2D) g;
		g2.setStroke(new BasicStroke(5));
		g.setFont(new Font("Serif",Font.BOLD,15));
		for(Edge e : edgesArr) {
			Vertex v1 = e.getStartEdge();
			Vertex v2 = e.getEndEdge();
			int c_v1[] = label_coords.get(v1.getLabel());
			int c_v2[] = label_coords.get(v2.getLabel());
			
			//Circle
			g.setColor(Color.BLACK);
			g.fillOval(c_v1[0] - 10, c_v1[1] - 10, 20, 20);
			g.fillOval(c_v2[0] - 10, c_v2[1] - 10, 20, 20);
			
			
			//Edge
			g.setColor(Color.BLACK);
			g.drawLine(c_v1[0],c_v1[1],c_v2[0],c_v2[1]);
			
			//Label
			g.setColor(Color.YELLOW);
			g.drawString(String.valueOf(v1.getLabel()),c_v1[0] - 3,c_v1[1] + 4);
			g.drawString(String.valueOf(v2.getLabel()),c_v2[0] - 3,c_v2[1] + 4);
			
		}
	}
	
}