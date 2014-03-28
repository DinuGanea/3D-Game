package net.bestwebart.game.util;

import java.awt.Rectangle;

public class ViewWindow {
    
    private Rectangle bounds;
    private float angle;
    private float distanceToCamera;
    
    public ViewWindow(int left, int top, int width, int height, float angle) {
	bounds = new Rectangle();
	this.angle = angle;
	setBounds(left, top, width, height);
    }
    
    public void setBounds(int left, int top, int width, int height) {
	bounds.x = left;
	bounds.y = top;
	bounds.width = width;
	bounds.height = height;
	distanceToCamera = (float) (bounds.width / 2 / Math.tan(angle / 2));
    }
    
    public void setAngle(float angle) {
	this.angle = angle;
	distanceToCamera = (float) (bounds.width / 2 / Math.tan(angle / 2));
    }
    
    public float getAngle() {
	return angle;
    }
    
    public float getDistanceToCamera() {
	return distanceToCamera;
    }
    
    public int getLeftOffset() {
	return bounds.x;
    }
    
    public int getTopOffset() {
	return bounds.y;
    }
    
    public int getWidth() {
	return bounds.width;
    }
    
    public int getHeight() {
	return bounds.height;
    }
    
    public float convertXFromViewToScreen(float x) {
	return x + bounds.x + bounds.width / 2;
    }
    
    public float convertXFromScreenToView(float x) {
	return x - bounds.x - bounds.width / 2;
    }
    
    public float convertY(float y) {
	return -y + bounds.y + bounds.height / 2;
    }
    
    
    public void project(Vector3f v) {
	v.x = distanceToCamera * v.x / -v.z;
	v.y = distanceToCamera * v.y / -v.z;
	
	v.x = convertXFromViewToScreen(v.x);
	v.y = convertY(v.y);
    }
    
    
    
    
    

}
