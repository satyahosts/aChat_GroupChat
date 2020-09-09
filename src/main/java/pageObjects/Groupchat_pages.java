package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Groupchat_pages {

	public AndroidDriver<MobileElement> driver;

//Enter Pin page

	By pinenter = By.className("android.widget.EditText");

	By title = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView");

// ChatList page -- to click on more option and to create a group

	By moreoptions = By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]");

	By newgroupmenu = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout");

	By user1 = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[5]");

	By user2 = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[6]");

	By done = By.id("com.chatapp.android:id/doneButton");

	By groupname = By.id("com.chatapp.android:id/groupname");

	By created = By.id("com.chatapp.android:id/creategroup");

	By groupnames = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView[1]");


	// sendtxt

	By msgfield = By.id("com.chatapp.android:id/chat_edit_text1");

	By senbtn = By.id("com.chatapp.android:id/enter_chat1");

	// send documents

	By imgicon = By.id("com.chatapp.android:id/attachment_icon");

	By docfile = By.id("com.chatapp.android:id/document_choose");

	By docat = By.xpath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"DOC\"]");

	By seldoc = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout/android.widget.TextView[1]");

	// Send Videos

	By attachicon = By.id("com.chatapp.android:id/attachment_icon");

	By vidofile_icon = By.id("com.chatapp.android:id/video_choose");

	By vidcategory = By.xpath("//android.widget.TextView[@text='ScreenCapture']");

	By choosevideos = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.ImageView");

	By select_videos = By.id("com.chatapp.android:id/fab");

	By vconfirm = By.id("com.chatapp.android:id/fab");

	By vsendbutton = By.id("com.chatapp.android:id/enter_chat1");

	// Sending Images

	By imgchoose = By.id("com.chatapp.android:id/image_choose");

	By selcategory = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout/android.widget.ImageView");

	By seleimage = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.ImageView");

	By confirm = By.id("com.chatapp.android:id/fab");

	By conf = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageButton");

	By sendbutton = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ImageView");

	// Sending audio

	By audicon = By.id("com.chatapp.android:id/attachment_icon");

	By audio_choose = By.id("com.chatapp.android:id/audio_choose");

	By selaudios = By.id("com.chatapp.android:id/tvFileName");

	// Sending live location

	By locicon = By.id("com.chatapp.android:id/attachment_icon");

	By location_icon = By.id("com.chatapp.android:id/location_choose");
	
	By mylocation = By.xpath("//android.widget.ImageView[@content-desc=\"My Location\"]");

	By selclocation = By.xpath("//android.widget.TextView[@text='Select this location']");

	By sendlocation = By.id("com.chatapp.android:id/select");

	// send different location

	By searchfield = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.TextView");

	By searchdifferentloc = By.id("com.google.android.gms:id/edit_text");

	By selectfst = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.TextView[1]");

	// Send camera images

	By cameraicon = By.id("com.chatapp.android:id/attachment_icon");

	By camera_icon = By.id("com.chatapp.android:id/camera_choose");

	By selphoto = By.xpath("(//GLButton[@content-desc=\"NONE\"])[2]");

	By okbutton = By.id("com.sec.android.app.camera:id/okay");

	By camsendbutton = By.id("com.chatapp.android:id/enter_chat1");

	// send record audio

	By recordaudio = By.id("com.chatapp.android:id/record");

	By sendaudio = By.id("com.chatapp.android:id/tvPositive");

	// Reply message

	By messagetxt = By.id("com.chatapp.android:id/relative_layout_message");

	By replytxt = By.id("com.chatapp.android:id/replymess");

	By typetxt = By.id("com.chatapp.android:id/chat_edit_text1");

	By sendtxt = By.id("com.chatapp.android:id/enter_chat1");

	// Forward message

	By fwdtxt = By.id("com.chatapp.android:id/relative_layout_message");

	By fwdicon = By.id("com.chatapp.android:id/forward");

	By searchgrp = By
			.xpath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"Search Groups\"]/android.widget.TextView");

	By grpname = By.xpath("//android.widget.TextView[@text='aChat automation']");

	By contsend = By.id("com.chatapp.android:id/overlapImage");
	

	// More options

	By moreopt = By.xpath("//android.widget.ImageView[@content-desc='More options']");

	By muteopt = By.xpath("//android.widget.TextView[@text='Mute']");

	By mutechat = By.id("com.chatapp.android:id/rb1");

	By muteok = By.id("com.chatapp.android:id/ok");

	By pagebck = By.id("com.chatapp.android:id/iBtnBack");
	
