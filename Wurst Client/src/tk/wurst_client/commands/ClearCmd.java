/*
 * Copyright � 2014 - 2015 | Alexander01998 | All rights reserved.
 * 
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package tk.wurst_client.commands;

import net.minecraft.client.Minecraft;
import tk.wurst_client.commands.Cmd.Info;

@Info(help = "Clears the chat completely.", name = "clear", syntax = {})
public class ClearCmd extends Cmd
{
	@Override
	public void execute(String[] args) throws Error
	{
		if(args.length == 0)
			Minecraft.getMinecraft().ingameGUI.getChatGUI().clearChatMessages();
		else
			syntaxError();
	}
}
