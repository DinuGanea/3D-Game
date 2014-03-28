package net.bestwebart.game.util;

public class Vector3f {
    
    public float x, y, z;
    
    
    public Vector3f() {
	x = 0;
	y = 0;
	z = 0;
    }
    
    public Vector3f(float x, float y, float z) {
	this.x = x;
	this.y = y;
	this.z = z;
    }
    
    
    public boolean equals(Object o) {
	Vector3f v = (Vector3f) o;
	return (x == v.x && y == v.y && z == v.z);
    }
    
    public boolean equals(float x, float y, float z) {
	return (this.x == x && this.y == y && this.z == z);
    }
    
    public void add(float x, float y, float z) {
	this.x += x;
	this.y += y;
	this.z += z;
    }
    
    public void substract(float x, float y, float z) {
	this.x -= x;
	this.y -= y;
	this.z -= z;
    }
    
    public void multiply(float s) {
	x *= s;
	y *= s;
	z *= s;
    }
    
    public void divide(float s) {
	x /= s;
	y /= s;
	z /= s;
    }
    
    public float length() {
	return (float) Math.sqrt(x * x + y * y + z * z);
    }
    
    public String toString() {
	return "(" + x + ", " + y + ", " + z +")";
    }
}
