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
package gov.niem.release.niem.codes.census_commodity;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {

  public ObjectFactory() {
  }

  public ConveyanceCategoryCodeType createConveyanceCategoryCodeType() {
    return new ConveyanceCategoryCodeType();
  }

  public MachineryCategoryCodeType createMachineryCategoryCodeType() {
    return new MachineryCategoryCodeType();
  }

  public ElectronicInstrumentCategoryCodeType createElectronicInstrumentCategoryCodeType() {
    return new ElectronicInstrumentCategoryCodeType();
  }

  public ElectronicEquipmentCategoryCodeType createElectronicEquipmentCategoryCodeType() {
    return new ElectronicEquipmentCategoryCodeType();
  }

}
