/*
 * Copyright © 2011 Ejwa Software. All rights reserved.
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
package com.ejwa.dinja.opengles;

public final class OpenGLESProperty {
	public enum Identifier {
		GL_VENDOR(0x1f00),
		GL_RENDERER(0x1f01),
		GL_VERSION(0x1f02),
		GL_EXTENSIONS(0x1f03),
		GL_SHADING_LANGUAGE_VERSION(0x8b8c);

		private final int id;
		Identifier(int id) { this.id = id; }
		int get() { return id; }
	}

	private OpenGLESProperty() {
		/* No instances of this class allowed. */
	}

	public static String get(Identifier identifier) {
		return OpenGLES2.glGetString(identifier.get()).getString();
	}
}
