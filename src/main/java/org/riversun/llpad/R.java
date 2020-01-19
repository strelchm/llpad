/*
 * "LLPAD" You can open a very big document (more than 10GBytes) with ease
 * 
 * Copyright 2016-2017 Tom Misawa, riversun.org@gmail.com
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy of 
 * this software and associated documentation files (the "Software"), to deal in the 
 * Software without restriction, including without limitation the rights to use, 
 * copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the 
 * Software, and to permit persons to whom the Software is furnished to do so, 
 * subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all 
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 *  INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A 
 * PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR 
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, 
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR 
 * IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 * 
 */
package org.riversun.llpad;

import java.awt.Color;
import java.text.MessageFormat;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * 
 * Wrapper for getting values from resource file
 *
 * @author Tom Misawa (riversun.org@gmail.com)
 */
public class R {

	private static final ResourceBundle resourceBundle =
			ResourceBundle.getBundle(AppDef.Common.RESOURCE_BUNDLE);

	/**
	 * Returns the value of resource considering i18n
	 * 
	 * @param key
	 *            key of property
	 * @return
	 */
	public static String getString(String key) {

		return resourceBundle.getString(key);
	}

	/**
	 * Returns the value of resource considering i18n as a compound message<br>
	 * <p>
	 * This is a {0}
	 * 
	 * @param key
	 * @param params
	 * @return
	 */
	public static String getString(String key, Object... params) {
		try {
			return MessageFormat.format(getString(key), params);
		} catch (MissingResourceException e) {
			return null;
		}
	}

	public static class string {

		public static final String Window__AppName = "Window.AppName";
		public static final String Window_File__NO_TITLE = "Window.File.NO_TITLE";
		public static final String Window_Menu__FILE = "Window.Menu.FILE";
		public static final String Window_Menu__OPEN = "Window.Menu.OPEN";

		public static final String FileChooser__FILTER_TEXTFILES = "FileChooser.FILTER_TEXTFILES";
		public static final String FileChooser__openDialogTitleText = "FileChooser.openDialogTitleText";
		public static final String FileChooser__openButtonText = "FileChooser.openButtonText";
		public static final String FileChooser__cancelButtonText = "FileChooser.cancelButtonText";
		public static final String FileChooser__filesOfTypeLabelText = "FileChooser.filesOfTypeLabelText";

		public static final String FileChooser_Msg__COULD_NOT_OPEN_FILE = "FileChooser.Msg.COULD_NOT_OPEN_FILE";
		public static final String FileChooser_Msg__THIS_FILE_IS_NOT_A_TEXT_FILE = "FileChooser.Msg.THIS_FILE_IS_NOT_A_TEXT_FILE";

	}

	public static class image {

		/**
		 * Icon images
		 */
		public static final String[] ICONS = new String[] {
				"icon16.png",
				"icon32.png",
				"icon48.png",
				"icon64.png",
				"icon72.png",
				"icon96.png",
		};
	}

	public static class color {

		public static Color Window_TextArea_Background = Color.white;
		public static Color Window_Header = Color.lightGray;
		public static Color Window_Footer = Color.lightGray;

	}

}
