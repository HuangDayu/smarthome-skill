package cn.huangdayu.smarthome.skill.util;

import java.util.ArrayList;
import java.util.List;

public class TmallSkillUtil {
	public static List<String> getActionsList() {
		List<String> actionsList = new ArrayList<String>();
		actionsList.add("TurnOn");
		actionsList.add("TurnOff");
		actionsList.add("SelectChannel");
		actionsList.add("SetMute");
		actionsList.add("CancelMute");
		actionsList.add("Play");
		actionsList.add("Pause");
		actionsList.add("Continue");
		actionsList.add("SetBrightness");
		actionsList.add("AdjustUpBrightness");
		actionsList.add("AdjustDownBrightness");
		actionsList.add("SetColor");
		actionsList.add("OpenFunction");
		actionsList.add("CloseFunction");
		actionsList.add("Cancel");
		actionsList.add("AdjustUpVolume");
		actionsList.add("AdjustDownVolume");
		actionsList.add("AdjustUpChannel");
		actionsList.add("AdjustDownChannel");
		actionsList.add("Next");
		actionsList.add("Previous");
		actionsList.add("AdjustDownVolume");
		actionsList.add("AdjustUpVolume");
		actionsList.add("SetWindSpeed");
		actionsList.add("AdjustUpWindSpeed");
		actionsList.add("AdjustDownWindSpeed");
		actionsList.add("OpenSwing");
		actionsList.add("CloseSwing");
		actionsList.add("SetMode");
		actionsList.add("CancelMode");
		actionsList.add("SetTemperature");
		actionsList.add("AdjustUpTemperature");
		actionsList.add("AdjustDownTemperature");
		return actionsList;
	}

	private static String[] actions = { "TurnOn", "TurnOff", "SelectChannel", "SetMute", "CancelMute", "Play", "Pause",
			"Continue", "SetBrightness", "AdjustUpBrightness", "AdjustDownBrightness", "SetColor", "OpenFunction",
			"CloseFunction", "Cancel", "AdjustUpVolume", "AdjustDownVolume", "AdjustUpChannel", "AdjustDownChannel",
			"Next", "Previous", "AdjustDownVolume", "AdjustUpVolume", "SetWindSpeed", "AdjustUpWindSpeed",
			"AdjustDownWindSpeed", "OpenSwing", "CloseSwing", "SetMode", "CancelMode", "SetTemperature",
			"AdjustUpTemperature", "AdjustDownTemperature" };
}
