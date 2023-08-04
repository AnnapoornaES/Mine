package com.parent.child.Inheritance.Casting;

import com.parent.child.Inheritance.Casting.ShowRoom;
import com.parent.child.Inheritance.Casting.WatchShowRoom;
import com.parent.child.Inheritance.Casting.MobileShowRoom;

public class ShowRoomUtil extends ShowRoom{
	public void showroomUtil(ShowRoom showroom) {
		ShowRoom showroom2 = new ShowRoom();
		showroom2.showroomTime();

		if (showroom instanceof WatchShowRoom) {
			ShowRoom showroom3 = new WatchShowRoom();
			showroom3.showroomTime();
			WatchShowRoom watchShowroom = (WatchShowRoom)showroom3;
			watchShowroom.watchName();
		}

		if (showroom instanceof MobileShowRoom) 
		{
			ShowRoom showroom4 = new MobileShowRoom();
			showroom4.showroomTime();

			MobileShowRoom mobileShowroom = (MobileShowRoom) showroom4;
			mobileShowroom.mobilePrice();
		}

	}
}
