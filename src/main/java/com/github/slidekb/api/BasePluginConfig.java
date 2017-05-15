package com.github.slidekb.api;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

import javax.swing.JFrame;

import org.aeonbits.owner.Accessible;
import org.aeonbits.owner.Config;
import org.aeonbits.owner.Mutable;
import org.aeonbits.owner.Config.DefaultValue;
import org.aeonbits.owner.ConfigFactory;

public class BasePluginConfig {
	
	private String path;
	
	private String type;
	
	private boolean disabled;
	
	private String slider1ID = "default";
	
	private String slider2ID = "default2";
	
	private String slider3ID = "default3";
	
	private String slider4ID = "default4";
	
	private boolean slider1Reversed;
	
	private boolean slider2Reversed;
	
	private boolean slider3Reversed;
	
	private boolean slider4Reversed;
	
	List<String> attachedProcesses = new ArrayList<>();
	
	private String[] hotkeys;

	private ThisConfig cfg;
			
	/**
	 * type is either "process", "hotkey", or "always"
	 * @param path
	 * @param type
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public BasePluginConfig(File file, String type) throws FileNotFoundException, IOException{
		this.path = file.getAbsolutePath();
		this.type = type;
		Properties props = new Properties();
		props.load(new FileInputStream(file));
		cfg = ConfigFactory.create(ThisConfig.class, props);
	}
	
//	@Config.Sources({ "classpath:configs/Scroller.properties" })
    private interface ThisConfig extends Accessible, Mutable {
    	@DefaultValue("default")
    	String slider1ID();
    	
    	@DefaultValue("default2")
    	String slider2ID();
    	
    	@DefaultValue("default3")
    	String slider3ID();
    	
    	@DefaultValue("default4")
    	String slider4ID();
    	
    	@DefaultValue("false")
    	boolean slider1Reversed();
    	
    	@DefaultValue("false")
    	boolean slider2Reversed();
    	
    	@DefaultValue("false")
    	boolean slider3Reversed();
    	
    	@DefaultValue("false")
    	boolean slider4Reversed();
    	
        String[] processList();
        
        String type();
        
        boolean disabled();
    	
    }
	
	public void reloadConfig() throws IOException{
        FileInputStream in = new FileInputStream(path);
        cfg.load(in);
        in.close();
        attachedProcesses = new ArrayList<>(Arrays.asList(cfg.processList()));
        slider1ID = cfg.slider1ID();
        slider2ID = cfg.slider2ID();
        slider3ID = cfg.slider3ID();
        slider4ID = cfg.slider4ID();
        slider1Reversed = cfg.slider1Reversed();
        slider2Reversed = cfg.slider2Reversed();
        slider3Reversed = cfg.slider3Reversed();
        slider4Reversed = cfg.slider4Reversed();
        type = cfg.type();
        disabled = cfg.disabled();
        System.out.println(path + " reload complete");
	}
	
	public JFrame displayBaseConfigs(){
		//TODO retun the base configuration window that all plugins use.
		return null;
	}
	
	public boolean isEnabled(){
		return !disabled;
	}
	
	public String[] getProcessNames() {
        return attachedProcesses.toArray(new String[attachedProcesses.size()]);
    }
	
	public String[] getHotkeys(){
		return hotkeys;
	}
	
	public String getSlider1ID(){
		return slider1ID;
	}
	
	public boolean isSlider1Reversed(){
		return slider1Reversed;
	}
	
	
}
