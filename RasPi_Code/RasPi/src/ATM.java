// Copyright (C) 2018 David Pieper
// Code at this point prints out hello world but will at later points run actions or RaspberryPi
/*This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.

You should have received a copy of the GNU General Public License along with this program. If not, see https://www.gnu.org/licenses/.
To contact Writer send email to "david.pieper123@gmail.com"
To contact Writer over mail send mail to "725 Kothmann Rd, Dripping Springs, Texas, 78620"
*/
// imports required to run on raspberry pi, won't run on standard windows or linux based system

import com.pi4j.io.gpio.*;
import com.pi4j.io.gpio.event.*;
import com.pi4j.io.gpio.trigger.*;

public class ATM
{
   final GpioController gpio = GpioFactory.getInstance();
   final GpioPinDigitalInput num1 = gpio.provisionDigitalInputPin(RaspiPin.GPIO_02, PinPullResistance.PULL_DOWN);
   final GpioPinDigitalInput num2 = gpio.provisionDigitalInputPin(RaspiPin.GPIO_00, PinPullResistance.PULL_DOWN);
   final GpioPinDigitalInput num3 = gpio.provisionDigitalInputPin(RaspiPin.GPIO_01, PinPullResistance.PULL_DOWN);
   final GpioPinDigitalInput num4 = gpio.provisionDigitalInputPin(RaspiPin.GPIO_03, PinPullResistance.PULL_DOWN);
   final GpioPinDigitalInput num5 = gpio.provisionDigitalInputPin(RaspiPin.GPIO_04, PinPullResistance.PULL_DOWN);
   final GpioPinDigitalInput num6 = gpio.provisionDigitalInputPin(RaspiPin.GPIO_05, PinPullResistance.PULL_DOWN);
   final GpioPinDigitalInput num7 = gpio.provisionDigitalInputPin(RaspiPin.GPIO_06, PinPullResistance.PULL_DOWN);
   final GpioPinDigitalInput num8 = gpio.provisionDigitalInputPin(RaspiPin.GPIO_12, PinPullResistance.PULL_DOWN);
   final GpioPinDigitalInput num9 = gpio.provisionDigitalInputPin(RaspiPin.GPIO_13, PinPullResistance.PULL_DOWN);
   final GpioPinDigitalInput num0 = gpio.provisionDigitalInputPin(RaspiPin.GPIO_14, PinPullResistance.PULL_DOWN);
   final GpioPinDigitalInput Pound = gpio.provisionDigitalInputPin(RaspiPin.GPIO_10, PinPullResistance.PULL_DOWN);
   private String truePIN = "";
   // Here all of the buttons need to be added and declared
   public ATM()
   {
      System.out.println("Hello, thank you for using this ATM, \nPlease enter your pin:");
      System.out.println("Hit the pound key when done");
      private String transitPin = checkPIN();
      signIn(transitPin);
   }
   private static String checkPIN()
   {
      String PIN = "";
      While(true)
      {
         num1.addListener(new GpioPinListenerDigital() 
         {
            @Override
            public void handleGpioPinDigitalStateChangeEvent(GpioPinDigitalStateChangeEvent event) {
               if(event.getState == PinState.HIGH)
               {
                  PIN = PIN + "1";
               }      
         }
         num2.addListener(new GpioPinListenerDigital()
         {
            @Override
            public void handleGpioPinDigitalStateChangeEvent(GpioPinDigitalStateChangeEvent event) {
               if(event.getState == PinState.HIGH)
               {
                  PIN = PIN + "2";
               }
         }
         num3.addListener(new GpioPinListenerDigital() 
         {
            @Override
            public void handleGpioPinDigitalStateChangeEvent(GpioPinDigitalStateChangeEvent event) {
               if(event.getState == PinState.HIGH)
               {
                  PIN = PIN + "3";
               }
         }
         num4.addListener(new GpioPinListenerDigital()
         {
            @Override
            public void handleGpioPinDigitalStateChangeEvent(GpioPinDigitalStateChangeEvent event) {
               if(event.getState == PinState.HIGH)
               {
                  PIN = PIN + "4";
               }
         }
         num5.addListener(new GpioPinListenerDigital() 
         {
            @Override
            public void handleGpioPinDigitalStateChangeEvent(GpioPinDigitalStateChangeEvent event) {
               if(event.getState == PinState.HIGH)
               {
                  PIN = PIN + "5";
               }
         }
         num6.addListener(new GpioPinListenerDigital() 
         {
            @Override
            public void handleGpioPinDigitalStateChangeEvent(GpioPinDigitalStateChangeEvent event) {
               if(event.getState == PinState.HIGH)
               {
                  PIN = PIN + "6";
               }
         }
         num7.addListener(new GpioPinListenerDigital() 
         {
            @Override
            public void handleGpioPinDigitalStateChangeEvent(GpioPinDigitalStateChangeEvent event) {
               if(event.getState == PinState.HIGH)
               {
                  PIN = PIN + "7";
               }
         }
         num8.addListener(new GpioPinListenerDigital() 
         {
            @Override
            public void handleGpioPinDigitalStateChangeEvent(GpioPinDigitalStateChangeEvent event) {
               if(event.getState == PinState.HIGH)
               {
                  PIN = PIN + "8";
               }
         }
         num9.addListener(new GpioPinListenerDigital() 
         {
            @Override
            public void handleGpioPinDigitalStateChangeEvent(GpioPinDigitalStateChangeEvent event) {
               if(event.getState == PinState.HIGH)
               {
                  PIN = PIN + "9";
               }
         }
         num0.addListener(new GpioPinListenerDigital() 
         {
            @Override
            public void handleGpioPinDigitalStateChangeEvent(GpioPinDigitalStateChangeEvent event) {
               if(event.getState == PinState.HIGH)
               {
                  PIN = PIN + "0";
               }
         }
         Pound.addListener(new GpioPinListenerDigital() 
         {
            @Override
            public void handleGpioPinDigitalStateChangeEvent(GpioPinDigitalStateChangeEvent event) {
               if(event.getState == PinState.HIGH)
               {
                  break;
               }
         }
      }
      return PIN;
   }
   private static void signIn(String testPin)
   {
      // Reads entered PIN and
      // if correct leads you to main sign in screen.
      // If denied makes you enter your pin again
   }
}