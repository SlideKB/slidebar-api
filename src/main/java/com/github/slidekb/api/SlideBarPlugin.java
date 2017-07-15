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

/**
 * @author JackSec
 */
public interface SlideBarPlugin {

    /**
     * returns the priority for the plugin
     * not currently used for anything yet
     * 
     * @return
     */
    public int getPriority();

    /**
     * name displayed in configuration window and main application.
     * 
     * @return
     */
    public String getLabelName();

    /**
     * Ran once when the plugin is loaded. Put code to initialize the plugin in this.
     */
    public void setup();

    /**
     * Ran once when the plugin is unloaded. Put code to save your plugin's settings or similar in here.
     */
    public void teardown();

    /**
     * Runs the main functions of this plugin
     */
    public void run();

    /**
     * Runs on process or hotkey change. used to set up run()
     */
    public void runFirst();

    /**
     * Injects the Slider at the set index
     * 
     * @param Slider
     */
    public void setSlider(Slider slider, int index);

    /**
     * The number of sliders this plugin needs
     * 
     * @return The number of sliders this plugin needs
     */
    public int numberOfSlidersRequired();
}
