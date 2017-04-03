import java.awt.Desktop;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.net.URI;
public class BingClick {

	public static void main(String[] args) {
		try{
			Robot bot = new Robot();
			Desktop.getDesktop().browse(new URI("http://www.bing.com"));
			Thread.sleep(7000);  
		    bot.mouseMove(100, 630);    
		    bot.mousePress(InputEvent.BUTTON1_MASK);
		    bot.mouseRelease(InputEvent.BUTTON1_MASK);
		    for(int i=0;i<5;i++)
		    {
			    Thread.sleep(3000);  
			    bot.mouseMove(200, 320);    
			    bot.mousePress(InputEvent.BUTTON1_MASK);
			    bot.mouseRelease(InputEvent.BUTTON1_MASK);
			    Thread.sleep(3000);  
			    bot.mouseMove(400, 320);    
			    bot.mousePress(InputEvent.BUTTON1_MASK);
			    bot.mouseRelease(InputEvent.BUTTON1_MASK);
			    Thread.sleep(3000);  
			    bot.mouseMove(550, 320);    
			    bot.mousePress(InputEvent.BUTTON1_MASK);
			    bot.mouseRelease(InputEvent.BUTTON1_MASK);
			    Thread.sleep(3000);  		    
			    bot.mouseMove(650, 320);    
			    bot.mousePress(InputEvent.BUTTON1_MASK);
			    bot.mouseRelease(InputEvent.BUTTON1_MASK);
			    Thread.sleep(3000);
			    bot.mouseMove(800, 320);    
			    bot.mousePress(InputEvent.BUTTON1_MASK);
			    bot.mouseRelease(InputEvent.BUTTON1_MASK);
			    Thread.sleep(3000);  
			    bot.mouseMove(1000, 320);    
			    bot.mousePress(InputEvent.BUTTON1_MASK);
			    bot.mouseRelease(InputEvent.BUTTON1_MASK);
			    Thread.sleep(3000);  
			    bot.mouseMove(1200, 320);    
			    bot.mousePress(InputEvent.BUTTON1_MASK);
			    bot.mouseRelease(InputEvent.BUTTON1_MASK);
			    Thread.sleep(3000);  
			    bot.mouseMove(1320, 300);    
			    bot.mousePress(InputEvent.BUTTON1_MASK);
			    bot.mouseRelease(InputEvent.BUTTON1_MASK);
			}
		}
			catch (Exception e) {
				  e.printStackTrace();
				}
		}

	
}