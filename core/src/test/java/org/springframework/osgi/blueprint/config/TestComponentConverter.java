/*
 * Copyright 2006-2009 the original author or authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.osgi.blueprint.config;

import org.osgi.service.blueprint.container.Converter;
import org.osgi.service.blueprint.container.ReifiedType;
import org.springframework.osgi.blueprint.TestComponent;

/**
 * Dummy converter used for testing.
 * 
 * @author Costin Leau
 * 
 */
public class TestComponentConverter implements Converter {

	public boolean canConvert(Object fromValue, ReifiedType toType) {
		return TestComponent.class.equals(toType.getRawClass());
	}

	public Object convert(Object fromValue, ReifiedType toType) throws Exception {
		TestComponent comp = new TestComponent();
		comp.setPropA(fromValue);
		return comp;
	}
}