// Changing one of the users as admin
	
	By clickgrp = By.id("com.chatapp.android:id/nameMAincontainer");
	
	By participants = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[3]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.TextView[1]");
	
	By adminok = By.id("com.chatapp.android:id/tvPositive");
	
	By adminnav = By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");

// Chat List Page-unmute

	// By muteicon = By.id("com.chatapp.android:id/mute_chatlist");

	By mutecont = By.id("com.chatapp.android:id/rlChat");

	By unmute = By.xpath("//android.widget.TextView[@text='UnMute']");

// Clearing the group chat

	By clearcont = By.id("com.chatapp.android:id/rlChat");

	By clearchat = By.xpath("//android.widget.TextView[@text='Clear Chat']");

	By clear = By.xpath("//android.widget.TextView[@text='CLEAR']");

// object for finding a particular group name and clicking on it from the list

	 By exitgroup=By.xpath("//android.widget.TextView[@text='Exit Group']");

	 By ok=By.xpath("//android.widget.TextView[@text='EXIT']");

// Deleting the created group after exiting from it

	By deletegrp = By.xpath("//android.widget.TextView[@text='Delete Group']");

	
	

	public Groupchat_pages(AndroidDriver<MobileElement> driver) {

		this.driver = driver;
	}

// Performing actions on a selected contact

	public void WaitForVisibility(By e) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(e));
	}

	public MobileElement enterpin() {
		WaitForVisibility(pinenter);
		return driver.findElement(pinenter);
	}

	public MobileElement gettitle() {
		WaitForVisibility(title);
		return driver.findElement(title);
	}

//----------------------Method for creating a new group--------------------------------------//

	public MobileElement moreoptions() {
		WaitForVisibility(moreoptions);
		return driver.findElement(moreoptions);
	}

	public MobileElement newgroupmenu() {
		WaitForVisibility(newgroupmenu);
		return driver.findElement(newgroupmenu);
	}

	public MobileElement user1() {
		WaitForVisibility(user1);
		return driver.findElement(user1);
	}

	public MobileElement user2() {
		WaitForVisibility(user2);
		return driver.findElement(user2);
	}

	public MobileElement done() {
		WaitForVisibility(done);
		return driver.findElement(done);
	}

	public MobileElement groupname() {
		WaitForVisibility(groupname);
		return driver.findElement(groupname);
	}

	public MobileElement created() {
		WaitForVisibility(created);
		return driver.findElement(created);
	}

	public java.util.List<MobileElement> groupnames() {
		WaitForVisibility(groupnames);
		return driver.findElements(groupnames);
	}

	/*
	 * public MobileElement exitgroup() { WaitForVisibility(exitgroup); return
	 * driver.findElement(exitgroup); } public MobileElement ok() {
	 * WaitForVisibility(ok); return driver.findElement(ok); }
	 */
//----------------------Method for sending message in group--------------------------------------//

	public MobileElement msgbox() {
		WaitForVisibility(msgfield);
		return driver.findElement(msgfield);
	}

	public MobileElement sendbutton() {
		WaitForVisibility(senbtn);
		return driver.findElement(senbtn);
	}

//----------------------Method for sending documents in group--------------------------------------//

	public MobileElement imgicon() {
		WaitForVisibility(imgicon);
		return driver.findElement(imgicon);
	}

	public MobileElement docfile() {
		WaitForVisibility(docfile);
		return driver.findElement(docfile);
	}

	public MobileElement docat() {
		WaitForVisibility(docat);
		return driver.findElement(docat);
	}

	public MobileElement seldoc() {
		WaitForVisibility(seldoc);
		return driver.findElement(seldoc);
	}

