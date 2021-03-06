/*******************************************************************************
 * Copyright 2014 Manuel Mauky
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package de.saxsys.mvvmfx.utils.sizebinding;

import static de.saxsys.mvvmfx.utils.sizebinding.SizeBindingsBuilder.bindWidth;
import static de.saxsys.mvvmfx.utils.sizebinding.SizeBindingsBuilder.unbindWidth;

import javafx.scene.control.Control;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Region;
import javafx.scene.shape.Rectangle;

import org.junit.Before;
import org.junit.Test;


public class UnbindWidthTest extends SizeBindingsBuilderTestBase {
	
	
	private ImageView targetImageView;
	private Control targetControl;
	private Rectangle targetRectangle;
	private Region targetRegion;
	
	
	@Before
	public void setUp() {
		targetImageView = new ImageView();
		targetControl = new ScrollPane();
		targetRectangle = new Rectangle();
		targetRegion = new Region();
	}
	
	@Test
	public void unbindWidthOfImageView() {
		bindWidth().from(fromRectangle).to(targetImageView);
		
		unbindWidth().of(targetImageView);
		
		fromRectangle.setWidth(SIZEVAL + 100);
		
		assertCorrectWidth(targetImageView); // still the old size
	}
	
	@Test
	public void unbindWidthOfControl() {
		bindWidth().from(fromRectangle).to(targetControl);
		
		unbindWidth().of(targetControl);
		
		fromRectangle.setWidth(SIZEVAL + 100);
		
		assertCorrectWidth(targetControl); // still the old size
	}
	
	@Test
	public void unbindWidthOfRectangle() {
		bindWidth().from(fromRectangle).to(targetRectangle);
		
		unbindWidth().of(targetRectangle);
		
		fromRectangle.setWidth(SIZEVAL + 100);
		
		assertCorrectWidth(targetRectangle); // still the old size
	}
	
	@Test
	public void unbindWidthOfRegion() {
		bindWidth().from(fromRectangle).to(targetRegion);
		
		unbindWidth().of(targetRegion);
		
		fromRectangle.setWidth(SIZEVAL + 100);
		
		assertCorrectWidth(targetRegion); // still the old size
	}
}
