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
     * name displayed in master configuration window/ main application.
     * 
     * @return
     */
    public String getLabelName();

    /**
     * runs while exe current window or hotkey is being pressed
     */
    public void run();

    /**
     * runs on first .exe match or hotkeypress. used to set up run();
     */
    public void runFirst();

    /**
     * sets the SlideBar manager
     * 
     * @param sliderManager
     */
    public void setSlider(Slider slider);
}
