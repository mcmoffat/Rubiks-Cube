package rubixCube_1;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.border.AbstractBorder;

public class RectangleBorder extends AbstractBorder {
  protected Insets thickness;

  protected Color lineColor;

  protected Insets gap;

  public RectangleBorder(Color color) {
    this(color, new Insets(1, 1, 1, 1));
  }

  public RectangleBorder(Color color, Insets thickness) {
    this(color, thickness, thickness);
  }

  public RectangleBorder(Color color, Insets thickness, Insets gap) {
    lineColor = color;
    this.thickness = thickness;
    this.gap = gap;
  }

  public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
    Color oldColor = g.getColor();
 

    g.setColor(lineColor);
    // top
    for (int i = 0; i < thickness.top; i++) {
      g.drawLine(x, y + i, x + width, y + i);
    }
    // bottom
    for (int i = 0; i < thickness.bottom; i++) {
      g.drawLine(x, y + height - i - 1, x + width, y + height - i - 1);
    }
    // right
    for (int i = 0; i < thickness.right; i++) {
      g.drawLine(x + width - i - 1, y, x + width - i - 1, y + height);
    }
    // left
    for (int i = 0; i < thickness.left; i++) {
      g.drawLine(x + i, y, x + i, y + height);
    }
    g.setColor(oldColor);
  }

  /**
   * Returns the insets of the border.
   * 
   * @param c
   *          the component for which this border insets value applies
   */
  public Insets getBorderInsets(Component c) {
    return gap;
  }

  public Insets getBorderInsets(Component c, Insets insets) {
    insets.left = gap.left;
    insets.top = gap.top;
    insets.right = gap.right;
    insets.bottom = gap.bottom;
    return insets;
  }

  /**
   * Returns the color of the border.
   */
  public Color getLineColor() {
    return lineColor;
  }

  /**
   * Returns the thickness of the border.
   */
  public Insets getThickness() {
    return thickness;
  }

  /**
   * Returns whether or not the border is opaque.
   */
  public boolean isBorderOpaque() {
    return false;
  }

  public Insets getGap() {
    return gap;
  }

}