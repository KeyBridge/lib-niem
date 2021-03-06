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
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "SupervisionRestrictionCodeSimpleType")
@XmlEnum
public enum SupervisionRestrictionCodeSimpleType {

  ABSCONDING("ABSCONDING"),

  ALCOHOL("ALCOHOL"),

  @XmlEnumValue("ALCOHOL ESTABLISHMNT")
  ALCOHOL_ESTABLISHMNT("ALCOHOL ESTABLISHMNT"),

  @XmlEnumValue("ARREST-CITATIONS")
  ARREST_CITATIONS("ARREST-CITATIONS"),

  ASSOCIATION("ASSOCIATION"),

  @XmlEnumValue("CHEMICAL ANALYSIS")
  CHEMICAL_ANALYSIS("CHEMICAL ANALYSIS"),

  @XmlEnumValue("CHILDREN CONGREGATE")
  CHILDREN_CONGREGATE("CHILDREN CONGREGATE"),

  @XmlEnumValue("CHILDREN UNDER 18")
  CHILDREN_UNDER_18("CHILDREN UNDER 18"),

  CONDUCT("CONDUCT"),

  CURFEW("CURFEW"),

  @XmlEnumValue("DISCONNECT PHONE")
  DISCONNECT_PHONE("DISCONNECT PHONE"),

  DNA("DNA"),

  @XmlEnumValue("DOCUMENTS/DATA/PHOTO")
  DOCUMENTS_DATA_PHOTO("DOCUMENTS/DATA/PHOTO"),

  @XmlEnumValue("DRIVER LICENSE/ID")
  DRIVER_LICENSE_ID("DRIVER LICENSE/ID"),

  DRUGS("DRUGS"),

  @XmlEnumValue("ELECTRONIC MONITOR")
  ELECTRONIC_MONITOR("ELECTRONIC MONITOR"),

  EMPLOYMENT("EMPLOYMENT"),

  @XmlEnumValue("EMPLOYMENT VERIFY")
  EMPLOYMENT_VERIFY("EMPLOYMENT VERIFY"),

  @XmlEnumValue("ENTERTAIN/LURE")
  ENTERTAIN_LURE("ENTERTAIN/LURE"),

  @XmlEnumValue("EXPLOIT MATERIAL")
  EXPLOIT_MATERIAL("EXPLOIT MATERIAL"),

  FEES("FEES"),

  @XmlEnumValue("FINANCIAL AGREEMENT")
  FINANCIAL_AGREEMENT("FINANCIAL AGREEMENT"),

  @XmlEnumValue("FIREARM/AMMUITION")
  FIREARM_AMMUITION("FIREARM/AMMUITION"),

  @XmlEnumValue("FIREARMS USED")
  FIREARMS_USED("FIREARMS USED"),

  @XmlEnumValue("FREQUENT GANG PLACES")
  FREQUENT_GANG_PLACES("FREQUENT GANG PLACES"),

  @XmlEnumValue("FREQUENT SCHOOLS")
  FREQUENT_SCHOOLS("FREQUENT SCHOOLS"),

  @XmlEnumValue("GANG MEMBERS")
  GANG_MEMBERS("GANG MEMBERS"),

  @XmlEnumValue("GED/DIPLOMA")
  GED_DIPLOMA("GED/DIPLOMA"),

  @XmlEnumValue("HMU ABUSE")
  HMU_ABUSE("HMU ABUSE"),

  @XmlEnumValue("HMU MOVE")
  HMU_MOVE("HMU MOVE"),

  @XmlEnumValue("HOME VISITS")
  HOME_VISITS("HOME VISITS"),

  @XmlEnumValue("INSIGNIAS/EMBLEMS")
  INSIGNIAS_EMBLEMS("INSIGNIAS/EMBLEMS"),

  @XmlEnumValue("INTERSTATE COMPACT")
  INTERSTATE_COMPACT("INTERSTATE COMPACT"),

  @XmlEnumValue("LAW ENFORCE CONTACT")
  LAW_ENFORCE_CONTACT("LAW ENFORCE CONTACT"),

  @XmlEnumValue("LEAVE COUNTY")
  LEAVE_COUNTY("LEAVE COUNTY"),

  @XmlEnumValue("MONTHLY PAYMENTS")
  MONTHLY_PAYMENTS("MONTHLY PAYMENTS"),

  @XmlEnumValue("NO ALCOHOL")
  NO_ALCOHOL("NO ALCOHOL"),

  @XmlEnumValue("NO CONTACT W/VICTM")
  NO_CONTACT_W_VICTM("NO CONTACT W/VICTM"),

  @XmlEnumValue("NOT AT COURT")
  NOT_AT_COURT("NOT AT COURT"),

  @XmlEnumValue("NOT DATE")
  NOT_DATE("NOT DATE"),

  PAGER("PAGER"),

  @XmlEnumValue("PAINT/PENS")
  PAINT_PENS("PAINT/PENS"),

  @XmlEnumValue("PHONE SERVICES")
  PHONE_SERVICES("PHONE SERVICES"),

  POLYGRAPH("POLYGRAPH"),

  PORNOGRAPHY("PORNOGRAPHY"),

  @XmlEnumValue("PROVIDE PHONE LINE")
  PROVIDE_PHONE_LINE("PROVIDE PHONE LINE"),

  @XmlEnumValue("REGISTRATION/DNA")
  REGISTRATION_DNA("REGISTRATION/DNA"),

  RELEASE("RELEASE"),

  REPORTING("REPORTING"),

  RESIDENCE("RESIDENCE"),

  SEARCHES("SEARCHES"),

  @XmlEnumValue("SEX STIMULUS MATERIA")
  SEX_STIMULUS_MATERIA("SEX STIMULUS MATERIA"),

  @XmlEnumValue("SIGNS/GESTURES")
  SIGNS_GESTURES("SIGNS/GESTURES"),

  SPECIAL("SPECIAL"),

  @XmlEnumValue("STOLEN VEHICLE")
  STOLEN_VEHICLE("STOLEN VEHICLE"),

  @XmlEnumValue("SUBSTANCE TESTING")
  SUBSTANCE_TESTING("SUBSTANCE TESTING"),

  @XmlEnumValue("SUPERVISION FEE")
  SUPERVISION_FEE("SUPERVISION FEE"),

  THERAPY("THERAPY"),

  @XmlEnumValue("TREATMENT/COUNSELING")
  TREATMENT_COUNSELING("TREATMENT/COUNSELING"),

  TRUTHFULNESS("TRUTHFULNESS"),

  UNEMPLOYED("UNEMPLOYED"),

  VEHICLE("VEHICLE"),

  @XmlEnumValue("VICIOUS DOGS")
  VICIOUS_DOGS("VICIOUS DOGS"),

  @XmlEnumValue("VICTIM CONTACT")
  VICTIM_CONTACT("VICTIM CONTACT"),

  VISITS("VISITS"),

  WEAPONS("WEAPONS");
  private final String value;

  SupervisionRestrictionCodeSimpleType(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static SupervisionRestrictionCodeSimpleType fromValue(String v) {
    for (SupervisionRestrictionCodeSimpleType c : SupervisionRestrictionCodeSimpleType.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
