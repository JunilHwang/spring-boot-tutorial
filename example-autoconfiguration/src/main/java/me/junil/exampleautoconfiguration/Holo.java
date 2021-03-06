/* Copyright (c) 2020 ZUM Internet, Inc.
 * All right reserved.
 * http://www.zum.com
 * This software is the confidential and proprietary information of ZUM
 * , Inc. You shall not disclose such Confidential Information and
 * shall use it only in accordance with the terms of the license agreement
 * you entered into with ZUM.
 *
 * Revision History
 * Author                    Date                     Description
 * ------------------       --------------            ------------------
 *   junil                2020-01-23
 */
package me.junil.exampleautoconfiguration;


public class Holo {
  String name;
  int howLong;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getHowLong() {
    return howLong;
  }

  public void setHowLong(int howLong) {
    this.howLong = howLong;
  }

  @Override
  public String toString() {
    return "Holo{" +
      "name='" + name + '\'' +
      ", howLong=" + howLong +
      '}';
  }
}