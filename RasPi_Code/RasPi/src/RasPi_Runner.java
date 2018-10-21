// Copyright (C) 2018 David Pieper
// Code at this point prints out hello world but will at later points run actions or RaspberryPi
/*This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.

You should have received a copy of the GNU General Public License along with this program. If not, see https://www.gnu.org/licenses/.
*/
// imports required to run on raspberry pi, won't run on standard windows or linux based system
import com.pi4j.io.gpio.*;
import com.pi4j.io.gpio.event.*;
import com.pi4j.io.gpio.trigger.*;
public class RasPi_Runner extends InterruptedException
{
    public static void main(String args[])
    {
        // Declaring class required for constructor
       new RasPi_Runner();
    }
    // Constructor making it easier to implement other classes
    public RasPi_Runner()
    {
        System.out.println("Welcome, \nPlease hit any button and predict the result!");
    }
}