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
package com.ejwa.dinja.engine.controller.physics;

import com.ejwa.dinja.engine.controller.Controllable;
import com.ejwa.dinja.engine.model.node.INode;
import com.ejwa.dinja.engine.model.node.IRootNode;
import com.ejwa.dinja.engine.model.physics.PhysicsWorld;
import com.ejwa.dinja.engine.model.physics.PhysicsBody;
import com.ejwa.dinja.opengles.display.IFrameUpdateListener;

public class PhysicsBodyController implements Controllable, IFrameUpdateListener {
	final PhysicsBody physicsBody;

	public PhysicsBodyController(PhysicsBody physicsBody) {
		this.physicsBody = physicsBody;
	}

	/*@Override
	public void setRoot(IRootNode root) {
		if (root == null) {
			PhysicsWorld.remove(root, this);
		} else {
			PhysicsWorld.add(root, this);


		}
	}*/

	@Override
	public void onFrameUpdate(long milliSecondsSinceLastFrame) {
		if (physicsBody.getNode().getRoot() != null) {
		//PhysicsWorld.
		}
	}
}