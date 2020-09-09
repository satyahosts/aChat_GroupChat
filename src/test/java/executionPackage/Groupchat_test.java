package executionPackage;

import java.io.IOException;
import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import pageObjects.Groupchat_pages;

import resources.base;

public class Groupchat_test extends base {

	public AndroidDriver<MobileElement> driver;
	public static Logger log = LogManager.getLogger(base.class.getName());

	@BeforeTest
	public void BeforeTest() throws IOException, InterruptedException {

		driver = intilizeDriver();
		log.info("Intilized Achat Application");

	}

	@Test(priority = 1, enabled=true)
	public void create_group() throws IOException, InterruptedException {

		try {

			Groupchat_pages cp = new Groupchat_pages(driver);

			cp.moreoptions().click();
			cp.newgroupmenu().click();
			cp.user1().click();
			cp.user2().click();
			cp.done().click();
			cp.groupname().click();
			cp.groupname().sendKeys("aChat automation");
			cp.created().click();
			log.info("Group created");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test(priority = 2, enabled=true)
	public void getgroup_name() {

		Groupchat_pages cp = new Groupchat_pages(driver);

		for (MobileElement we : cp.groupnames()) {

			if (we.getText().equalsIgnoreCase("aChat automation")) {

				we.click();
				log.info("Match the groupname and selected");
				break;

			}
		}
	}

	@Test(priority = 3, enabled=true)
	public void sendtxt() throws IOException, InterruptedException {

		try {

			Groupchat_pages st = new Groupchat_pages(driver);
			st.msgbox().click();
			log.info("Click text message box");
			st.msgbox().sendKeys("how are u");
			st.sendbutton().click();
			log.info("Successfully send message");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test(priority = 4, enabled=true)
	public void send_imges() throws IOException, InterruptedException {

		try {
			Groupchat_pages st = new Groupchat_pages(driver);

			st.imgicon().click();
			log.info("Click image icon");

			st.imgchoose().click();
			log.info("Click image file");

			st.selcategory().click();
			log.info("Click image category");

			st.seleimage().click();
			log.info("Click images");

			st.confirm().click();
			log.info("Confirmed the image");

			st.conf().click();
			log.info("Confirm the images");

			st.sendbtn().click();
			log.info("Successfully send images");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test(priority = 5, enabled=true)
	public void send_documents() throws IOException, InterruptedException {

		try {
			Groupchat_pages st = new Groupchat_pages(driver);
			st.imgicon().click();
			log.info("Click attach icon");
			st.docfile().click();
			log.info("Select document  file");
			st.docat().click();
			log.info("Click document category");
			st.seldoc().click();
			log.info("Sucessfully send documents");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test(priority = 6, enabled=true)
	public void send_videos() throws IOException, InterruptedException {

		try {

			Groupchat_pages st = new Groupchat_pages(driver);

			st.attachicon().click();
			log.info("Click video image icon");

			st.vidofile_icon().click();
			log.info("Click video file icon");

			st.vidcategory().click();
			log.info("Click video category");

			st.choosevideos().click();
			log.info("choose videos");

			st.select_videos().click();
			log.info("Video selected");

			st.vconfirm().click();
			log.info("Confirmed the videos");

			st.vsendbutton().click();
			log.info("Successfully send videos");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test(priority = 7, enabled=true)
	public void send_audios() throws IOException, InterruptedException {

		try {

			Groupchat_pages st = new Groupchat_pages(driver);
			st.audicon().click();
			log.info("Click image icon");
			st.audio_choose().click();
			log.info("Click audio file");
			st.selaudios().click();
			log.info("Successfully send audios");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test(priority = 8, enabled = true)
	public void send_currentlocation() throws IOException, InterruptedException {

		try {

			Groupchat_pages st = new Groupchat_pages(driver);
			st.locicon().click();
			log.info("Click loc icon");
			st.location_icon().click();
			log.info("Click location file");
			st.mylocation().click();
			log.info("Click on my location icon");
			st.selclocation().click();
			log.info("Clicked select this location");
			st.sendlocation().click();
			log.info("Successfully send current location");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 9, enabled = false)
	public void send_differentlocation() throws IOException, InterruptedException {

		try {

			Groupchat_pages st = new Groupchat_pages(driver);
			st.locicon().click();
			log.info("Click loc icon");
			st.location_icon().click();
			log.info("Click location file");
			st.searchfield().click();
			st.searchdifferentloc().click();
			st.searchdifferentloc().sendKeys(prop.getProperty("locationName"));
			log.info("Enter the location name");
			st.selectfst().click();
			st.sendlocation().click();
			log.info("Successfully send " + prop.getProperty("locationName") + " location details");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test(priority = 10, enabled=true)
	public void send_cameraphoto() throws IOException, InterruptedException {

		try {

			Groupchat_pages st = new Groupchat_pages(driver);
			st.cameraicon().click();
			log.info("Click attach icon");
			st.camera_icon().click();
			log.info("Click image file");
			st.selphoto().click();
			log.info("Click photo");
			st.okbutton().click();
			;
			st.camsendbutton().click();
			log.info("Successfully send camera photo");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test(priority = 11, enabled=true)
	public void record_audio() throws IOException, InterruptedException {

		try {

			Groupchat_pages st = new Groupchat_pages(driver);

			AndroidTouchAction touch = new AndroidTouchAction(driver);
			touch.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(st.recordaudio()))
					.withDuration(Duration.ofMillis(2000))).release().perform();

			st.sendaudio().click();

			log.info("Successfully send audios");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	@Test (priority=12, enabled=true) 
	  public void make_admin() throws IOException, InterruptedException {
	  
	  try {
	  
	  Groupchat_pages ad=new Groupchat_pages(driver); 
	  
	  ad.clickgrp().click();
	  log.info("Clicked on the group name"); 
	  for(MobileElement we1:ad.participants()) 
	  { 
		  System.out.println(we1.getText());
		  
	  if(we1.getText().equalsIgnoreCase("aChat Test3 ")) 
	  { 
	  
	  AndroidTouchAction touch = new AndroidTouchAction (driver);
	 touch.longPress(LongPressOptions.longPressOptions() .withElement(ElementOption.element (we1)).withDuration(Duration.ofMillis(300))) 
	 .perform(); 
	 log.info("Match the username to click"); 
	 ad.adminok().click();
	 log.info("Making the user group admin");
	  break; 
	  } 
	  }
	  ad.adminnav().click();
		 log.info("Navigate back to the chat screen after making one user admin");
		 
// sending text, images, videos, audio, location and camera image after making the user admin		 
		 
		 sendtxt();
		 send_imges();
		 send_documents();
		 send_videos();
		 send_audios();
		 send_currentlocation();
		 send_cameraphoto();
		 record_audio();
	  
	  } catch(Exception e) 
	      { 
		  e.printStackTrace(); 
		  }
	
	  }

	@Test(priority = 13, enabled = true)
	public void reply_message() throws IOException, InterruptedException {

		try {

			Groupchat_pages st = new Groupchat_pages(driver);

			AndroidTouchAction touch = new AndroidTouchAction(driver);
			touch.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(st.messagetxt()))
					.withDuration(Duration.ofMillis(3000))).release().perform();
			log.info("Successfully clicked message");

			st.replytxt().click();
			log.info("Successfully clicked on reply icon");
			st.typetxt().click();
			log.info("Successfully clicked on type text box");
			st.typetxt().sendKeys("Is this fine?");
			log.info("Successfully typed the text");
			st.sendtxt().click();
			log.info("Successfully clicked on send icon");

		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	@Test(priority = 14, enabled = true)
	public void forward_message() throws IOException, InterruptedException {

		try {

			Groupchat_pages st = new Groupchat_pages(driver);

			AndroidTouchAction touch = new AndroidTouchAction(driver);
			touch.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(st.fwdtxt()))
					.withDuration(Duration.ofMillis(3000))).release().perform();
			log.info("Successfully clicked on forwareded message");

			st.fwdicon().click();
			log.info("Successfully clicked on forward icon");
			st.searchgrp().click();
			log.info("Successfully clicked on forward contact");
			st.grpname().click();
			log.info("Group name clicked successfully");
			st.contsend().click();
			log.info("Successfully clicked on contact send icon");

		} catch (Exception e) 
		{
			e.printStackTrace();
		}

	}		
			
			
	@Test(priority = 15, enabled = true)
	public void mute_contact() throws IOException, InterruptedException {

		try {

			Groupchat_pages st = new Groupchat_pages(driver);
			st.moreopt().click();
			log.info("Clicked on more options icon");
			st.muteopt().click();
			log.info("Clicked on mute option");
			st.mutechat().click();
			log.info("Clicked on mutechat radio button");
			st.muteok().click();
			log.info("Successfully clicked on OK text");
			st.pagebck().click();
			log.info("Successfully page navigated");

		} catch (Exception e) 
		{
			e.printStackTrace();
		}

	}

	@Test(priority = 16, enabled = true)
	public void unmute_conact() throws IOException, InterruptedException {

		try {

			Groupchat_pages st = new Groupchat_pages(driver);

			AndroidTouchAction touch = new AndroidTouchAction(driver);
			touch.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(st.mutecont()))
					.withDuration(Duration.ofMillis(3000))).release().perform();
			log.info("Successfully clicked on muted contact");

			st.unmute().click();
			log.info("Successfully clicked on unmute icon");

// for clearing the group chat

			touch.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(st.clearcont()))
					.withDuration(Duration.ofMillis(3000))).release().perform();
			log.info("Successfully clicked on Group");

			st.clearchat().click();
			log.info("Successfully chat has been cleared");

			st.clear().click();

			} catch (Exception e) 
		{
			e.printStackTrace();
		}

	}

	
	  @Test (priority=17, enabled = true) 
	  public void exit_group() throws IOException, InterruptedException {
	  
	  try {
	  
	  Groupchat_pages cp=new Groupchat_pages(driver); 
	  for(MobileElement we:cp.groupnames()) 
	  { 
		  System.out.println(we.getText());
		  
	  if(we.getText().equalsIgnoreCase("aChat automation")) 
	  { 
	 
		  AndroidTouchAction touch = new AndroidTouchAction (driver);
	 touch.longPress(LongPressOptions.longPressOptions() .withElement(ElementOption.element (we)).withDuration(Duration.ofMillis(300))) 
	 .perform(); 
	 log.info("Match the groupname and selected"); 
	 cp.exitgroup().click();
	  
	  cp.ok().click();
	  log.info("Successfully group exited"); 
	  break; 
	  } 
	  }
	  } catch(Exception e) 
	      {
		  e.printStackTrace(); 
		  }
	  }
	  
	  @Test (priority=18, enabled = true) 
	  public void delete_group() throws IOException, InterruptedException {
	  
	  try {
	  
	  Groupchat_pages cp=new Groupchat_pages(driver); 
	  for(MobileElement we:cp.groupnames()) 
	  { 
		  System.out.println(we.getText());
		  
	  if(we.getText().equalsIgnoreCase("aChat automation")) 
	  { 
	  
	  AndroidTouchAction touch = new AndroidTouchAction (driver);
	 touch.longPress(LongPressOptions.longPressOptions() .withElement(ElementOption.element (we)).withDuration(Duration.ofMillis(300))) 
	 .perform(); 
	 log.info("Match the groupname to delete"); 
	 cp.deletegrp().click();
	 log.info("The groupname deleted successfully");
	  break; 
	  } 
	  }
	  } catch(Exception e) 
	      { 
		  e.printStackTrace(); 
		  }
	  }
	 

	@AfterTest(enabled = false)

	public void AfterTest() throws InterruptedException {

		Thread.sleep(5000);
		driver.closeApp();

	}

}
