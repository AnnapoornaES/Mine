package com.parent.child.Inheritance.Util;

import com.parent.child.Inheritance.Casting.*;

public class ShowRoomUtilSleeper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShowRoom showroom = new ShowRoom();
		System.out.println(showroom.openTiming);

		ShowRoomUtil showroomUtil = new ShowRoomUtil();
		showroomUtil.showroomUtil(showroom);

		WatchShowRoom showroom2 = new WatchShowRoom();
		showroomUtil.showroomUtil(showroom2);
		System.out.println(showroom2.watchName);

		MobileShowRoom mobileShowroom = new MobileShowRoom();
		showroomUtil.showroomUtil(mobileShowroom);
		System.out.println(mobileShowroom.price);

	}

}
