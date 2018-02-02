/* 
 * Copyright 2018 Key Bridge.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package gov.niem.release.niem.niem_core;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "DayOfWeekCodeSimpleType")
@XmlEnum
public enum DayOfWeekCodeSimpleType {

  FRI,

  MON,

  SAT,

  SUN,

  THU,

  TUE,

  WED;

  public String value() {
    return name();
  }

  public static DayOfWeekCodeSimpleType fromValue(String v) {
    return valueOf(v);
  }

}
