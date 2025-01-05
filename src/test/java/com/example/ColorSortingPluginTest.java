package com.colorsorting;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class ColorSortingPluginTest {
	public static void main(String[] args) throws Exception {
		ExternalPluginManager.loadBuiltin(ColorSortingPlugin.class);
		RuneLite.main(args);
	}
}