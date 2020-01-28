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
 *   junil                2020-01-28
 */
package me.junil.exampleconfigclient;

import me.junil.exampleautoconfiguration.Holo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class HoloRunner implements ApplicationRunner {

  @Autowired
  Holo holo;

  @Override
  public void run(ApplicationArguments args) throws Exception {
    System.out.println(holo.toString());
  }
}