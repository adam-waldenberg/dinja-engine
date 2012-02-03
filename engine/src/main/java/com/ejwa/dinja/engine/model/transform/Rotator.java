/*
 * Copyright © 2011-2012 Ejwa Software. All rights reserved.
 *
 * This file is part of Dinja Engine. Dinja Engine is a OpenGLES2
 * 3D engine with physics support developed for the Android platform.
 *
 * Dinja Engine is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * Dinja Engine is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General
 * Public License along with Dinja Engine. If not, see
 * <http://www.gnu.org/licenses/>.
 */
package com.ejwa.dinja.engine.model.transform;

import org.openmali.vecmath2.Matrix3f;
import org.openmali.vecmath2.Matrix4f;
import org.openmali.vecmath2.Quaternion4f;

public class Rotator {
	private final Matrix4f baseMatrix;
	private final Matrix3f currentRotation = new Matrix3f();
	private final Matrix3f rotationMatrix = new Matrix3f();

	public Rotator(Matrix4f baseMatrix) {
		rotationMatrix.setIdentity();
		this.baseMatrix = baseMatrix;
	}

	public void rotateX(float angle) {
		rotationMatrix.setIdentity();
		rotationMatrix.rotX(angle);
		rotate(rotationMatrix);
	}

	public void rotateY(float angle) {
		rotationMatrix.setIdentity();
		rotationMatrix.rotY(angle);
		rotate(rotationMatrix);
	}

	public void rotateZ(float angle) {
		rotationMatrix.setIdentity();
		rotationMatrix.rotZ(angle);
		rotate(rotationMatrix);
	}

	public void rotate(Matrix3f rotationMatrix) {
		baseMatrix.get(currentRotation);
		currentRotation.mul(rotationMatrix, currentRotation);
		baseMatrix.setRotation(currentRotation);
	}

	public Quaternion4f get() {
		final Quaternion4f rotation = new Quaternion4f();
		baseMatrix.get(rotation);
		return rotation;
	}

	public void set(Quaternion4f rotation) {
		baseMatrix.setRotation(rotation);
	}
}
