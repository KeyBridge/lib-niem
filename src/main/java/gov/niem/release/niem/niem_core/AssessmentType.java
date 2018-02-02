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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssessmentType", propOrder = {
  "assessmentAssessor",
  "assessmentScoreText",
  "assessmentFee",
  "assessmentProgram",
  "assessmentReferral",
  "assessmentPerson",
  "assessmentAugmentationPoint"
})
public class AssessmentType
  extends ActivityType {

  @XmlElement(name = "AssessmentAssessor", nillable = true)
  protected List<EntityType> assessmentAssessor;
  @XmlElement(name = "AssessmentScoreText", nillable = true)
  protected List<TextType> assessmentScoreText;
  @XmlElement(name = "AssessmentFee", nillable = true)
  protected List<ObligationType> assessmentFee;
  @XmlElement(name = "AssessmentProgram", nillable = true)
  protected List<ProgramType> assessmentProgram;
  @XmlElement(name = "AssessmentReferral", nillable = true)
  protected List<ReferralType> assessmentReferral;
  @XmlElement(name = "AssessmentPerson", nillable = true)
  protected List<PersonType> assessmentPerson;
  @XmlElement(name = "AssessmentAugmentationPoint")
  protected List<Object> assessmentAugmentationPoint;

  public List<EntityType> getAssessmentAssessor() {
    if (assessmentAssessor == null) {
      assessmentAssessor = new ArrayList<EntityType>();
    }
    return this.assessmentAssessor;
  }

  public List<TextType> getAssessmentScoreText() {
    if (assessmentScoreText == null) {
      assessmentScoreText = new ArrayList<TextType>();
    }
    return this.assessmentScoreText;
  }

  public List<ObligationType> getAssessmentFee() {
    if (assessmentFee == null) {
      assessmentFee = new ArrayList<ObligationType>();
    }
    return this.assessmentFee;
  }

  public List<ProgramType> getAssessmentProgram() {
    if (assessmentProgram == null) {
      assessmentProgram = new ArrayList<ProgramType>();
    }
    return this.assessmentProgram;
  }

  public List<ReferralType> getAssessmentReferral() {
    if (assessmentReferral == null) {
      assessmentReferral = new ArrayList<ReferralType>();
    }
    return this.assessmentReferral;
  }

  public List<PersonType> getAssessmentPerson() {
    if (assessmentPerson == null) {
      assessmentPerson = new ArrayList<PersonType>();
    }
    return this.assessmentPerson;
  }

  public List<Object> getAssessmentAugmentationPoint() {
    if (assessmentAugmentationPoint == null) {
      assessmentAugmentationPoint = new ArrayList<Object>();
    }
    return this.assessmentAugmentationPoint;
  }

}
