package com.colorsorting;

import com.colorsorting.ColorSortingPlugin;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class ColorSortingPluginTest {
	public static void main(String[] args) throws Exception {
		ExternalPluginManager.loadBuiltin(ColorSortingPlugin.class);
		RuneLite.main(args);
	}
}