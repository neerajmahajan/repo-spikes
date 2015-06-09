package com.design.ui.factory;

import com.design.components.ui.Button;
import com.design.components.ui.CheckBox;
import com.design.components.ui.windows.ButtonWindows;
import com.design.components.ui.windows.CheckboxWindows;
import com.design.ui.factory.spec.UiComponentsFactory;

public class WindowUiComponentsFactory  implements UiComponentsFactory{

	public Button getButton() {
		return new ButtonWindows();
	}

	public CheckBox getCheckbox() {
		return new CheckboxWindows();
	}

}
