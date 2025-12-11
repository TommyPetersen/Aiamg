package Aiamg;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;

public class Screen extends Frame{

  Image image = null;
  int W = 0, H = 0;

  Color background;

  Screen(int W, int H){
      this(W, H, W/2, H/2);
  }

  Screen(int W, int H, int locationX, int locationY){
          this.W = W; this.H = H;
          setSize(W, H);
          setUndecorated(false);
          setTitle("Aiamg");
          setLocation(locationX, locationY);
          setVisible(true);

          this.addWindowListener(
            new WindowAdapter(){public void windowClosing(WindowEvent e){dispose();}}
          );

          image = createImage(W, H);
          initScreen();
          Insets in = getInsets();
          setSize(W, H);
          getGraphics().drawImage(image, in.left, in.top, null);
          Cursor crosshairCursor = new Cursor(Cursor.CROSSHAIR_CURSOR);
          int[] myPixels = new int[16 * 16];
          Image thecursorimage = createImage(new MemoryImageSource(16, 16, myPixels, 0, 16));
          Cursor hiddenCursor = (getToolkit()).createCustomCursor(thecursorimage, new Point(0, 0), "invisiblecursor");
          setCursor(crosshairCursor);
          background = Color.lightGray;

          repaint();
  }

  protected void initScreen(){
          Graphics sg = image.getGraphics();
          sg.setClip(0, 0, W, H);
          sg.setColor(background);
          sg.fillRect(0, 0, W, H);
          sg.dispose();
  }

  public int getW(){
          return W;
  }

  public int getH(){
          return H;
  }

  public Image createImage(){
          return createImage(W, H);
  }

  public void update(Graphics g){
          paint(g);
  }

  public void paint(Graphics g){
          try{
              Insets in = this.getInsets();
              g.translate(in.left, in.top);
              g.drawImage(image, 0,0, null);
          } catch(Exception e){}
  }

  public void drawRaster(RasterPoint[][] raster) throws Exception{
          image = createImage(W, H);  // image is off screen for double buffering
          Graphics ig = image.getGraphics();

          for (int i = 0; i < W; i++){
              for (int j = 0; j < H; j++){
                      ig.setColor((raster[i][j]).fadedColor);
                      ig.drawLine(i, H - j - 1, i, H - j - 1); //Reversed on y-axis
              }
          }

          update(getGraphics());
          Thread.sleep(1); //Delay added because of SocketExceptions
  }

  public void drawDecorations(){
          image = createImage(W, H);  // image is off screen for double buffering
          Graphics ig = image.getGraphics();

          // Crosshair:
          ig.setColor(Color.cyan);
          ig.drawLine(W / 2 - 10, H / 2, W / 2 + 10, H / 2);
          ig.drawLine(W / 2, H / 2 - 10, W / 2, H / 2 + 10);

          update(getGraphics());
  }

  public void paintImage(Image _image){
          image = _image;
          update(getGraphics());
  }
}