//----------------------Method for sending selected videos in group--------------------------------------//

	public MobileElement attachicon() {
		WaitForVisibility(attachicon);
		return driver.findElement(attachicon);
	}

	public MobileElement vidofile_icon() {
		WaitForVisibility(vidofile_icon);
		return driver.findElement(vidofile_icon);
	}

	public MobileElement vidcategory() {
		WaitForVisibility(vidcategory);
		return driver.findElement(vidcategory);
	}

	public MobileElement select_videos() {
		WaitForVisibility(select_videos);
		return driver.findElement(select_videos);
	}

	public MobileElement choosevideos() {
		WaitForVisibility(choosevideos);
		return driver.findElement(choosevideos);
	}

	public MobileElement vconfirm() {
		WaitForVisibility(confirm);
		return driver.findElement(confirm);
	}

	public MobileElement vsendbutton() {
		WaitForVisibility(sendbutton);
		return driver.findElement(sendbutton);
	}

//----------------------Method for sending selected images in group--------------------------------------//

	public MobileElement imgchoose() {
		WaitForVisibility(imgchoose);
		return driver.findElement(imgchoose);
	}

	public MobileElement selcategory() {
		WaitForVisibility(selcategory);
		return driver.findElement(selcategory);
	}

	public MobileElement seleimage() {
		WaitForVisibility(seleimage);
		return driver.findElement(seleimage);
	}

	public MobileElement confirm() {
		WaitForVisibility(confirm);
		return driver.findElement(confirm);
	}

	public MobileElement conf() {
		WaitForVisibility(conf);
		return driver.findElement(conf);
	}

	public MobileElement sendbtn() {
		WaitForVisibility(sendbutton);
		return driver.findElement(sendbutton);
	}

//----------------------Method for sending selected audio in group--------------------------------------//

	public MobileElement audicon() {
		WaitForVisibility(audicon);
		return driver.findElement(audicon);
	}

	public MobileElement audio_choose() {
		WaitForVisibility(audio_choose);
		return driver.findElement(audio_choose);
	}

	public MobileElement selaudios() {
		WaitForVisibility(selaudios);
		return driver.findElement(selaudios);
	}

//----------------------Method for sending current location and dynamic location in group-----------------------//

	public MobileElement locicon() {
		WaitForVisibility(locicon);
		return driver.findElement(locicon);
	}

	public MobileElement location_icon() {
		WaitForVisibility(location_icon);
		return driver.findElement(location_icon);
	}

	public MobileElement mylocation() {
		WaitForVisibility(mylocation);
		return driver.findElement(mylocation);
	}

	public MobileElement selclocation() {
		WaitForVisibility(selclocation);
		return driver.findElement(selclocation);
	}

	public MobileElement sendlocation() {
		WaitForVisibility(sendlocation);
		return driver.findElement(sendlocation);
	}

	public MobileElement searchfield() {
		WaitForVisibility(searchfield);
		return driver.findElement(searchfield);
	}

	public MobileElement searchdifferentloc() {
		WaitForVisibility(searchdifferentloc);
		return driver.findElement(searchdifferentloc);
	}

	public MobileElement selectfst() {
		WaitForVisibility(selectfst);
		return driver.findElement(selectfst);
	}

//----------------------Method for sending camera photo in group--------------------------------------//

	public MobileElement cameraicon() {
		WaitForVisibility(cameraicon);
		return driver.findElement(cameraicon);
	}

	public MobileElement camera_icon() {
		WaitForVisibility(camera_icon);
		return driver.findElement(camera_icon);
	}

	public MobileElement selphoto() {
		WaitForVisibility(selphoto);
		return driver.findElement(selphoto);
	}

	public MobileElement okbutton() {
		WaitForVisibility(okbutton);
		return driver.findElement(okbutton);
	}

	public MobileElement camsendbutton() {
		WaitForVisibility(camsendbutton);
		return driver.findElement(camsendbutton);
	}

