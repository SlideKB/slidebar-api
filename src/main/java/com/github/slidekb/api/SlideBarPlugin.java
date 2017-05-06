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
     * 
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
     * Returns the currently used slider ID, or null for default slider.
     * 
     * @return currently used slider ID, or null for default slider
     */
    public String currentlyUsedSlider();

    public void attachToProcess(String processName);

    public void detachFromProcess(String processName);

    /**
     * runs while exe current window or hotkey is being pressed
     * 
     * @param process
     */
    public void run(String process);

    /**
     * returns configuration window.
     * 
     * @return
     */
    public JFrame getConfigWindow();

    /**
     * runs on first .exe match or hotkeypress. used to set up run();
     * 
     * @param process
     */
    public void runFirst(String process);

    /**
     * name displayed in master configuration window/ main application.
     * 
     * @return
     */
    public String getLabelName();

    public JFrame getProcessWindow();

    public void reloadPropFile();

    public void setAlphaKeyManager(AlphaKeyManager alphaKeyManager);

    public void setHotKeyManager(HotKeyManager hotKeyManager);

    public void setSlider(Slider slider);

	public void setSliderManager(SliderManager sliderManager);
}
