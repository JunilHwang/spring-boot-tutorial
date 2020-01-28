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
package me.junil.exampleautoconfiguration;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(HoloProperties.class)
public class HoloConfiguration {

  @Bean
  @ConditionalOnMissingBean
  public Holo holo (HoloProperties properties) {
    Holo holo = new Holo();
    holo.setName(properties.getName());
    holo.setHowLong(properties.getHowLong());
    return holo;
  }
}