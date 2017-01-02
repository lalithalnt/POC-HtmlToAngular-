/**
 * 
 */
package com.samples;

import java.awt.Component;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTree;

import com.webfirmframework.wffweb.tag.html.Body;
import com.webfirmframework.wffweb.tag.html.stylesandsemantics.Div;

/**
 * @author 20123671
 *
 */
public class ComponentBuilderUtil {

	HtmlBuilderUtil htmlBuilder ;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void createSwingToHTMLComponents(Object object) {
		this.htmlBuilder = new HtmlBuilderUtil();
		if (object instanceof JPanel) {			
			componentBuilder((JPanel) object);
		} else if (object instanceof JTree) {
			componentBuilder((JTree) object);
		} else if (object instanceof JTextArea) {

		} else if (object instanceof JLabel) {

		} else if (object instanceof JList) {
			componentBuilder((JList) object);
		} else if (object instanceof JTable) {
			componentBuilder((JTable) object);
		} else if (object instanceof JComboBox) {

		} else if (object instanceof JSlider) {

		} else if (object instanceof JMenu) {
			componentBuilder((JMenu) object);
		} else if (object instanceof AbstractButton) {
			componentBuilder((AbstractButton) object);
		} else if (object instanceof JButton) {

		} else if (object instanceof JRadioButton) {

		} else if (object instanceof JColorChooser) {

		} else if (object instanceof JProgressBar) {

		}
		
		
	}

	public void componentBuilder(JPanel panel) {
		
		Component[] comp = panel.getComponents();
		// create panel and add components.
		componentBuilder(comp, null);
		
		
		this.htmlBuilder.divTagCreator(null);
	}

	public void componentBuilder(JTree tree) {
		Component[] comp = tree.getComponents();
		// create JTree and add components.
		componentBuilder(comp, null);
	}

	public void componentBuilder(JTextArea panel) {
		Component[] comp = panel.getComponents();
		// create JTextArea and add components.
		componentBuilder(comp, null);
	}

	public void componentBuilder(JLabel panel) {
		Component[] comp = panel.getComponents();
		// create JLabel and add components.
		componentBuilder(comp, null);
	}

	public void componentBuilder(JList panel) {
		Component[] comp = panel.getComponents();
		// create JList and add components.
		componentBuilder(comp, null);
	}

	public void componentBuilder(JTable panel) {
		Component[] comp = panel.getComponents();
		// create JTable and add components.
		componentBuilder(comp, null);
	}

	public void componentBuilder(JComboBox panel) {
		Component[] comp = panel.getComponents();
		// create JComboBox and add components.
		componentBuilder(comp, null);
	}

	public void componentBuilder(JSlider panel) {
		Component[] comp = panel.getComponents();
		// create JSlider and add components.
		componentBuilder(comp, null);
	}

	public void componentBuilder(JMenu panel) {
		Component[] comp = panel.getComponents();
		// create JMenu and add components.
		componentBuilder(comp, null);
	}

	public void componentBuilder(AbstractButton panel) {
		Component[] comp = panel.getComponents();
		// create AbstractButton and add components.
		componentBuilder(comp, null);
	}

	public void componentBuilder(JButton panel) {
		Component[] comp = panel.getComponents();
		// create JButton and add components.

		componentBuilder(comp, null);
	}

	public void componentBuilder(JRadioButton panel) {
		Component[] comp = panel.getComponents();
		// create JRadioButton and add components.
		componentBuilder(comp, null);
	}

	public void componentBuilder(JColorChooser panel) {
		Component[] comp = panel.getComponents();
		// create JColorChooser and add components.
		componentBuilder(comp, null);
	}

	public void componentBuilder(JProgressBar panel) {
		Component[] comp = panel.getComponents();
		// create JProgressBar and add components.
		componentBuilder(comp, null);
	}

	public void componentBuilder(Component[] comp, Object object) {
		if (comp != null && comp.length > 0) {
			for (int i = 0; i < comp.length; i++) {
				System.out.println("\ncomp list :: " + comp[i]);

				if (comp[i] instanceof JPanel) {
					componentBuilder((JPanel) comp[i]);
				} else if (comp[i] instanceof JTree) {
					componentBuilder((JTree) comp[i]);
				} else if (comp[i] instanceof JTextArea) {

				} else if (comp[i] instanceof JLabel) {

				} else if (comp[i] instanceof JList) {
					componentBuilder((JList) comp[i]);
				} else if (comp[i] instanceof JTable) {
					componentBuilder((JTable) comp[i]);
				} else if (comp[i] instanceof JComboBox) {

				} else if (comp[i] instanceof JSlider) {

				} else if (comp[i] instanceof JMenu) {
					componentBuilder((JMenu) comp[i]);
				} else if (comp[i] instanceof AbstractButton) {
					componentBuilder((AbstractButton) comp[i]);
				} else if (comp[i] instanceof JButton) {

					if(object instanceof Body){
						
					}else if(object instanceof Div){
						
					}
					
					
				} else if (comp[i] instanceof JRadioButton) {

				} else if (comp[i] instanceof JColorChooser) {

				} else if (comp[i] instanceof JProgressBar) {

				}
			}
		}
	}

}
