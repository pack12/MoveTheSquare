package edu.ycp.cs320.movethesquare.model;

public class Square {
	private double x, y, width, height;
	
	public Square() {
		
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public double getX() {
		return x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public double getY() {
		return y;
	}
	
	public void setWidth(double width) {
		this.width = width * 2;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setHeight(double height) {
		this.height = height * 2;
	}
	
	public double getHeight() {
		return height;
	}
}
