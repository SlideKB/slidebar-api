/**
 Copyright 2017 John Kester (Jack Kester)

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */

package com.github.slidekb.api;

import javax.swing.JFrame;

/**
 * @author JackSec
 */
public interface SlideBarPlugin {

    /**
     * returns the priority for the plugin
     * not currently used for anything yet
     * @return
     */
    public int getPriority();

    /**
     * returns either the .exe names or a "toString form of hotkeys" in a list.
     * 
     * @return
     */
    public String[] getProcessNames();

    /**
     * If true, this plugin uses process names. If false, this plugin uses hotkeys.
     * 
     * @return true if processes, false otherwise
     */
    public boolean usesProcessNames();
    
    /**
     * name displayed in master configuration window/ main application.
     * 
     * @return
     */
    public String getLabelName();

    /**
     * runs while exe current window or hotkey is being pressed
     * 
     * @param process
     */
    public void run(String process);
    
    /**
     * runs on first .exe match or hotkeypress. used to set up run();
     * 
     * @param process
     */
    public void runFirst(String process);

    /**
     * returns configuration window.
     * optional for now
     * @return
     */
    public JFrame getConfigWindow();

    

    public JFrame getProcessWindow();

    /**
     * reloads the property file or whatever file needed when this runs
     * 
     */
    public void reloadPropFile();

    /**
     * sets the alpha key manager
     * optional
     * @param alphaKeyManager
     */
    public void setAlphaKeyManager(AlphaKeyManager alphaKeyManager);

    /**
     * sets the hot key manager
     * optional
     * @param hotKeyManager
     */
    public void setHotKeyManager(HotKeyManager hotKeyManager);
    
    /**
     * sets the SlideBar manager
     * @param sliderManager
     */
	public void setSliderManager(SliderManager sliderManager);
}
