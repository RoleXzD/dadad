package me.kaimson.MoonHook.features.modules;

import me.kaimson.MoonHook.features.*;
import me.kaimson.MoonHook.utils.*;
import java.awt.*;

public class ChatModule extends Module
{
    public static ChatModule INSTANCE;
    public final Setting color;
    public final Setting shadow;
    
    public ChatModule() {
        super("Chat");
        new Setting(this, "Style Options");
        this.color = new Setting(this, "Color").setDefault(new Color(0, 0, 0, 50).getRGB(), 0);
        this.shadow = new Setting(this, "Shadow").setDefault(true);
        ChatModule.INSTANCE = this;
    }
}
