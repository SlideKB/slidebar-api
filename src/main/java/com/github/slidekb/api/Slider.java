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

public interface Slider {

    public void bumpRight(int milliseconds);

    public void bumpLeft(int milliseconds);

    public void writeUntilComplete(int given);

    public void writeUntilComplete(double given);

    public void writeUntilComplete(String given);

    public void write(int given);

    public void goToPart(int index);

    public void goToPartComplete(int index);

    public void goToPartComplete(int index, int numberOfParts);

    public int readPart(int numberOfParts);

    public int read();

    public void createParts(int numberOfParts);

    public int getPartIndex();

    public int getPartIndex(int numberOfParts);

    public void removeParts();

    public void shiftRight(int distance);

    public void shiftLeft(int distance);

    public void vibrate(int amount);

    public void scrollUp(int amount);

    public void scrollDown(int amount);

    public int getVirtualPartIndex(int parts);

    public void close();

    public void setReversed(boolean slider1Reversed);

    public String getID();
}
