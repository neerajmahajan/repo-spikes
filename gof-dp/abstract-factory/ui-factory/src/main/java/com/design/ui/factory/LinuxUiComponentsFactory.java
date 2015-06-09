package com.design.ui.factory;

import com.design.components.ui.Button;
import com.design.components.ui.CheckBox;
import com.design.components.ui.linux.ButtonLinux;
import com.design.components.ui.linux.CheckboxLinux;
import com.design.ui.factory.spec.UiComponentsFactory;

public class LinuxUiComponentsFactory implements UiComponentsFactory{

	public Button getButton() {
		return new ButtonLinux();
	}

	public CheckBox getCheckbox() {
		return new CheckboxLinux();
	}

}
