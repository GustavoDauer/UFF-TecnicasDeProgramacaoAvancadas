/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package circles;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Anselmo
 */
class Circle {
   private Color color;

   public Circle(Color color) {
      this.color = color;
   }
   public void draw(Graphics g, int x, int y, int r) {
      g.setColor(color);
      g.drawOval(x, y, r, r);
   }
}
