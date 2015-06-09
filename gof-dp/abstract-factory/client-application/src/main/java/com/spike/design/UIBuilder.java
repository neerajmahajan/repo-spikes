package com.spike.design;

import com.design.components.ui.Button;
import com.design.components.ui.CheckBox;
import com.design.ui.factory.spec.UiComponentsFactory;

public class UIBuilder {
	
	private UiComponentsFactory factory;
	
	public UIBuilder(UiComponentsFactory factory){
		this.factory = factory;
	}
	
	public void buildUi(){
		Button button = factory.getButton();
		CheckBox checkbox = factory.getCheckbox();
		
		button.click();
		checkbox.setChecked(true);
		System.out.println("************** Abstract factory Pattern implementation ***************");
	}

}
