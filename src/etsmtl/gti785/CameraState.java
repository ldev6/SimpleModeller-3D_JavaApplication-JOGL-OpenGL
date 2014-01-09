package etsmtl.gti785;

import java.io.Serializable;

public class CameraState implements Serializable{
	private static final long serialVersionUID = 1L;

	private Point3D position;
	private Point3D target;
	private Vector3D up;
	
	public CameraState(Point3D position, Point3D target, Vector3D up){
		this.position = position;
		this.target = target;
		this.up = up;
	}
	
	public Point3D getPosition() {
		return position;
	}

	public void setPosition(Point3D position) {
		this.position = position;
	}

	public Point3D getTarget() {
		return target;
	}

	public void setTarget(Point3D target) {
		this.target = target;
	}

	public Vector3D getUp() {
		return up;
	}

	public void setUp(Vector3D up) {
		this.up = up;
	}
}
