/**
 * 
 */
package org.cvtc.tests.substitutes;

import org.cvtc.shapes.Dialog;

/**
 * @author Trevor
 *
 */
public class MessageBoxSub implements Dialog {
	
	@Override
	public int show(String message, String title) {
		return 0;
	}

}