//----------------------Method for recording audio in group--------------------------------------//

	public MobileElement recordaudio() {
		WaitForVisibility(recordaudio);
		return driver.findElement(recordaudio);
	}

	public MobileElement sendaudio() {
		WaitForVisibility(sendaudio);
		return driver.findElement(sendaudio);
	}

//----------------------Method for replying to message in group--------------------------------------//

	public MobileElement messagetxt() {
		WaitForVisibility(messagetxt);
		return driver.findElement(messagetxt);
	}

	public MobileElement replytxt() {
		WaitForVisibility(replytxt);
		return driver.findElement(replytxt);
	}

	public MobileElement typetxt() {
		WaitForVisibility(typetxt);
		return driver.findElement(typetxt);
	}

	public MobileElement sendtxt() {
		WaitForVisibility(sendtxt);
		return driver.findElement(sendtxt);
	}

//----------------------Method for forwarding image or text or video for the same group---------------------//

	public MobileElement fwdtxt() {
		WaitForVisibility(fwdtxt);
		return driver.findElement(fwdtxt);
	}

	public MobileElement fwdicon() {
		WaitForVisibility(fwdicon);
		return driver.findElement(fwdicon);
	}

	public MobileElement searchgrp() {
		WaitForVisibility(searchgrp);
		return driver.findElement(searchgrp);
	}

	public MobileElement grpname() {
		WaitForVisibility(grpname);
		return driver.findElement(grpname);
	}

	public MobileElement contsend() {
		WaitForVisibility(contsend);
		return driver.findElement(contsend);
	}
// -------------------------Method for making user as Admin---------------//

	public MobileElement clickgrp() {
		WaitForVisibility(clickgrp);
		return driver.findElement(clickgrp);
	}

	public java.util.List<MobileElement> participants() {
		WaitForVisibility(participants);
		return driver.findElements(participants);
	}

	public MobileElement adminok() {
		WaitForVisibility(adminok);
		return driver.findElement(adminok);
	}

	public MobileElement adminnav() {
		WaitForVisibility(adminnav);
		return driver.findElement(adminnav);
	}

//---------------------------Method for muting group--------------------------------------//

	public MobileElement moreopt() {
		WaitForVisibility(moreopt);
		return driver.findElement(moreopt);
	}

	public MobileElement muteopt() {
		WaitForVisibility(muteopt);
		return driver.findElement(muteopt);
	}

	public MobileElement mutechat() {
		WaitForVisibility(mutechat);
		return driver.findElement(mutechat);
	}

	public MobileElement muteok() {
		WaitForVisibility(muteok);
		return driver.findElement(muteok);
	}

	public MobileElement pagebck() {
		WaitForVisibility(pagebck);
		return driver.findElement(pagebck);
	}

//------------------------Method for unmuting the group----------------------------------//

	public MobileElement mutecont() {
		WaitForVisibility(mutecont);
		return driver.findElement(mutecont);
	}

	public MobileElement unmute() {
		WaitForVisibility(unmute);
		return driver.findElement(unmute);
	}

//----------------------Method for clearing the group chat---------------------------------//

	public MobileElement clearcont() {
		WaitForVisibility(clearcont);
		return driver.findElement(clearcont);
	}

	public MobileElement clearchat() {
		WaitForVisibility(clearchat);
		return driver.findElement(clearchat);
	}

	public MobileElement clear() {
		WaitForVisibility(clear);
		return driver.findElement(clear);
	}

//----------------------Method for exiting group--------------------------------------//

	public MobileElement exitgroup() {
		WaitForVisibility(exitgroup);
		return driver.findElement(exitgroup);
	}

	public MobileElement ok() {
		WaitForVisibility(ok);
		return driver.findElement(ok);
	}

//----------------------Method for Deleting group--------------------------------------//

	public MobileElement deletegrp() {
		WaitForVisibility(deletegrp);
		return driver.findElement(deletegrp);
	}

}
