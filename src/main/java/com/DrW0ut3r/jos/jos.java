package com.DrW0ut3r.jos;

import com.DrW0ut3r.jos.proxy.IProxy;
import com.DrW0ut3r.jos.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
//todo change mod_id strings naar de reference value
@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME ,version = Reference.VERSION)
public class jos {
    @Mod.Instance(Reference.MOD_ID)
    public static  jos instance;

    @Mod.EventHandler()
    public void preinint(FMLPreInitializationEvent event){

    }
    @SidedProxy(clientSide = Reference.CLIENT,serverSide = Reference.SERVER)
    public static IProxy proxy;

    @Mod.EventHandler()
    public void Inint(FMLInitializationEvent event){

    }
    @Mod.EventHandler()
        public void postInit(FMLPostInitializationEvent event){
    }

}
